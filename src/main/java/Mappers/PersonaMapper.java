package Mappers;

import Modelo.Persona;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper de la persona
 * @author 666 Industries
 */
public interface PersonaMapper {
    
     /**
     * Retorna todas las personas
     * @return Todas las personas
     */
    List<Persona> loadPersonas();
    
    void eliminarPersona(@Param("id")int id);
}
