package Mappers;

import Modelo.Monitoria;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *Mapper de la monitoria
 * @author 666 Industries
 */
public interface MonitoriaMapper {
    
    /**
     * Carga las monitorias hechas por un monitor
     * @param idMonitor ID del monitor
     * @return Monitorias de un monitor
     */
    List<Monitoria> loadMonitoriasPorMonitor(@Param("id")int idMonitor);
    
    /**
     * devuelve todas las monitorias que estan disponibles para dictar por el monitor 
     * en la hora actual
     * @param idMonitor ID del monitor
     * @return La monitoria disponible para dictar
     */
    Monitoria monitoriasDisponiblesParaDictar(@Param("id")int idMonitor);
    
    /**
     * Retorna todas las monitorias dictadas en un semestre especifico
     * @param semestre ID del semestre
     * @return Monitorias del semestre
     */
    List<Monitoria> loadMonitorias(@Param("semestre")int semestre);
    
    /**
     * Retorna todas las monitorias disponibles en el semestre actual de un curso en especifico
     * @param idcurso ID del curso
     * @param semestre ID del semestre
     * @return Monitorias por el curso y el semestre
     */
    List<Monitoria> loadMonitoriasPorCurso(@Param("idcurso")String idcurso, @Param("semestre")int semestre);
    
    /**
     * Carga las fechas hechas en una monitoria
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @return Fechas de la monitoria
     */
    List<Date> loadFechasMonitorias(@Param("curso")String idCurso, @Param("semestre")int semestre);
    
    /**
     * Cuenta las asistencias en una fecha
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @param fecha Fecha
     * @return Asistencias segun fecha
     */
    int numeroDeAsistenciasSegunFecha(@Param("curso")String idCurso,@Param("semestre")int semestre,@Param("fecha") Date fecha);
    
    /**
     * Carga la hora de las monitorias
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @return Franjas
     */
    List<Time> franjasMonitorias(@Param("curso")String idCurso,@Param("semestre") int semestre);
    
    /**
     * Cuenta las asistencias segun una franja
     * @param idCurso ID del curso
     * @param semestre Id del semestre
     * @param franja franja
     * @return asistencias segun franja y curso
     */
    int numeroDeAsistenciasSegunFranja(@Param("curso")String idCurso,@Param("semestre") int semestre,@Param("franja") Time franja);
    
    /**
     * Cuenta las asistencias segun monitoria
     * @param idMonitoria ID de la monitoria
     * @return Asistencias segun monitoria
     */
    int numeroDeAsistenciasSegunMonitoria(@Param("monitoria")int idMonitoria);
    
    /**
     * Carga las monitorias por grupo
     * @param grupo ID del grupo
     * @return Lista de monitoria por grupo
     */
    List<Monitoria> loadMonitoriasPorGrupo(@Param("grupo")int grupo);
    
    /**
     * Crea una monitoria
     * @param grupo ID del grupo de la monitoria
     * @param dia Dia de la monitoria, El dia solo puede ser "lunes", "martes", "miercoles", "jueves", "viernes" o "sabado"
     * @param horaInicio Hora de inicio de la monitoria
     * @param horaFin Hora de fin de la monitoria
     * @param lugar Lugar de la monitoria
     */
    void crearMonitoria(@Param("grupo")int grupo,@Param("dia") int dia,@Param("inicio") Time horaInicio,@Param("fin") Time horaFin,@Param("lugar") String lugar);
    
    /**
     * Modifica una monitoria
     * @param IDmonitoria ID de la monitoria
     * @param grupo ID del grupo
     * @param dia Dia de la monitoria
     * @param horaInicio Hora de inicio de la monitoria
     * @param horaFin Hora Fin de la monitoria
     * @param lugar Lugar de la monitoria
     */
    void modificarMonitoria(@Param("id")int IDmonitoria, @Param("grupo") Integer grupo,@Param("dia") String dia,@Param("horaInicio") Time horaInicio,@Param("horaFin") Time horaFin,@Param("lugar") String lugar);
    
    /**
     * Elimina una monitoria
     * @param IDmonitoria ID de la monitoria
     */
    void eliminarMonitoria(@Param("id")int IDmonitoria);
    
    List<Integer> asistenciasPorMonitoria();

}
