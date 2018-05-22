package DAOS;

import Modelo.Monitoria;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 * DAO de la monitoria
 * @author 666 Industries
 */
public interface MonitoriaDAO {
    
    /**
     * Carga las monitorias hechas por un monitor
     * @param idMonitor ID del monitor
     * @return Monitorias de un monitor
     */
    List<Monitoria> loadMonitoriasPorMonitor(int idMonitor);
    
    /**
     * devuelve todas las monitorias que estan disponibles para dictar por el monitor 
     * en la hora actual
     * @param idMonitor ID del monitor
     * @return La monitoria disponible para dictar
     */
    Monitoria monitoriasDisponiblesParaDictar(int idMonitor);
    
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
     * Carga las monitorias por grupo
     * @param grupo ID del grupo
     * @return Lista de monitoria por grupo
     */
    List<Monitoria> loadMonitoriasPorGrupo(int grupo);
    
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
     * Modifica una monitoria
     * @param IDmonitoria ID de la monitoria
     * @param grupo ID del grupo
     * @param dia Dia de la monitoria
     * @param horaInicio Hora de inicio de la monitoria
     * @param horaFin Hora Fin de la monitoria
     * @param lugar Lugar de la monitoria
     */
    void modificarMonitoria(int IDmonitoria, Integer grupo, String dia, Time horaInicio, Time horaFin, String lugar);
    
    /**
     * Elimina una monitoria
     * @param IDmonitoria ID de la monitoria
     */
    void eliminarMonitoria(int IDmonitoria);

}
