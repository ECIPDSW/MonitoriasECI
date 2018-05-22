package DAOS;

import Modelo.Curso;
import java.util.List;

/**
 *DAO del curso
 * @author 666 Industries
 */
public interface CursoDAO {
    
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
    int numeroDeAsistenciasSegunCurso(String idCurso, int semestre);
    
    /**
     * Crea un curso
     * @param id ID del curso
     * @param nombre Nombre del curso
     * @param creditosAcademicos Creditos Academicos
     * @param horasAprovadasMonitorias Horas de Monitoria
     */
    void crearCurso(String id, String nombre, int creditosAcademicos, int horasAprovadasMonitorias);
    
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
    
    void eliminarCurso(String idCurso);
    
    void modificarCurso(String idCursoViejo, String idCursoNuevo, String nombre, Integer creditos, Integer horasMonitoria);
}
