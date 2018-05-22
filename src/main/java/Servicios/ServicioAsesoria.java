package Servicios;
import Modelo.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
/**
 *
 * @author 666 Industries
 */
public interface ServicioAsesoria {
    /**
     * Retorne el semestre
     * @param id Id del semestre
     * @return Semestre
     */
    Semestre getSemestre(int id);
    
    /**
     * Recibe el profesor
     * @param id Id Del profesor
     * @return Profesor
     */
    Profesor getProfesor(int id);
    
    /**
     * Recibe un monitor
     * @param id ID del monitor
     * @return Monitor
     */
    Monitor loadMonitor(int id);
    
    /**
     * Registra una asesoria
     * @param grupoAsistente grupo del estudainte asistente
     * @param monitoriaRegistrada monitoria registrada
     * @param idEstudiante ID del estudiante
     */
    void registrarAsesoria(int grupoAsistente, int monitoriaRegistrada, int idEstudiante);
    
    /**
     * registra el inicio de una monitoria en especifico por un monitor
     * @param idMonitoria ID de la monitoria
     * @param ip IP desde donde se hizo la entrada
     */
    void registrarInicioMonitoriaDictada(int idMonitoria,String ip);
    
    /**
     * registra el fin de la franja de un monitor
     * @param idMonitor ID del monitor
     */
    void registrarFinMonitoria(int idMonitor);
    
    /**
     * devuelve todas las monitorias que estan disponibles para dictar por el monitor 
     * en la hora actual
     * @param idMonitor ID del monitor
     * @return La monitoria disponible para dictar
     */
    Monitoria monitoriasDisponiblesParaDictar(int idMonitor);
    
    /**
     * Carga todos los cursos disponibles  
     * @return Todos los cursos
     */
    List<Curso> loadCursos();
    
    /**
     * Retorna todas las monitorias dictadas en un semestre especifico
     * @param semestre ID del semestre
     * @return Monitorias del semestre
     */
    List<Monitoria> loadMonitorias(int semestre);
  
     /**
     * Retorna todas las monitorias disponibles en el semestre actual de un curso en especifico
     * @param idcurso ID del curso
     * @param semestre ID del semestre
     * @return Monitorias por el curso y el semestre
     */
    List<Monitoria> loadMonitorias(String idcurso, int semestre);
    
     /**
     * Retorna todas las asesorias dictadas  el semestre especificado
     * @param semestre ID del semestre
     * @return Asesorias de ese semestre
     */
    List<Asesoria> loadAsesorias(int semestre);
    /**
     * Retorna todas las asesorias dictadas  por tema especificado
     * @param idTema ID del tema
     * @param semestre ID del semestre
     * @return  Las asesorias de un tema en un semestre
     */
    List<Asesoria> loadAsesoriasPorTema(int idTema,int semestre);
    /**
     * Retorna todas las asesorias dictadas  por monitor
     * @param idMonitor ID del monitor
     * @param semestre ID del semestre
     * @return Asesorias por un monitor
     */
    List<Asesoria> loadAsesoriasPorMonitor(int idMonitor,int semestre);
    
    /**
     * Retorna todas las asesorias dictadas  por Grupo
     * @param idGrupo ID del grupo
     * @return Asesorias por un grupo
     */
    List<Asesoria> loadAsesoriasPorGrupo(int idGrupo);
     /**
     * Retorna todas las asesorias dictadas  por curso
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @return Asesorias por el curso y el semestre
     */
    List<Asesoria> loadAsesoriasPorCurso(String idCurso, int semestre);
    
    /**
     * retorna todos los semestres que han sido creados
     * @return Todos los semestres
     */
    List<Semestre> loadSemestres();
    /**
     * retorna el semestre actual
     * @return Semestre actual
     */
    Semestre loadSemestreActual();
    
    /**
     * retorna los temas disponibles para un curso
     * @param idCurso Id del curso
     * @return Todos los temas de ese curso
     */
    List<TemaCurso> loadTemasCurso(String idCurso);
    
