/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Modelo.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
/**
 *
 * @author David Rodriguez
 */
public interface ServicioAsesoria {
    Semestre getSemestre(int id);
    Profesor getProfesor(int id);
    Monitor loadMonitor(int id);
    void registrarAsesoria(int grupoAsistente, int monitoriaRegistrada, int idEstudiante);
    /**
     * registra el inicio de una monitoria en especifico por un monitor
     * @param idMonitoria
     * @param ip 
     */
    void registrarInicioMonitoriaDictada(int idMonitoria,String ip);
    
    /**
     * registra el fin de la franja de un monitor
     * @param idMonitor
     */
    void registrarFinMonitoria(int idMonitor);
    
    /**
     * devuelve todas las monitorias que estan disponibles para dictar por el monitor 
     * en la hora actual
     * @param idMonitor
     * @return 
     */
    Monitoria monitoriasDisponiblesParaDictar(int idMonitor);
    /**
     * Carga todos los cursos disponibles  
     * @return 
     */
    List<Curso> loadCursos();
    /**
     * Retorna todas las monitorias dictadas en un semestre especifico
     * @param semestre
     * @return 
     */
    List<Monitoria> loadMonitorias(int semestre);
  
     /**
     * Retorna todas las monitorias disponibles en el semestre actual de un curso en especifico
     * @param idcurso
     * @param semestre
     * @return 
     */
    List<Monitoria> loadMonitorias(String idcurso, int semestre);
    
     /**
     * Retorna todas las asesorias dictadas  el semestre especificado
     * @param semestre
     * @return 
     */
    List<Asesoria> loadAsesorias(int semestre);
    /**
     * Retorna todas las asesorias dictadas  por tema especificado
     * @param idTema
     * @param semestre
     * @return 
     */
    List<Asesoria> loadAsesoriasPorTema(int idTema,int semestre);
    /**
     * Retorna todas las asesorias dictadas  por monitor
     * @param idMonitor
     * @param semestre
     * @return 
     */
    List<Asesoria> loadAsesoriasPorMonitor(int idMonitor,int semestre);
    
    /**
     * Retorna todas las asesorias dictadas  por Grupo
     * @param idGrupo
     * @return 
     */
    List<Asesoria> loadAsesoriasPorGrupo(int idGrupo);
      /**
     * Retorna todas las asesorias dictadas  por curso
     * @param idCurso
     * @param semestre
     * @return 
     */
    List<Asesoria> loadAsesoriasPorCurso(String idCurso, int semestre);
    
    /**
     * retorna todos los semestres que han sido creados
     * @return 
     */
    List<Semestre> loadSemestres();
    /**
     * retorna el semestre actual
     * @return 
     */
    Semestre loadSemestreActual();
    
    /**
     * retorna los temas disponibles para un curso
     * @param idCurso
     * @return 
     */
    List<TemaCurso> loadTemasCurso(String idCurso);
    
      /**
     * retorna los temas dicrtados en una asesoria
     * @param idAsesoria
     * @return 
     */
    List<TemaCurso> loadTemasAsesoria(int idAsesoria);
    
    /**
     * devuelve todos los monitores por profesor
     * @param idProfesor
     * @param semestre
     * @return 
     */
    List<Monitor> loadMonitoresAsociadosProfesor(int idProfesor,int semestre);
    
      /**
     * devuelve todos los grupos por profesor
     * @param idProfesor
     * @param semestre
     * @return 
     */
    List<Grupo> loadGruposAsociadosProfesor(int idProfesor,int semestre);
    
    /**
     * retorna el administrador con las credenciales registradas
     * @param id
     * @param psw
     * @return 
     */
    Administrador loadAdminLogin(int id,String psw);
    
    /**
     * retorna el monitor con las credenciales registradas
     * @param id
     * @param psw
     * @return 
     */
    Monitor loadMonitorLogin(int id,String psw);
    
    /**
     * retorna el Profesor con las credenciales registradas
     * @param id
     * @param psw
     * @return 
     */
    Profesor loadProfesorLogin(int id,String psw);
    
    /**
     * retorna todods los grupos existentes para un curso
     * @param idCurso
     * @param semestre
     * @return 
     */
    List<Grupo> loadGrupos(String idCurso,int semestre);
    
