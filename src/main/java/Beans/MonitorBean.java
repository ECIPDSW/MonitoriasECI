package Beans;

import Modelo.Grupo;
import Modelo.Monitor;
import Modelo.Monitoria;
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
        } else {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"No esta en su franja de monitoria", "Actualmente usted no tiene registrada ninguna monitoria para dictar."));
        }
    }

    public void botonFinalizarAsesoria() {
        sa.registrarFinMonitoria(monitor.getId());
    }

    public void setMonitor(Monitor m) {
        this.monitor = m;

    }

}
