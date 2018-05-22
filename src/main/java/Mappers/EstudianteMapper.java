package Mappers;

import Modelo.Estudiante;
import org.apache.ibatis.annotations.Param;

/**
 *Mapper del estudiante
 * @author 666 Indistries
 */
public interface EstudianteMapper {
    
    /**
     * Carga el Estudiante que asistio a la asesoria
     * @param idasesoria ID asesoria
     * @return Estudiante que asistio a esa asesoria
     */
    Estudiante loadEstudiantePorAsesoria(@Param("idasesoria")int idasesoria);
    
    /**
     * Crea un estudiante
     * @param carnet Carnet del estudiante
     * @param nombre Nombre del estudiante
     */
    void crearEstudiante(@Param("id")int carnet, @Param("nombre")String nombre);
}
