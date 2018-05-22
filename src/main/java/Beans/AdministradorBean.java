package Beans;

import Modelo.Administrador;
import Modelo.Curso;
import Modelo.Monitor;
import Modelo.Semestre;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean(name = "Administrador")
@SessionScoped
public class AdministradorBean implements Serializable {

    private ServicioAsesoria sa = Fabrica.getInstance().getServiciosAsesoria();
    private Administrador administrador;
    private List<Curso> cursos;
    private Curso cursoSeleccionado;
    private Semestre semestreSeleccionado;
    private List<Semestre> semestres;
    private String codNuevoCurso;
    private String nombreNuevoCurso;
    private int horasAprovadasNuevoCurso;
    private int creditosNuevoCurso;
    private  List<String> temasCursoNuevo;
    private List<Curso> cursosFiltrados;
    private Curso cursoSeleccionadoTablaFiltrado;

    public void AdministradorBean() {

    }

    public Curso getCursoSeleccionadoTablaFiltrado() {
        return cursoSeleccionadoTablaFiltrado;
    }

    public void setCursoSeleccionadoTablaFiltrado(Curso cursoSeleccionadoTablaFiltrado) {
        System.out.println("entrooooooooooooooooooo");
        this.cursoSeleccionadoTablaFiltrado = cursoSeleccionadoTablaFiltrado;
    }

    public List<Curso> getCursosFiltrados() {
        return cursosFiltrados;
    }

    public void setCursosFiltrados(List<Curso> cursosFiltrados) {
        this.cursosFiltrados = cursosFiltrados;
    }

    public List<String> getTemasCursoNuevo() {
        return temasCursoNuevo;
    }

    public void setTemasCursoNuevo(List<String> temasCursoNuevo) {
        this.temasCursoNuevo = temasCursoNuevo;
    }

    public String getCodNuevoCurso() {
        return codNuevoCurso;
    }

    public void setCodNuevoCurso(String codNuevoCurso) {
        this.codNuevoCurso = codNuevoCurso.toUpperCase();
    }

    public String getNombreNuevoCurso() {
        return nombreNuevoCurso;
    }

    public void setNombreNuevoCurso(String nombreNuevoCurso) {
        this.nombreNuevoCurso = nombreNuevoCurso.toUpperCase();
    }

    public int getHorasAprovadasNuevoCurso() {
        return horasAprovadasNuevoCurso;
    }

    public void setHorasAprovadasNuevoCurso(int horasAprovadosNuevoCurso) {
        this.horasAprovadasNuevoCurso = horasAprovadosNuevoCurso;
    }

    public int getCreditosNuevoCurso() {
        return creditosNuevoCurso;
    }

    public void setCreditosNuevoCurso(int creditosNuevoCurso) {
        this.creditosNuevoCurso = creditosNuevoCurso;
    }

    public List<Curso> getCursos() {
        return sa.loadCursos();
    }

    public Curso getCursoSeleccionado() {
        return cursoSeleccionado;
    }

    public void setCursoSeleccionado(Curso cursoSeleccionado) {
        this.cursoSeleccionado = cursoSeleccionado;
    }

    public Semestre getSemestreSeleccionado() {
        return semestreSeleccionado;
    }

    public void setSemestreSeleccionado(Semestre semestreSeleccionado) {
        this.semestreSeleccionado = semestreSeleccionado;
    }

    public List<Semestre> getSemestres() {
        return sa.loadSemestres();
    }

    public void setSemestres(List<Semestre> semestres) {
        this.semestres = semestres;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public void crearCurso() {
        boolean error=false;
        try {
            sa.crearCurso(codNuevoCurso, nombreNuevoCurso, creditosNuevoCurso, horasAprovadasNuevoCurso);
            if(temasCursoNuevo!=null && temasCursoNuevo.size()>0){
                for(String s:temasCursoNuevo){
                    sa.crearTema(codNuevoCurso, s, s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            error=true;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al crear curso", "Revise si el curso ya existe y que los datos sean validos"));
        }
        if(!error){FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Operacion exitosa","Curso creado exitosamente"));}
        codNuevoCurso = null;
        nombreNuevoCurso = null;
        horasAprovadasNuevoCurso = 0;
        creditosNuevoCurso = 0;
        temasCursoNuevo=null;
    }

}
