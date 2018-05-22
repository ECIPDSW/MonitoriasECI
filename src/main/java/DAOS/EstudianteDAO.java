package DAOS;

import Modelo.Estudiante;

/**
 *DAO del estudiante
 * @author 666 industries
 */
public interface EstudianteDAO {
    
    /**
     * Carga el Estudiante que asistio a la asesoria
     * @param idasesoria ID asesoria
     * @return Estudiante que asistio a esa asesoria
     */
    Estudiante loadEstudiantePorAsesoria(int idasesoria);
    
    /**
     * Crea un estudiante
     * @param carnet Carnet del estudiante
     * @param nombre Nombre del estudiante
     */
    void crearEstudiante(int carnet, String nombre);
}
