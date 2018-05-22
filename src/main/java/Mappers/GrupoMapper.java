package Mappers;

import Modelo.Grupo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper del grupo
 * @author 666 Industries
 */
public interface GrupoMapper {
    
    /**
     * retorna todods los grupos existentes para un curso
     * @param idCurso ID Curso
     * @param semestre ID semestre
     * @return Grupos de un curso
     */
    List<Grupo> loadGrupos(@Param("curso") String idCurso,@Param("semestre") int semestre);
    
    /**
     * devuelve todos los grupos por profesor
     * @param idProfesor ID del profesor
     * @param semestre ID del semestre
     * @return Grupos de un profesor
     */
    List<Grupo> loadGruposAsociadosProfesor(@Param("idprofesor")int idProfesor,@Param("semestre")int semestre);
    
    /**
     * Cuenta las asistencias dado un grupo
     * @param grupo Id del grupo
     * @return Asistencias de un grupo
     */
    int numeroDeAsistenciasSegunGrupo(@Param("grupo")int grupo);
    
    /**
     * Crea un grupo
     * @param numero Numero del grupo
     * @param curso Curso del grupo
     * @param semestre semestre del grupo,ULTIMO SEMESTRE
     * @param profesor Profesor del grupo, puede ser nulo
     * @param monitor Monitor del grupo, puede ser nulo
     */
    void crearGrupo(@Param("numero")int numero, @Param("curso")String curso, @Param("semestre")int semestre, @Param("profe")int profesor, @Param("moni")int monitor);
    
    /**
     * Asigna a un grupo un monitor
     * @param idgrupo ID del grupo
     * @param idmonitor Id del monitor
     */
    void asignarMonitorAGrupo(@Param("grupo")int idgrupo, @Param("moni")int idmonitor);
    
    void modificarGrupo(@Param("id")int idGrupo,@Param("numero") Integer numero,@Param("idCurso") String idCurso,@Param("semestre") Integer semestre,@Param("profe") Integer profesor,@Param("moni") Integer monitor);
    
    void eliminarGrupo(@Param("id")int idGrupo);
}
