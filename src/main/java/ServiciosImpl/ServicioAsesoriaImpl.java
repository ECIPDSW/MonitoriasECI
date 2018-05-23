package ServiciosImpl;


import DAOS.AdministradorDAO;
import DAOS.AsesoriaDAO;
import DAOS.CursoDAO;
import DAOS.EstudianteDAO;
import DAOS.GrupoDAO;
import DAOS.MonitorDAO;
import DAOS.MonitoriaDAO;
import DAOS.MonitoriaRegistradaDAO;
import DAOS.PersonaDAO;
import DAOS.ProfesorDAO;
import DAOS.SemestreDAO;
import DAOS.TemaAsesoriaDAO;
import DAOS.TemaCursoDAO;
import Modelo.Administrador;
import Modelo.Asesoria;
import Modelo.Curso;
import Modelo.Estudiante;
import Modelo.Grupo;
import Modelo.Monitor;
import Modelo.Monitoria;
import Modelo.MonitoriaRegistrada;
import Modelo.Persona;
import Modelo.Profesor;
import Modelo.Semestre;
import Modelo.TemaCurso;
import Servicios.ServicioAsesoria;
import com.google.inject.Inject;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 *Implementacion de los servicios de asesoria
 * @author 666 Industries
 */
public class ServicioAsesoriaImpl implements ServicioAsesoria,Serializable{

    @Inject
    private SemestreDAO semestre;
    @Inject
    private AsesoriaDAO asesoria;
    @Inject
    private TemaAsesoriaDAO temaasesoria;
    @Inject
    private MonitorDAO monitor;
    @Inject
    private ProfesorDAO profesor;
    @Inject
    private MonitoriaRegistradaDAO monitoriaregistrada;
    @Inject
    private GrupoDAO grupo;
    @Inject
    private AdministradorDAO administrador;
    @Inject
    private CursoDAO curso;
    @Inject
    private MonitoriaDAO monitoria;
    @Inject
    private TemaCursoDAO temaCurso;
    @Inject
    private EstudianteDAO estudiante;
    @Inject
    private PersonaDAO persona;
    
    
    
    

    @Override
    public Semestre getSemestre(int id) {
        return semestre.loadSemestre(id);
    }

    @Override
    public Profesor getProfesor(int id) {
        return profesor.loadProfesor(id);
    }

    @Override
    public Monitor loadMonitor(int id) {
        return monitor.loadMonitor(id);
    }

    

    @Override
    public void registrarAsesoria(int grupoAsistente, int monitoriaRegistrada, int idEstudiante) {
        asesoria.registrarAsesoria(grupoAsistente, monitoriaRegistrada, idEstudiante);
    }

    @Override
    public void registrarInicioMonitoriaDictada(int idMonitoria, String ip) {
        monitoriaregistrada.registrarInicioMonitoriaDictada(idMonitoria, ip);
    }

    @Override
    public void registrarFinMonitoria(int idMonitor) {
        monitoriaregistrada.registrarFinMonitoria(idMonitor);
    }

    @Override
    public Monitoria monitoriasDisponiblesParaDictar(int idMonitor) {
        return monitoria.monitoriasDisponiblesParaDictar(idMonitor);
    }

    @Override
    public List<Curso> loadCursos() {
        return curso.loadCursos();
    }

    @Override
    public List<Monitoria> loadMonitorias(int semestre) {
        return monitoria.loadMonitorias(semestre);
    }

    @Override
    public List<Monitoria> loadMonitorias(String idcurso, int semestre) {
        return monitoria.loadMonitorias(idcurso,semestre);
    }