    /**
     * Carga las monitorias hechas por un monitor
     * @param idMonitor
     * @return 
     */
    List<Monitoria> loadMonitoriasPorMonitor(int idMonitor);
    
    /**
     * Carga las Moniotiras registradas por un monitor
     * @param idMonitoria
     * @return 
     */
    List<MonitoriaRegistrada> loadMonitoriasRegistradasPorMonitoria(int idMonitoria);
    
    /**
     * Carga las monitorias hechas en una monitoria registrada
     * @param idMonitoriaRegistrada
     * @return 
     */
    List<Asesoria> loadAsesoriasPorMonitoriaRegistrada(int idMonitoriaRegistrada);
    
    /**
     * Carga el monitor del grupo
     * @param idgrupo
     * @return 
     */
    Monitor loadMonitorPorGrupo(int idgrupo);
    
    /**
     * Carga el Estudiante que asistio a la asesoria
     * @param idasesoria
     * @return 
     */
    Estudiante loadEstudiantePorAsesoria(int idasesoria);
    
    /**
     * Carga las fechas hechas en una monitoria
     * @param idCurso
     * @param semestre
     * @return 
     */
    List<Date> loadFechasMonitorias(String idCurso, int semestre);
    
    /**
     * Cuenta las asistencias en una fecha
     * @param idCurso
     * @param semestre
     * @param fecha
     * @return 
     */
    int numeroDeAsistenciasSegunFecha(String idCurso, int semestre, Date fecha);
    
    
    /**
     * Cuenta las asistencias dado un grupo
     * @param grupo
     * @return 
     */
    int numeroDeAsistenciasSegunGrupo(int grupo);
    
    /**
     * Carga la hora de las monitorias
     * @param idCurso
     * @param semestre
     * @return 
     */
    List<Time> franjasMonitorias(String idCurso, int semestre);
    
    /**
     * Cuenta las asistencias segun una franja
     * @param idCurso
     * @param semestre
     * @param franja
     * @return 
     */
    int numeroDeAsistenciasSegunFranja(String idCurso, int semestre, Time franja);
    
    /**
     * 
     * @param idMonitoria
     * @return 
     */
    int numeroDeAsistenciasSegunMonitoria(int idMonitoria);
    
    int numeroDeAsistenciasSegunTema(int tema, int semestre);
    
    int numeroDeAsistenciasSegunCurso(String idCurso, int semestre);
    
    List<Asesoria> asesoriasDeUnaMonitoria(int idmonitoria); 
    
    Semestre loadSemestreAnterior();
    
    List<Monitoria> loadMonitoriasPorGrupo(int grupo);
    
    /*
    *Periodo academico solo puede ser 1, 2 o I
    */
    void crearSemestre(int ano, char periodoAcademico, Date fechaInicio, Date fechaFin);
    
    void crearCurso(String id, String nombre, int creditosAcademicos, int horasAprovadasMonitorias);
    
    void crearTema(String idCurso, String tema, String descripcion);
    
    void crearProfesor(int id, String nombre, String apellido, String correo, String contrasena, String decanatura);
    
    /*
    *EL semestre de ingreso puede ser null
    */
    void crearMonitor(int id, String nombre, String apellido, String correo, String contrasena, int telefono, String programa, String semestreIngreso);
    
    /*
    *El monitor puede ser nulo, y en el semestre, se mete el ultimo semestre
    */
    void crearGrupo(int numero, String curso, int semestre, int profesor, int monitor);
    
    /*
    *El dia solo puede ser "lunes", "martes", "miercoles", "jueves", "viernes" o "sabado"
    */
    void crearMonitoria(int grupo, int dia, Time horaInicio, Time horaFin, String lugar);
    
    void asignarMonitorAGrupo(int idgrupo, int idmonitor);
    
    void asignarSemestreAMonitor(int idmonitor, int idsemestre);
    
    void crearEstudiante(int carnet, String nombre);
    
    void finalizarAsesoria(int idAsesoria, String observaciones);
    
    List<Asesoria> loadAsesoriasRealizandosePorMonitoriaRegistrada(int idMonitoriaRegistrada);
    
    void agregarTemaAAsesoria(int idAsesoria, int idTema);
    
    List<Curso> loadCursosQueTienenMonitoriasPorSemestre(int semestre);
    
    Curso loadCursoPorMonitoria(int idMonitoria);
    
}
