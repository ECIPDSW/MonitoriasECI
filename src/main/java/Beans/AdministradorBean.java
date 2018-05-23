package Beans;

import Modelo.Administrador;
import Modelo.Asesoria;
import Modelo.Curso;
import Modelo.Monitor;
import Modelo.Profesor;
import Modelo.Semestre;
import Modelo.TemaCurso;
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
    private List<String> temasCursoNuevo;
    private List<Curso> cursosFiltrados;
    private Curso cursoSeleccionadoTablaFiltrado;
    private String idCursoAnterior;
    private String idCursoaEditar;
    private String nombreCursoaEditar;
    private int horasMonCursoaEditar;
    private int creditosCursoaEditar;
    private List<String> temasCursoaEditar;
    private int idProfesoraCrear;
    private String contrasenaProfesoraCrear;
    private String nombreProfesoraCrear;
    private String apellidoProfesoraCrear;
    private String correoProfesoraCrear;
    private String decanaturaProfesoraCrear;
    private String[] decanaturasDisponibles = {"SISTEMAS", "ADMINISTRACCION", "MATEMATICAS"};
    private List<Profesor> profesores;
    private List<Profesor> profesoresFiltrados;
    private Profesor profesorSeleccionadoTablaFiltrado;
    private int idProfesoraEditar;
    private String contrasenaProfesoraEditar;
    private String nombreProfesoraEditar;
    private String apellidoProfesoraEditar;
    private String correoProfesoraEditar;
    private String decanaturaProfesoraEditar;
    private int idProfesorAnterior;
    private int idMonitoraCrear;
    private String nombreMonitoraCrear;
    private String apellidoMonitoraCrear;
    private String correoMonitoraCrear;
    private int telefonoMonitoraCrear;
    private String[] programas = {"INGENIERIA DE SÍSTEMAS", "ADMINISTRACION DE EMPRESAS", "INGENIERIA BIOMEDICA", "INGENIERIA MECANICA"};
    private String programaMonitoraCrear;
    private String semestreIngresoMonitoraCrear;
    private String contrasenaMonitoraCrear;
    private List<Monitor> monitores;
    private List<Monitor> monitoresFiltrados;
    private Monitor monitorSeleccionadoTablaFiltrado;
    private int idMonitoraEditar;
    private String nombreMonitoraEditar;
    private String apellidoMonitoraEditar;
    private String correoMonitoraEditar;
    private int telefonoMonitoraEditar;
    private String programaMonitoraEditar;
    private String semestreIngresoMonitoraEditar;
    private String contrasenaMonitoraEditar;
    private int idMonitorAnterior;

    public void AdministradorBean() {
    }

    public Monitor getMonitorSeleccionadoTablaFiltrado() {
        return monitorSeleccionadoTablaFiltrado;
    }

    public int getIdMonitoraEditar() {
        return idMonitoraEditar;
    }

    public void setIdMonitoraEditar(int idMonitoraEditar) {
        this.idMonitoraEditar = idMonitoraEditar;
    }

    public String getNombreMonitoraEditar() {
        return nombreMonitoraEditar;
    }

    public void setNombreMonitoraEditar(String nombreMonitoraEditar) {
        this.nombreMonitoraEditar = nombreMonitoraEditar;
    }

    public String getApellidoMonitoraEditar() {
        return apellidoMonitoraEditar;
    }

    public void setApellidoMonitoraEditar(String apellidoMonitoraEditar) {
        this.apellidoMonitoraEditar = apellidoMonitoraEditar;
    }

    public String getCorreoMonitoraEditar() {
        return correoMonitoraEditar;
    }

    public void setCorreoMonitoraEditar(String correoMonitoraEditar) {
        this.correoMonitoraEditar = correoMonitoraEditar;
    }

    public int getTelefonoMonitoraEditar() {
        return telefonoMonitoraEditar;
    }

    public void setTelefonoMonitoraEditar(int telefonoMonitoraEditar) {
        this.telefonoMonitoraEditar = telefonoMonitoraEditar;
    }

    public String getProgramaMonitoraEditar() {
        return programaMonitoraEditar;
    }

    public void setProgramaMonitoraEditar(String programaMonitoraEditar) {
        this.programaMonitoraEditar = programaMonitoraEditar;
    }

    public String getSemestreIngresoMonitoraEditar() {
        return semestreIngresoMonitoraEditar;
    }

    public void setSemestreIngresoMonitoraEditar(String semestreIngresoMonitoraEditar) {
        this.semestreIngresoMonitoraEditar = semestreIngresoMonitoraEditar;
    }

    public String getContrasenaMonitoraEditar() {
        return contrasenaMonitoraEditar;
    }

    public void setContrasenaMonitoraEditar(String contrasenaMonitoraEditar) {
        this.contrasenaMonitoraEditar = contrasenaMonitoraEditar;
    }

    public int getIdMonitorAnterior() {
        return idMonitorAnterior;
    }

    public void setIdMonitorAnterior(int idMonitorAnterior) {
        this.idMonitorAnterior = idMonitorAnterior;
    }

    public void setMonitorSeleccionadoTablaFiltrado(Monitor m) {
        this.monitorSeleccionadoTablaFiltrado = m;
        idMonitorAnterior=m.getId();
        idMonitoraEditar=m.getId();
        nombreMonitoraEditar=m.getNombre();
        apellidoMonitoraEditar=m.getApellido();
        correoMonitoraEditar=m.getCorreo();
        telefonoMonitoraEditar=m.getTelefonoMovil();
        programaMonitoraEditar=m.getProgramaAcademico();
        semestreIngresoMonitoraEditar=Integer.toString(m.getSemestreDeIngreso().getNumero());
        contrasenaMonitoraEditar=m.getContrasena();
        
        
    }
    
    public List<Monitor> getMonitoresFiltrados() {
        return monitoresFiltrados;
    }

    public void setMonitoresFiltrados(List<Monitor> monitoresFiltrados) {
        this.monitoresFiltrados = monitoresFiltrados;
    }

    public List<Monitor> getMonitores() {
        return sa.loadMonitores();
    }

    public void setMonitores(List<Monitor> monitores) {
        this.monitores = monitores;
    }

    public String getContrasenaMonitoraCrear() {
        return contrasenaMonitoraCrear;
    }

    public void setContrasenaMonitoraCrear(String contrasenaMonitoraCrear) {
        this.contrasenaMonitoraCrear = contrasenaMonitoraCrear;
    }

    public int getIdMonitoraCrear() {
        return idMonitoraCrear;
    }

    public void setIdMonitoraCrear(int idMonitoraCrear) {
        this.idMonitoraCrear = idMonitoraCrear;
    }

    public String getNombreMonitoraCrear() {
        return nombreMonitoraCrear;
    }

    public void setNombreMonitoraCrear(String nombreMonitoraCrear) {
        this.nombreMonitoraCrear = nombreMonitoraCrear.toUpperCase();
    }

    public String getApellidoMonitoraCrear() {
        return apellidoMonitoraCrear;
    }

    public void setApellidoMonitoraCrear(String apellidoMonitoraCrear) {
        this.apellidoMonitoraCrear = apellidoMonitoraCrear.toUpperCase();
    }

    public String getCorreoMonitoraCrear() {
        return correoMonitoraCrear;
    }

    public void setCorreoMonitoraCrear(String correoMonitoraCrear) {
        this.correoMonitoraCrear = correoMonitoraCrear;
    }

    public int getTelefonoMonitoraCrear() {
        return telefonoMonitoraCrear;
    }

    public void setTelefonoMonitoraCrear(int telefonoMonitoraCrear) {
        this.telefonoMonitoraCrear = telefonoMonitoraCrear;
    }

    public String getProgramaMonitoraCrear() {
        return programaMonitoraCrear;
    }

    public void setProgramaMonitoraCrear(String programaMonitoraCrear) {
        this.programaMonitoraCrear = programaMonitoraCrear;
    }

    public String getSemestreIngresoMonitoraCrear() {
        return semestreIngresoMonitoraCrear;
    }

    public void setSemestreIngresoMonitoraCrear(String semestreIngresoMonitoraCrear) {
        this.semestreIngresoMonitoraCrear = semestreIngresoMonitoraCrear;
    }

    public String[] getProgramas() {
        return programas;
    }

    public void setProgramas(String[] programas) {
        this.programas = programas;
    }

    public Profesor getProfesorSeleccionadoTablaFiltrado() {
        return profesorSeleccionadoTablaFiltrado;
    }

    public void setProfesorSeleccionadoTablaFiltrado(Profesor p) {
        this.profesorSeleccionadoTablaFiltrado = p;
        idProfesoraEditar = p.getId();
        idProfesorAnterior = p.getId();
        contrasenaProfesoraEditar = p.getContrasena();
        nombreProfesoraEditar = p.getNombre();
        apellidoProfesoraEditar = p.getApellido();
        decanaturaProfesoraEditar = p.getDecanatura();
        correoProfesoraEditar = p.getCorreo();

    }

    public int getIdProfesoraEditar() {
        return idProfesoraEditar;
    }

    public void setIdProfesoraEditar(int idProfesoraEditar) {
        this.idProfesoraEditar = idProfesoraEditar;
    }

    public String getContrasenaProfesoraEditar() {
        return contrasenaProfesoraEditar;
    }

    public void setContrasenaProfesoraEditar(String contrasenaProfesoraEditar) {
        this.contrasenaProfesoraEditar = contrasenaProfesoraEditar;
    }

    public String getNombreProfesoraEditar() {
        return nombreProfesoraEditar;
    }

    public void setNombreProfesoraEditar(String nombreProfesoraEditar) {
        this.nombreProfesoraEditar = nombreProfesoraEditar.toUpperCase();
    }

    public String getApellidoProfesoraEditar() {
        return apellidoProfesoraEditar;
    }

    public void setApellidoProfesoraEditar(String apellidoProfesoraEditar) {
        this.apellidoProfesoraEditar = apellidoProfesoraEditar.toUpperCase();
    }

    public String getCorreoProfesoraEditar() {
        return correoProfesoraEditar;
    }

    public void setCorreoProfesoraEditar(String correoProfesoraEditar) {
        this.correoProfesoraEditar = correoProfesoraEditar;
    }

    public String getDecanaturaProfesoraEditar() {
        return decanaturaProfesoraEditar;
    }

    public void setDecanaturaProfesoraEditar(String decanaturaProfesoraEditar) {
        this.decanaturaProfesoraEditar = decanaturaProfesoraEditar;
    }

    public int getIdProfesorAnterior() {
        return idProfesorAnterior;
    }

    public void setIdProfesorAnterior(int idProfesorAnterior) {
        this.idProfesorAnterior = idProfesorAnterior;
    }

    public List<Profesor> getProfesoresFiltrados() {
        return profesoresFiltrados;
    }

    public void setProfesoresFiltrados(List<Profesor> profesoresFiltrados) {
        this.profesoresFiltrados = profesoresFiltrados;
    }

    public List<Profesor> getProfesores() {
        return sa.loadProfesores();
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public String[] getDecanaturasDisponibles() {
        return decanaturasDisponibles;
    }

    public void setDecanaturasDisponibles(String[] decanaturasDisponibles) {
        this.decanaturasDisponibles = decanaturasDisponibles;
    }

    public int getIdProfesoraCrear() {
        return idProfesoraCrear;
    }

    public void setIdProfesoraCrear(int idProfesoraCrear) {
        this.idProfesoraCrear = idProfesoraCrear;
    }

    public String getContrasenaProfesoraCrear() {
        return contrasenaProfesoraCrear;
    }

    public void setContrasenaProfesoraCrear(String contrasenaProfesoraCrear) {
        this.contrasenaProfesoraCrear = contrasenaProfesoraCrear;
    }

    public String getNombreProfesoraCrear() {
        return nombreProfesoraCrear;
    }

    public void setNombreProfesoraCrear(String nombreProfesoraCrear) {
        this.nombreProfesoraCrear = nombreProfesoraCrear.toUpperCase();
    }

    public String getApellidoProfesoraCrear() {
        return apellidoProfesoraCrear;
    }

    public void setApellidoProfesoraCrear(String apellidoProfesoraCrear) {
        this.apellidoProfesoraCrear = apellidoProfesoraCrear.toUpperCase();
    }

    public String getCorreoProfesoraCrear() {
        return correoProfesoraCrear;
    }

    public void setCorreoProfesoraCrear(String correoProfesoraCrear) {
        this.correoProfesoraCrear = correoProfesoraCrear;
    }

    public String getDecanaturaProfesoraCrear() {
        return decanaturaProfesoraCrear;
    }

    public void setDecanaturaProfesoraCrear(String decanaturaProfesoraCrear) {
        this.decanaturaProfesoraCrear = decanaturaProfesoraCrear;
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

    public int totalAsistentes() {
        List<Asesoria> asesorias = sa.loadAsesorias(sa.loadSemestreActual().getNumero());
        int total = 0;
        for (int i = 0; i < asesorias.size(); i++) {
            total += 1;
        }
        return total;

    }



    public int totalMonitories(){
        List<Monitor> monitores = sa.monitoresPorSemestre(sa.loadSemestreActual().getNumero());
        return monitores.size();
    }
    
    public int porcentajeOcupacion(){
        List<Monitor> monitorestotales = sa.monitoresPorSemestre(sa.loadSemestreActual().getNumero());
        List<Monitor> ocupados = sa.monitoresOcupadosSemestre(sa.loadSemestreActual().getNumero());
        int porcentaje = (Integer)((ocupados.size()/monitorestotales.size()))*100;
        return porcentaje;
    }
    
    public int promedioAsistencias(){
        List<Asesoria> asesorias = sa.loadAsesorias(sa.loadSemestreActual().getNumero());
        int total= 0;
        for(int i=0;i<asesorias.size();i++){
            total+=1;
        }
        return total/asesorias.size();
    }

    
    public List<Monitoria> monitoriasEnCurso(){
        List<Monitoria> monitoriaActual = sa.monitoriasActuales();
        return monitoriaActual;
    }

    public void modificarCursoSeleccionado() {
        boolean var = true;
        try {
            sa.modificarCurso(idCursoAnterior.toUpperCase(), idCursoaEditar.toUpperCase(), nombreCursoaEditar.toUpperCase(), creditosCursoaEditar, horasMonCursoaEditar);
        } catch (Exception e) {

            var = false;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al modificar curso", "Revise que los datos sean validos"));
        }
        if (var) {
            idCursoAnterior = idCursoaEditar.toUpperCase();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion exitosa", "Curso editado exitosamente"));
        }

    }

    public void modificarProfesorSeleccionado() {
        boolean var = true;
        try {
            sa.modificarProfesor(idProfesorAnterior, idProfesoraEditar, nombreProfesoraEditar, apellidoProfesoraEditar, correoProfesoraEditar, contrasenaProfesoraEditar, decanaturaProfesoraEditar);
        } catch (Exception e) {

            var = false;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al modificar profesor", "Revise que los datos sean validos"));
        }
        if (var) {
            idProfesorAnterior = idProfesoraEditar;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion exitosa", "Profesor editado exitosamente"));
        }

    }
    public void modificarMonitorSeleccionado() {
        boolean var = true;
        try {
            sa.modificarMonitor(idMonitorAnterior, idMonitoraEditar, nombreMonitoraEditar, apellidoMonitoraEditar, correoMonitoraEditar, contrasenaMonitoraEditar, telefonoMonitoraEditar, programaMonitoraEditar, Integer.parseInt(semestreIngresoMonitoraEditar));
        } catch (Exception e) {

            var = false;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al modificar monitor", "Revise que los datos sean validos"));
        }
        if (var) {
            idMonitorAnterior = idMonitoraEditar;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion exitosa", "Monitor editado exitosamente"));
        }

    }

    public void eliminarProfesorSeleccionado() {
        boolean var = true;
        try {
            sa.eliminarPersona(idProfesorAnterior);
        } catch (Exception e) {

            var = false;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al eliminar profesor", "Se ha precentado un error al intentar eliminar el profesor."));
        }
        if (var) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion exitosa", "Profesor eliminado exitosamente"));
        }

    }
    public void eliminarMonitorSeleccionado() {
        boolean var = true;
        try {
            sa.eliminarPersona(idMonitorAnterior);
        } catch (Exception e) {

            var = false;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al eliminar monitor", "Se ha precentado un error al intentar eliminar el profesor."));
        }
        if (var) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion exitosa", "Monitor eliminado exitosamente"));
        }

    }

    public void eliminarCursoSeleccionado() {
        boolean var = true;
        try {
            sa.eliminarCurso(idCursoAnterior);
        } catch (Exception e) {
            var = false;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al eliminar curso", "Se ha precentado un error al intentar eliminar el curso."));
        }
        if (var) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion exitosa", "Curso eliminado exitosamente"));
        }

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

    public void crearProfesor() {
        boolean error = false;
        try {
            sa.crearProfesor(idProfesoraCrear, nombreProfesoraCrear, apellidoProfesoraCrear, correoProfesoraCrear, contrasenaProfesoraCrear, decanaturaProfesoraCrear);

        } catch (Exception e) {
            error = true;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al crear Profesor", "Revise si el profesor ya existe y que los datos sean validos"));
        }
        if (!error) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion exitosa", "Profesor creado exitosamente"));
        }
        idProfesoraCrear = 0;
        nombreProfesoraCrear = null;
        apellidoProfesoraCrear = null;
        correoProfesoraCrear = null;
        contrasenaProfesoraCrear = null;
        decanaturaProfesoraCrear = null;
    }

    public void crearMonitor() {
        boolean error = false;
        try {

            sa.crearMonitor(idMonitoraCrear, nombreMonitoraCrear, apellidoMonitoraCrear, correoMonitoraCrear, contrasenaMonitoraCrear, telefonoMonitoraCrear, programaMonitoraCrear, Integer.parseInt(semestreIngresoMonitoraCrear));

        } catch (Exception e) {
            e.printStackTrace();
            error = true;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al crear Monitor", "Revise si el Monitor ya existe y que los datos sean validos"));
        }
        if (!error) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion exitosa", "Monitor creado exitosamente"));
        }
        idMonitoraCrear = 0;
        nombreMonitoraCrear = null;
        apellidoMonitoraCrear = null;
        correoMonitoraCrear = null;
        contrasenaMonitoraCrear = null;
        telefonoMonitoraCrear = 0;
        programaMonitoraCrear = null;
        semestreIngresoMonitoraCrear = null;
    }

}
