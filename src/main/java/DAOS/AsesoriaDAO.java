package DAOS;

import Modelo.Asesoria;
import java.util.List;

/**
 *DAO de la asesoria
 * @author 666 Industries
 */
public interface AsesoriaDAO {
    
    /**
     * Registra una asesoria
     * @param grupo grupo del estudainte asistente
     * @param monitoriaRegistrada monitoria registrada
     * @param idEstudiante ID del estudiante
     */
    void registrarAsesoria(int grupo, int monitoriaRegistrada, int idEstudiante);
    
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
    List<Asesoria> loadAsesoriasPorTema(int idTema, int semestre);
    
    /**
     * Retorna todas las asesorias dictadas  por monitor
     * @param idMonitor ID del monitor
     * @param semestre ID del semestre
     * @return Asesorias por un monitor
     */
    List<Asesoria> loadAsesoriasPorMonitor(int idMonitor, int semestre);
    
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
     * Carga las monitorias hechas en una monitoria registrada
     * @param idMonitoriaRegistrada ID de la monitoria registrada
     * @return Asesorias por una monitoria registrada
     */
    List<Asesoria> loadAsesoriasPorMonitoriaRegistrada(int idMonitoriaRegistrada);
    
    /**
     * Asesorias de una monitoria
     * @param idmonitoria ID de la monitoria
     * @return Asesorias en una monitoria
     */
    List<Asesoria> asesoriasDeUnaMonitoria(int idmonitoria);
    
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
    
}