    @Override
    public List<Asesoria> loadAsesorias(int semestre) {
        return asesoria.loadAsesorias(semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorTema(int idTema, int semestre) {
        return asesoria.loadAsesoriasPorTema(idTema, semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorMonitor(int idMonitor, int semestre) {
        return asesoria.loadAsesoriasPorMonitor(idMonitor, semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorGrupo(int idGrupo) {
        return asesoria.loadAsesoriasPorGrupo(idGrupo);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorCurso(String idCurso, int semestre) {
        return asesoria.loadAsesoriasPorCurso(idCurso, semestre);
    }

    @Override
    public List<Semestre> loadSemestres() {
        return semestre.loadSemestres();
    }

    @Override
    public Semestre loadSemestreActual() {
        return semestre.loadSemestreActual();
    }

    @Override
    public List<TemaCurso> loadTemasCurso(String idCurso) {
        return temaCurso.loadTemasCurso(idCurso);
    }

    @Override
    public List<TemaCurso> loadTemasAsesoria(int idAsesoria) {
        return temaCurso.loadTemasAsesoria(idAsesoria);
    }

    @Override
    public List<Monitor> loadMonitoresAsociadosProfesor(int idProfesor, int semestre) {
        return monitor.loadMonitoresAsociadosProfesor(idProfesor, semestre);
    }

    @Override
    public List<Grupo> loadGruposAsociadosProfesor(int idProfesor, int semestre) {
        return grupo.loadGruposAsociadosProfesor(idProfesor, semestre);
    }

    @Override
    public Administrador loadAdminLogin(int id, String psw) {
        return administrador.loadAdmin(id, psw);
    }

    @Override
    public Monitor loadMonitorLogin(int id, String psw) {
        return monitor.loadMonitorLogin(id, psw);
    }

    @Override
    public Profesor loadProfesorLogin(int id, String psw) {
        return profesor.loadProfesorLogin(id, psw);
    }

    @Override
    public List<Grupo> loadGrupos(String idCurso, int semestre) {
        return grupo.loadGrupos(idCurso, semestre);
    }

    @Override
    public List<Monitoria> loadMonitoriasPorMonitor(int idMonitor) {
        return monitoria.loadMonitoriasPorMonitor(idMonitor);
    }

    @Override
    public List<MonitoriaRegistrada> loadMonitoriasRegistradasPorMonitoria(int idMonitoria) {
        return monitoriaregistrada.loadMonitoriasRegistradasPorMonitoria(idMonitoria);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorMonitoriaRegistrada(int idMonitoriaRegistrada) {
        return asesoria.loadAsesoriasPorMonitoriaRegistrada(idMonitoriaRegistrada);
    }

    @Override
    public Monitor loadMonitorPorGrupo(int idgrupo) {
        return monitor.loadMonitorPorGrupo(idgrupo);
    }

    @Override
    public Estudiante loadEstudiantePorAsesoria(int idasesoria) {
        return estudiante.loadEstudiantePorAsesoria(idasesoria);
    }

    @Override
    public List<Date> loadFechasMonitorias(String idCurso, int semestre) {
        return monitoria.loadFechasMonitorias(idCurso, semestre);
    }

    @Override
    public int numeroDeAsistenciasSegunFecha(String idCurso, int semestre, Date fecha) {
        return monitoria.numeroDeAsistenciasSegunFecha(idCurso, semestre, fecha);
    }

    @Override
    public int numeroDeAsistenciasSegunGrupo(int grupo) {
        return this.grupo.numeroDeAsistenciasSegunGrupo(grupo);
    }

    @Override
    public List<Time> franjasMonitorias(String idCurso, int semestre) {
        return monitoria.franjasMonitorias(idCurso, semestre);
    }

    @Override
    public int numeroDeAsistenciasSegunFranja(String idCurso, int semestre, Time franja) {
        return monitoria.numeroDeAsistenciasSegunFranja(idCurso, semestre, franja);
    }

    @Override
    public int numeroDeAsistenciasSegunMonitoria(int idMonitoria) {
        return monitoria.numeroDeAsistenciasSegunMonitoria(idMonitoria);
    }

    @Override
    public int numeroDeAsistenciasSegunTema(int tema, int semestre) {
        return temaCurso.numeroDeAsistenciasSegunTema(tema, semestre);
    }

    @Override
    public int numeroDeAsistenciasSegunCurso(String idCurso, int semestre) {
        return curso.numeroDeAsistenciasSegunCurso(idCurso, semestre);
    }

    @Override
    public List<Asesoria> asesoriasDeUnaMonitoria(int idmonitoria) {
        return asesoria.asesoriasDeUnaMonitoria(idmonitoria);
    }

    @Override
    public Semestre loadSemestreAnterior() {
        return semestre.loadSemestreAnterior();
    }

    @Override
    public List<Monitoria> loadMonitoriasPorGrupo(int grupo) {
        return monitoria.loadMonitoriasPorGrupo(grupo);
    }

    @Override
    public void crearSemestre(int ano, char periodoAcademico, Date fechaInicio, Date fechaFin) {
        semestre.crearSemestre(ano, periodoAcademico, fechaInicio, fechaFin);
    }

    @Override
    public void crearCurso(String id, String nombre, int creditosAcademicos, int horasAprovadasMonitorias) {
        curso.crearCurso(id, nombre, creditosAcademicos, horasAprovadasMonitorias);
    }

    @Override
    public void crearTema(String idCurso, String tema, String descripcion) {
        temaCurso.crearTema(idCurso, tema, descripcion);
    }

    @Override
    public void crearProfesor(int id, String nombre, String apellido, String correo, String contrasena, String decanatura) {
        profesor.crearProfesor(id, nombre, apellido, correo, contrasena, decanatura);
    }

    @Override
    public void crearMonitor(int id, String nombre, String apellido, String correo, String contrasena, int telefono, String programa, String semestreIngreso) {
        monitor.crearMonitor(id, nombre, apellido, correo, contrasena, telefono, programa, semestreIngreso);
    }

    @Override
    public void crearGrupo(int numero, String curso, int semestre, int profesor, int monitor) {
        grupo.crearGrupo(numero, curso, semestre, profesor, monitor);
    }

    @Override
    public void crearMonitoria(int grupo, int dia, Time horaInicio, Time horaFin, String lugar) {
        monitoria.crearMonitoria(grupo, dia, horaInicio, horaFin, lugar);
    }

    @Override
    public void asignarMonitorAGrupo(int idgrupo, int idmonitor) {
        grupo.asignarMonitorAGrupo(idgrupo, idmonitor);
    }

    @Override
    public void asignarSemestreAMonitor(int idmonitor, int idsemestre) {
        monitor.asignarSemestreAMonitor(idmonitor, idsemestre);
    }

    @Override
    public void crearEstudiante(int carnet, String nombre) {
        estudiante.crearEstudiante(carnet, nombre);
    }

    @Override
    public void finalizarAsesoria(int idAsesoria, String observaciones) {
        asesoria.finalizarAsesoria(idAsesoria, observaciones);
    }

    @Override
    public List<Asesoria> loadAsesoriasRealizandosePorMonitoriaRegistrada(int idMonitoriaRegistrada) {
        return asesoria.loadAsesoriasPorMonitoriaRegistrada(idMonitoriaRegistrada);
    }

    @Override
    public void agregarTemaAAsesoria(int idAsesoria, int idTema) {
        temaasesoria.agregarTemaAAsesoria(idAsesoria, idTema);
    }

    @Override
    public List<Curso> loadCursosQueTienenMonitoriasPorSemestre(int semestre) {
        return curso.loadCursosQueTienenMonitoriasPorSemestre(semestre);
    }

    @Override
    public Curso loadCursoPorMonitoria(int idMonitoria) {
        return curso.loadCursoPorMonitoria(idMonitoria);
    }

    @Override
    public List<Persona> loadPersonas() {
        return persona.loadPersonas();
    }

    @Override
    public List<Monitor> loadMonitores() {
        return monitor.loadMonitores();
    }

    @Override
    public List<Profesor> loadProfesores() {
        return profesor.loadProfesores();
    }

    @Override
    public void modificarMonitor(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena, Integer telefono, String programaAcademico, Integer semestreDeIngreso) {
        monitor.modificarMonitor(idViejo, idNuevo, nombre, apellido, correo, contasena, telefono, programaAcademico, semestreDeIngreso);
    }

    @Override
    public void modificarProfesor(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena, String decanatura) {
        profesor.modificarProfesor(idViejo, idNuevo, nombre, apellido, correo, contasena, decanatura);
    }

    @Override
    public void modificarAdmin(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena) {
        administrador.modificarAdmin(idViejo, idNuevo, nombre, apellido, correo, contasena);
    }

    @Override
    public void eliminarCurso(String idCurso) {
        curso.eliminarCurso(idCurso);
    }

    @Override
    public void eliminarTemaCurso(int idTema) {
        temaCurso.eliminarTemaCurso(idTema);
    }

    @Override
    public void modificarCurso(String idCursoViejo, String idCursoNuevo, String nombre, Integer creditos, Integer horasMonitoria) {
        curso.modificarCurso(idCursoViejo, idCursoNuevo, nombre, creditos, horasMonitoria);
    }

    @Override
    public void modificarGrupo(int idGrupo, Integer numero, String idCurso, Integer semestre, Integer profesor, Integer monitor) {
        grupo.modificarGrupo(idGrupo, numero, idCurso, semestre, profesor, monitor);
    }

    @Override
    public void eliminarGrupo(int idGrupo) {
        grupo.eliminarGrupo(idGrupo);
    }

    @Override
    public void modificarSemestre(int IDnumero, Integer ano, Character periodo, Date fechaInicio, Date fechaFin) {
        semestre.modificarSemestre(IDnumero, ano, periodo, fechaInicio, fechaFin);
    }

    @Override
    public void eliminarSemestre(int IDnumero) {
        semestre.eliminarSemestre(IDnumero);
    }

    @Override
    public void modificarMonitoria(int IDmonitoria, Integer grupo, String dia, Time horaInicio, Time horaFin, String lugar) {
        monitoria.modificarMonitoria(IDmonitoria, grupo, dia, horaInicio, horaFin, lugar);
    }

    @Override
    public void eliminarMonitoria(int IDmonitoria) {
        monitoria.eliminarMonitoria(IDmonitoria);
    }

    @Override
    public void modificarTemaCurso(int IDtema, String tema, String descripcion, String curso) {
        temaCurso.modificarTemaCurso(IDtema, tema, descripcion, curso);
    }

    @Override
    public void eliminarPersona(int id) {
        persona.eliminarPersona(id);
    }

    @Override
    public List<Monitor> monitoresPorSemestre(int idSemestre) {
        return monitor.monitoresPorSemestre(idSemestre);
    }

    @Override
    public List<Monitor> monitoresOcupadosSemestre(int idSemestre) {
        return monitor.monitoresOcupadosSemestre(idSemestre);
    }
   
    @Override
    public List<Integer> asistenciasPorMonitoria(){
        return monitoria.asistenciasPorMonitoria();
    }
}
