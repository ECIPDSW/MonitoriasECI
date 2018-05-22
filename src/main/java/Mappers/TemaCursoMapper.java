package Mappers;

import Modelo.TemaCurso;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper de tema del curso
 * @author 666 Industries
 */
public interface TemaCursoMapper {
    
    /**
     * retorna los temas disponibles para un curso
     * @param idCurso Id del curso
     * @return Todos los temas de ese curso
     */
    List<TemaCurso> loadTemasCurso(@Param("idcurso")String idCurso);
    
    /**
     * retorna los temas dicrtados en una asesoria
     * @param idAsesoria
     * @return Los temas de esa asesoria
     */
    List<TemaCurso> loadTemasAsesoria(@Param("idasesoria")int idAsesoria);
    
    /**
     * Asistencias segun tema
     * @param tema ID del tema
     * @param semestre Id del semestre
     * @return Asistencias segun tema
     */
    int numeroDeAsistenciasSegunTema(@Param("tema")int tema,@Param("semestre")int semestre);
    
    /**
     * Crea un tema
     * @param idCurso ID del curso
     * @param tema ID del tema
     * @param descripcion Descripcion del tema
     */
    void crearTema(@Param("idCurso")String idCurso,@Param("tema") String tema,@Param("des") String descripcion);
}