    /**
     * retorna los temas dicrtados en una asesoria
     * @param idAsesoria
     * @return Los temas de esa asesoria
     */
    List<TemaCurso> loadTemasAsesoria(int idAsesoria);
    
    /**
     * devuelve todos los monitores por profesor
     * @param idProfesor ID del profesor
     * @param semestre ID del semestre
     * @return Monitores de ese profesor
     */
    List<Monitor> loadMonitoresAsociadosProfesor(int idProfesor,int semestre);
    
    /**
     * devuelve todos los grupos por profesor
     * @param idProfesor ID del profesor
     * @param semestre ID del semestre
     * @return Grupos de un profesor
     */
    List<Grupo> loadGruposAsociadosProfesor(int idProfesor,int semestre);
    
    /**
     * retorna el administrador con las credenciales registradas
     * @param id ID del admin
     * @param psw Contra del admin
     * @return Adminsitrador
     */
    Administrador loadAdminLogin(int id,String psw);
    
    /**
     * retorna el monitor con las credenciales registradas
     * @param id ID del monitor
     * @param psw COntra del Monitor
     * @return Monitor
     */
    Monitor loadMonitorLogin(int id,String psw);
    
    /**
     * retorna el Profesor con las credenciales registradas
     * @param id ID del profesor
     * @param psw Contra del profesor
     * @return Profesor
     */
    Profesor loadProfesorLogin(int id,String psw);
    
    /**
     * retorna todods los grupos existentes para un curso
     * @param idCurso ID Curso
     * @param semestre ID semestre
     * @return Grupos de un curso
     */
    List<Grupo> loadGrupos(String idCurso,int semestre);
    
    /**
     * Carga las monitorias hechas por un monitor
     * @param idMonitor ID del monitor
     * @return Monitorias de un monitor
     */
    List<Monitoria> loadMonitoriasPorMonitor(int idMonitor);
    
    /**
     * Carga las Moniotiras registradas por un monitor
     * @param idMonitoria ID monitoria
     * @return Monitorias registradas
     */
    List<MonitoriaRegistrada> loadMonitoriasRegistradasPorMonitoria(int idMonitoria);
    
    /**
     * Carga las monitorias hechas en una monitoria registrada
     * @param idMonitoriaRegistrada ID de la monitoria registrada
     * @return Asesorias por una monitoria registrada
     */
    List<Asesoria> loadAsesoriasPorMonitoriaRegistrada(int idMonitoriaRegistrada);
    
    /**
     * Carga el monitor del grupo
     * @param idgrupo ID del grupo
     * @return Monitor por un grupo
     */
    Monitor loadMonitorPorGrupo(int idgrupo);
    
    /**
     * Carga el Estudiante que asistio a la asesoria
     * @param idasesoria ID asesoria
     * @return Estudiante que asistio a esa asesoria
     */
    Estudiante loadEstudiantePorAsesoria(int idasesoria);
    
    /**
     * Carga las fechas hechas en una monitoria
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @return Fechas de la monitoria
     */
    List<Date> loadFechasMonitorias(String idCurso, int semestre);
    
    /**
     * Cuenta las asistencias en una fecha
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @param fecha Fecha
     * @return Asistencias segun fecha
     */
    int numeroDeAsistenciasSegunFecha(String idCurso, int semestre, Date fecha);
    
    
    /**
     * Cuenta las asistencias dado un grupo
     * @param grupo Id del grupo
     * @return Asistencias de un grupo
     */
    int numeroDeAsistenciasSegunGrupo(int grupo);
    
    /**
     * Carga la hora de las monitorias
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @return Franjas
     */
    List<Time> franjasMonitorias(String idCurso, int semestre);
    
    /**
     * Cuenta las asistencias segun una franja
     * @param idCurso ID del curso
     * @param semestre Id del semestre
     * @param franja franja
     * @return asistencias segun franja y curso
     */
    int numeroDeAsistenciasSegunFranja(String idCurso, int semestre, Time franja);
    
