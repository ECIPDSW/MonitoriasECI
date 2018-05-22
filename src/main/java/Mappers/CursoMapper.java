package Mappers;

import Modelo.Curso;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper del curso
 * @author 666 Industries
 */
public interface CursoMapper {
    
    /**
     * Carga todos los cursos disponibles  
     * @return Todos los cursos
     */
    List<Curso> loadCursos();
    
    /**
     * Asistencias segun curso
     * @param idCurso ID del curso
     * @param semestre ID del semestre
     * @return Asistencias segun curso
     */
    int numeroDeAsistenciasSegunCurso(@Param("curso")String idCurso, @Param("semestre")int semestre);
    
    /**
     * Crea un curso
     * @param id ID del curso
     * @param nombre Nombre del curso
     * @param creditosAcademicos Creditos Academicos
     * @param horasAprovadasMonitorias Horas de Monitoria
     */
    void crearCurso(@Param("id")String id, @Param("nombre")String nombre,@Param("creditos") int creditosAcademicos,@Param("horas") int horasAprovadasMonitorias);
    
    /**
     * Lista de los cursos que tienen monitorias por ese semestre
     * @param semestre ID del semestre
     * @return Lista de cursos
     */
    List<Curso> loadCursosQueTienenMonitoriasPorSemestre(@Param("semestre")int semestre);
    
    /**
     * El curso de una monitoria
     * @param idMonitoria ID de la monitoria
     * @return Curso de la monitoria
     */
    Curso loadCursoPorMonitoria(@Param("monitoria")int idMonitoria);
    
    /**
     * Elimina un curso
     * @param idCurso ID del curso
     */
    void eliminarCurso(@Param("id")String idCurso);
    
    /**
     * Modifica un curso
     * @param idCursoViejo ID del curso actualmente
     * @param idCursoNuevo ID del curso del que se quiere modificar
     * @param nombre nombre del curso
     * @param creditos creditos del curso
     * @param horasMonitoria horas del curso
     */
    void modificarCurso(@Param("idViejo")String idCursoViejo,@Param("idNuevo") String idCursoNuevo,@Param("nombre") String nombre,@Param("creditos") Integer creditos,@Param("horas") Integer horasMonitoria);
}
