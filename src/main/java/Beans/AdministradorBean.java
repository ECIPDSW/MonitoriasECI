package Beans;

import Modelo.Administrador;
import Modelo.Asesoria;
import Modelo.Curso;
import Modelo.Monitor;
import Modelo.Semestre;
import Modelo.TemaCurso;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;
import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.list;
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
    private List<String> temasCursoNuevo;
    private List<Curso> cursosFiltrados;
    private Curso cursoSeleccionadoTablaFiltrado;
    private String idCursoAnterior;
    private String idCursoaEditar;
    private String nombreCursoaEditar;
    private int horasMonCursoaEditar;
    private int creditosCursoaEditar;
    private List<String> temasCursoaEditar;
 

    public void AdministradorBean() {
        
    }

    public List<String> getTemasCursoaEditar() {
        return temasCursoaEditar;
    }

    public void setTemasCursoaEditar(List<String> temasCursoaEditar) {
        this.temasCursoaEditar = temasCursoaEditar;
    }

    public String getIdCursoaEditar() {
        return idCursoaEditar;
    }

    public void setIdCursoaEditar(String idCursoaEditar) {
        this.idCursoaEditar = idCursoaEditar;
    }

    public String getNombreCursoaEditar() {
        return nombreCursoaEditar;
    }

    public void setNombreCursoaEditar(String nombreCursoaEditar) {
        this.nombreCursoaEditar = nombreCursoaEditar;
    }

    public int getHorasMonCursoaEditar() {
        return horasMonCursoaEditar;
    }

    public void setHorasMonCursoaEditar(int horasMonCursoaEditar) {
        this.horasMonCursoaEditar = horasMonCursoaEditar;
    }

    public int getCreditosCursoaEditar() {
        return creditosCursoaEditar;
    }

    public void setCreditosCursoaEditar(int creditosCursoaEditar) {
        this.creditosCursoaEditar = creditosCursoaEditar;
    }

    public String getIdCursoAnterior() {
        return idCursoAnterior;
    }

    public void setIdCursoAnterior(String idCursoAnterior) {
        this.idCursoAnterior = idCursoAnterior;
    }

    public Curso getCursoSeleccionadoTablaFiltrado() {
        return cursoSeleccionadoTablaFiltrado;
    }

    public void setCursoSeleccionadoTablaFiltrado(Curso c) {
        this.cursoSeleccionadoTablaFiltrado = c;
        List<TemaCurso> temas = c.getTemas();
        temasCursoaEditar = new ArrayList<String>();
        idCursoaEditar = c.getId();
        nombreCursoaEditar = c.getNombre();
        horasMonCursoaEditar = c.getHorasAprobadasMonitoria();
        creditosCursoaEditar = c.getCreditosAcademicos();
        for (TemaCurso t : temas) {
            temasCursoaEditar.add(t.getTema().toUpperCase());
        }
        setIdCursoAnterior(c.getId());

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
    
   
    public int totalAsistentes(){
        List<Asesoria> asesorias = sa.loadAsesorias(sa.loadSemestreActual().getNumero());
        int total= 0;
        for(int i=0;i<asesorias.size();i++){
            total+=1;
        }
        return total;
        
    }
    
    public int totalMonitories(){
        List<Monitor> monitores;
        return 0;
    }
    
    public int porcentajeOcupacion(){
        return 0;
    }
    
    public int promedioAsistencias(){
        return 0;
    }
    

    public void modificarCursoSeleccionado() {

        try {
            sa.modificarCurso(idCursoAnterior.toUpperCase(), idCursoaEditar.toUpperCase(), nombreCursoaEditar.toUpperCase(), creditosCursoaEditar, horasMonCursoaEditar);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al modificar curso", "Revise que los datos sean validos"));
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Operacion exitosa","Curso editado exitosamente"));

    }
    
     public void eliminarCursoSeleccionado() {

        try {
            sa.eliminarCurso(idCursoAnterior);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al eliminar curso", "Se ha precentado un error al intentar eliminar el curso."));
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Operacion exitosa","Curso eliminado exitosamente"));

    }
    public void crearCurso() {
        boolean error = false;
        try {
            sa.crearCurso(codNuevoCurso, nombreNuevoCurso, creditosNuevoCurso, horasAprovadasNuevoCurso);
            if (temasCursoNuevo != null && temasCursoNuevo.size() > 0) {
                for (String s : temasCursoNuevo) {
                    sa.crearTema(codNuevoCurso, s, s);
                }
            }
        } catch (Exception e) {
            error = true;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al crear curso", "Revise si el curso ya existe y que los datos sean validos"));
        }
        if (!error) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion exitosa", "Curso creado exitosamente"));
        }
        codNuevoCurso = null;
        nombreNuevoCurso = null;
        horasAprovadasNuevoCurso = 0;
        creditosNuevoCurso = 0;
        temasCursoNuevo = null;
    }

}