    /**
     * Cuenta las asistencias segun monitoria
     * @param idMonitoria ID de la monitoria
     * @return Asistencias segun monitoria
     */
    int numeroDeAsistenciasSegunMonitoria(int idMonitoria);
    
    /**
     * Asistencias segun tema
     * @param tema ID del tema
     * @param semestre Id del semestre
     * @return Asistencias segun tema
     */
    int numeroDeAsistenciasSegunTema(int tema, int semestre);
    
    /**
     * Asistencias segun curso
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @return Asistencias segun curso
     */
    int numeroDeAsistenciasSegunCurso(String idCurso, int semestre);
    
    /**
     * Asesorias de una monitoria
     * @param idmonitoria ID de la monitoria
     * @return Asesorias en una monitoria
     */
    List<Asesoria> asesoriasDeUnaMonitoria(int idmonitoria); 
    
    /**
     * Carga el semestre anterior
     * @return Semestre anterior
     */
    Semestre loadSemestreAnterior();
    
    /**
     * Carga las monitorias por grupo
     * @param grupo ID del grupo
     * @return Lista de monitoria por grupo
     */
    List<Monitoria> loadMonitoriasPorGrupo(int grupo);
    
    /**
     * Crea un semestre
     * @param ano Año
     * @param periodoAcademico Periodo academico, solo puede ser 1, 2 o I
     * @param fechaInicio Fecha de inicio
     * @param fechaFin Fecha de finalizacion
     */
    void crearSemestre(int ano, char periodoAcademico, Date fechaInicio, Date fechaFin);
    
    /**
     * Crea un curso
     * @param id ID del curso
     * @param nombre Nombre del curso
     * @param creditosAcademicos Creditos Academicos
     * @param horasAprovadasMonitorias Horas de Monitoria
     */
    void crearCurso(String id, String nombre, int creditosAcademicos, int horasAprovadasMonitorias);
    
    /**
     * Crea un tema
     * @param idCurso ID del curso
     * @param tema ID del tema
     * @param descripcion Descripcion del tema
     */
    void crearTema(String idCurso, String tema, String descripcion);
    
    /**
     * Crea un profesor
     * @param id ID del profesor
     * @param nombre Nombre del profesor
     * @param apellido apellido del profesor
     * @param correo Correo del profesor
     * @param contrasena Contraseña del profesor
     * @param decanatura Decanatura
     */
    void crearProfesor(int id, String nombre, String apellido, String correo, String contrasena, String decanatura);
    
    /**
     * Crea un monitor
     * @param id ID de un monitor
     * @param nombre Nombre del monitor
     * @param apellido Apellio del monitor
     * @param correo Correo del monitor
     * @param contrasena Contraseña del monitor
     * @param telefono telefono del monitor
     * @param programa Programa de monitor
     * @param semestreIngreso semestre de ingreso, PUEDE SER NULO
     */
    void crearMonitor(int id, String nombre, String apellido, String correo, String contrasena, int telefono, String programa, String semestreIngreso);
    
    
    /**
     * Crea un grupo
     * @param numero Numero del grupo
     * @param curso Curso del grupo
     * @param semestre semestre del grupo,ULTIMO SEMESTRE
     * @param profesor Profesor del grupo, puede ser nulo
     * @param monitor Monitor del grupo, puede ser nulo
     */
    void crearGrupo(int numero, String curso, int semestre, int profesor, int monitor);

    /**
     * Crea una monitoria
     * @param grupo ID del grupo de la monitoria
     * @param dia Dia de la monitoria, El dia solo puede ser "lunes", "martes", "miercoles", "jueves", "viernes" o "sabado"
     * @param horaInicio Hora de inicio de la monitoria
     * @param horaFin Hora de fin de la monitoria
     * @param lugar Lugar de la monitoria
     */
    void crearMonitoria(int grupo, int dia, Time horaInicio, Time horaFin, String lugar);
    
