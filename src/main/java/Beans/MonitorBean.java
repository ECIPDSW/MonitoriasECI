package Beans;

import Modelo.Asesoria;
import Modelo.Curso;
import Modelo.Grupo;
import Modelo.Monitor;
import Modelo.Monitoria;
import Modelo.MonitoriaRegistrada;
import Modelo.Semestre;
import Modelo.TemaCurso;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name = "Monitor")
@SessionScoped
public class MonitorBean implements Serializable {

    private ServicioAsesoria sa = Fabrica.getInstance().getServiciosAsesoria();

    private String console;
    private Monitor monitor;
    private Monitoria monitoriaEnCurso;
    private boolean monitoriaIniciada = false;
    

    private String horaInicioMonitoria;
    private String horaFinMonitoria;

  
    private String estudiante;
    private String profesor;
    private List<String> profesores;

    private String curso;
    private List<String> cursos;
    
    private Map<String,Grupo> grupos = new HashMap<>();
    private Map<String,String>gruposs = new HashMap<>();
    private Grupo grupo;
    private String gruponame="";
    
    private Map<String,TemaCurso> temas = new HashMap<>();
    private List<String> temass = new ArrayList<>();
    private TemaCurso tema;
    private String temaname="";
    private List<TemaCurso> selectedTemas = new ArrayList<>();
    private String[] selectedTemase= new String[100];
    private List<Asesoria> aencurso= new ArrayList<>();
    public void MonitorBean() {

    }

 
    public Map<String, String> getGrupos() {
        //System.out.println("LLAMADOG");
        return gruposs;
    }
    public void setGrupo(String name){
        //System.out.println("LLAMADOGS");
        this.gruponame=name;
        grupo=grupos.get(name);
    }
    public String getGrupo(){
        return gruponame;
    }

 
    public String getGrupoName(){
        return gruponame;
    }
    public void setGrupoName(String name){
            grupo=grupos.get(name);
        this.gruponame=name;
    }
    

    public String getMonitoriaIniciada() {

        return String.valueOf(monitoriaIniciada);
    }

    public void setMonitoriaIniciada(boolean monitoriaIniciada) {
        this.monitoriaIniciada = monitoriaIniciada;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public List<String> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<String> profesores) {
        this.profesores = profesores;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    public void botonIniciarAsesoria() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        System.out.println(ipAddress);
        monitoriaEnCurso = sa.monitoriasDisponiblesParaDictar(monitor.getId());
        if (monitoriaEnCurso != null) {
            monitoriaIniciada = true;
            sa.registrarInicioMonitoriaDictada(monitoriaEnCurso.getIdMonitoria(), ipAddress);
            Gruposmonitoriaactual();
            TemasCursoactual();
            Asesoriasactuales();
        } else {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"No esta en su franja de monitoria", "Actualmente usted no tiene registrada ninguna monitoria para dictar."));
        }
    }

    public void botonFinalizarAsesoria() {
        sa.registrarFinMonitoria(monitor.getId());
        monitoriaEnCurso=null;
        monitoriaIniciada=false;
    }

    public void setMonitor(Monitor m) {
        this.monitor = m;
    }
    
    public void Asesoriasactuales(){
        List<MonitoriaRegistrada> mr=sa.loadMonitoriasRegistradasPorMonitoria(monitoriaEnCurso.getIdMonitoria());
        MonitoriaRegistrada mre = mr.get(mr.size()-1);
        aencurso=sa.loadAsesoriasRealizandosePorMonitoriaRegistrada(mre.getIdMonitoria());
    
    }
    public void monitoring() throws IOException{
        if(monitoriaEnCurso== null){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"No esta en su franja de monitoria", "Actualmente usted no tiene registrada ninguna monitoria para dictar."));
 
            FacesContext.getCurrentInstance().getExternalContext().redirect("/monitorias/InicioMonitoria.xhtml");
            
        }
    }
    public void redirected(){
        if(monitoriaEnCurso== null){
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Usted no ha iniciado su monitoria", "Actualmente usted no tiene iniciada ninguna monitoria para dictar."));
        }
    }
    public void Gruposmonitoriaactual(){
        Curso c=sa.loadCursoPorMonitoria(monitoriaEnCurso.getIdMonitoria());
        List<Grupo> gr =sa.loadGrupos(c.getId(), sa.loadSemestreActual().getNumero());

        for(int i=0;i<gr.size();i++){
            grupos.put(gr.get(i).getCurso().getNombre()+""+gr.get(i).getNumero(),gr.get(i));
            gruposs.put(gr.get(i).getCurso().getNombre()+""+gr.get(i).getNumero(),gr.get(i).getCurso().getNombre()+""+gr.get(i).getNumero());
        }

    }
    public void TemasCursoactual(){
        Curso c=sa.loadCursoPorMonitoria(monitoriaEnCurso.getIdMonitoria());
        List<TemaCurso> tem=sa.loadTemasCurso(c.getId());
        System.out.println("TEMAAAS"+tem.size());
        for(int i=0;i<tem.size();i++){
            temass.add(tem.get(i).getTema());
            temas.put(tem.get(i).getTema(), tem.get(i));
        }
    }
    public List<String> getTemas() {
        return temass;
    }
    
    public void setSelectedTemas(String[] selectedTemass) {
        selectedTemase=selectedTemass;
        for (String a:selectedTemass){
            selectedTemas.add(temas.get(a));
        }
    }
    public String[] getSelectedTemas() {
        return selectedTemase;
    }
    
    public void botonRegistrarAsesoria() {
        List<MonitoriaRegistrada> mr=sa.loadMonitoriasRegistradasPorMonitoria(monitoriaEnCurso.getIdMonitoria());
        MonitoriaRegistrada mre = mr.get(mr.size()-1);
        sa.registrarAsesoria(grupo.getIdGrupo(),mre.getIdMonitoria(), Integer.parseInt(estudiante));
        estudiante="";
        grupo=null;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
        
    }

    public List<Asesoria> getAencurso() {
        List<MonitoriaRegistrada> mr=sa.loadMonitoriasRegistradasPorMonitoria(monitoriaEnCurso.getIdMonitoria());
        MonitoriaRegistrada mre = mr.get(mr.size()-1);
        aencurso=sa.loadAsesoriasRealizandosePorMonitoriaRegistrada(mre.getIdMonitoria());
        return aencurso;
    }

    public void setAencurso(List<Asesoria> aencurso) {
        this.aencurso = aencurso;
    }
    
    
}
