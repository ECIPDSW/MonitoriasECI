package DAOS;

import Modelo.TemaCurso;
import java.util.List;

/**
 *DAO de tema por curso
 * @author 666 Industries
 */
public interface TemaCursoDAO {
    
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
     * Asistencias segun tema
     * @param tema ID del tema
     * @param semestre Id del semestre
     * @return Asistencias segun tema
     */
    int numeroDeAsistenciasSegunTema(int tema, int semestre);
    
    /**
     * Crea un tema
     * @param idCurso ID del curso
     * @param tema ID del tema
     * @param descripcion Descripcion del tema
     */
    void crearTema(String idCurso, String tema, String descripcion);
    
    void eliminarTemaCurso(int idTema);
    
    void modificarTemaCurso(int IDtema, String tema, String descripcion, String curso);
}