    /**
     * Asigna a un grupo un monitor
     * @param idgrupo ID del grupo
     * @param idmonitor Id del monitor
     */
    void asignarMonitorAGrupo(int idgrupo, int idmonitor);
    
    /**
     * Asigna el semestre a un monitor
     * @param idmonitor ID del monitor
     * @param idsemestre ID del semestre
     */
    void asignarSemestreAMonitor(int idmonitor, int idsemestre);
    
    /**
     * Crea un estudiante
     * @param carnet Carnet del estudiante
     * @param nombre Nombre del estudiante
     */
    void crearEstudiante(int carnet, String nombre);
    
    /**
     * Finaliza una asesoria
     * @param idAsesoria Id de la asesoria
     * @param observaciones Observaciones de la asesoria, puede ser nulo
     */
    void finalizarAsesoria(int idAsesoria, String observaciones);
    
    /**
     * Asesorias por una monitoria registrada
     * @param idMonitoriaRegistrada ID de la monitoria registrada
     * @return Asesorias por una monitoria registrada
     */
    List<Asesoria> loadAsesoriasRealizandosePorMonitoriaRegistrada(int idMonitoriaRegistrada);
    
    /**
     * Agrega un tema a una asesoria
     * @param idAsesoria ID de la asesoria
     * @param idTema Id del tema
     */
    void agregarTemaAAsesoria(int idAsesoria, int idTema);
    
    /**
     * Lista de los cursos que tienen monitorias por ese semestre
     * @param semestre ID del semestre
     * @return Lista de cursos
     */
    List<Curso> loadCursosQueTienenMonitoriasPorSemestre(int semestre);
    
    /**
     * El curso de una monitoria
     * @param idMonitoria ID de la monitoria
     * @return Curso de la monitoria
     */
    Curso loadCursoPorMonitoria(int idMonitoria);
    
    /**
     * Retorna todas las personas
     * @return Todas las personas
     */
    List<Persona> loadPersonas();
    
    /**
     * Retorna todos los monitores
     * @return todos los monitores
     */
    List<Monitor> loadMonitores();
    
    /**
     * Retorna todos los profesores
     * @return todos los profesores
     */
    List<Profesor> loadProfesores();
    
    /**
     * Modifica la informacion de un monitor
     * @param idViejo id viejo, puede ser nulo
     * @param idNuevo id para cambiar, puede ser nulo
     * @param nombre nombre al que se desea cambiar, puede ser nulo
     * @param apellido apellido que se desea cambiar, puede ser nulo
     * @param correo  correo que se desea cambiar, puede ser nulo
     * @param contasena  contraseña que se desea cambiar, puede ser nulo
     * @param telefono telefono que se desea cambiar, puede ser nulo
     * @param programaAcademico programa que se desea cambiar, puede ser nulo
     * @param semestreDeIngreso semestre que se desea cambiar, puede ser nulo
     */
    void modificarMonitor(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena, Integer telefono, String programaAcademico, Integer semestreDeIngreso);
    
    /**
     * Modifica la informacion de un profesor
     * @param idViejo id viejo, puede ser nulo
     * @param idNuevo id para cambiar, puede ser nulo
     * @param nombre nombre al que se desea cambiar, puede ser nulo
     * @param apellido apellido que se desea cambiar, puede ser nulo
     * @param correo  correo que se desea cambiar, puede ser nulo
     * @param contasena  contraseña que se desea cambiar, puede ser nulo
     * @param decanatura decanatura que se desea cambiar
     */
    void modificarProfesor(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena, String decanatura);
    
    /**
     * Modifica la informacion de un administrador
     * @param idViejo id viejo, puede ser nulo
     * @param idNuevo id para cambiar, puede ser nulo
     * @param nombre nombre al que se desea cambiar, puede ser nulo
     * @param apellido apellido que se desea cambiar, puede ser nulo
     * @param correo  correo que se desea cambiar, puede ser nulo
     * @param contasena  ontraseña que se desea cambiar, puede ser nulo
     */
    void modificarAdmin(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena);
    
    
}
