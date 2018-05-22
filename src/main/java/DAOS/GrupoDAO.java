package DAOS;

import Modelo.Grupo;
import java.util.List;

/**
 *
 * @author 666 industries
 */
public interface GrupoDAO{
    
    /**
     * retorna todods los grupos existentes para un curso
     * @param idCurso ID Curso
     * @param semestre ID semestre
     * @return Grupos de un curso
     */
    List<Grupo> loadGrupos(String idCurso,int semestre);
    
    /**
     * devuelve todos los grupos por profesor
     * @param idProfesor ID del profesor
     * @param semestre ID del semestre
     * @return Grupos de un profesor
     */
    List<Grupo> loadGruposAsociadosProfesor(int idProfesor, int semestre);
    
    /**
     * Cuenta las asistencias dado un grupo
     * @param grupo Id del grupo
     * @return Asistencias de un grupo
     */
    int numeroDeAsistenciasSegunGrupo(int grupo);
    
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
     * Asigna a un grupo un monitor
     * @param idgrupo ID del grupo
     * @param idmonitor Id del monitor
     */
    void asignarMonitorAGrupo(int idgrupo, int idmonitor);
    
    /**
     * Modifica un grupo
     * @param idGrupo ID del grupo
     * @param numero numero del grupo
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @param profesor ID del profesor
     * @param monitor ID del monitor
     */
    void modificarGrupo(int idGrupo, Integer numero, String idCurso, Integer semestre, Integer profesor, Integer monitor);
    
    /**
     * Elimina un grupo
     * @param idGrupo ID del grupo
     */
    void eliminarGrupo(int idGrupo);
}
