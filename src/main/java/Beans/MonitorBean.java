package Beans;

import Modelo.Grupo;
import Modelo.Monitor;
import Modelo.Semestre;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean(name = "Monitor")
@SessionScoped
public class MonitorBean implements Serializable {

    private ServicioAsesoria sa = Fabrica.getInstance().getServiciosAsesoria();
    
    private String console;
    private Monitor monitor;
    private boolean monitoriaIniciada=false;
    private ArrayList<Grupo> grupos;
    private Grupo grupoSeleccionado;

    private String horaInicioMonitoria;
    private String horaFinMonitoria;

    private String car;
    private List<SelectItem> cars;

    private String city;
    private Map<String, String> cities = new HashMap<String, String>();

    private String profesor;
    private List<String> profesores;

    private String curso;
    private List<String> cursos;

    public void MonitorBean() {
        //cars
        System.out.println("LLENADO");

        //cursos
        cursos = new ArrayList<String>();
        cursos.add("PDSW");
        cursos.add("TPRO");
        cursos.add("TCOM");
        cursos.add("MDIS");
        cursos.add("ARQC");
        cursos.add("SOPC");
        //profesor
        profesores = new ArrayList<String>();
        profesores.add("Nesol Mandela");
        profesores.add("Ghandi");
        profesores.add("Martin Luther King");
        profesores.add("Atila El Huno");
        profesores.add("Teresa de Calcuta");
        profesores.add("Alan Turing");
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }



    public Grupo getGrupoSeleccionado() {
        
        return grupoSeleccionado;
    }

    public void setGrupoSeleccionado(Grupo grupoSeleccionado) {
        System.out.println("dwferwf");
        this.grupoSeleccionado = grupoSeleccionado;
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
        monitoriaIniciada=true;
        horaInicioMonitoria = new String();
        Calendar calendario = new GregorianCalendar();
        horaInicioMonitoria += Integer.toString(calendario.get(Calendar.HOUR_OF_DAY))+" : " ;
        horaInicioMonitoria +=Integer.toString(calendario.get(Calendar.MINUTE))+" : " ;
        horaInicioMonitoria +=Integer.toString(calendario.get(Calendar.SECOND)) ;
        Date fechaMonitoria = new Date(calendario.get(Calendar.YEAR), calendario.get(Calendar.MONTH), calendario.get(Calendar.DAY_OF_MONTH));
    }
    
    public void botonFinalizarAsesoria() {
        monitoriaIniciada=false;
        horaFinMonitoria = new String();
        Calendar calendario = new GregorianCalendar();
        horaFinMonitoria += Integer.toString(calendario.get(Calendar.HOUR_OF_DAY))+" : " ;
        horaFinMonitoria +=Integer.toString(calendario.get(Calendar.MINUTE))+" : " ;
        horaFinMonitoria +=Integer.toString(calendario.get(Calendar.SECOND)) ;
    }
    public void setMonitor(Monitor m){
        this.monitor=m;
        
    }

}