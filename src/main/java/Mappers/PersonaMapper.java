package Mappers;

import Modelo.Persona;
import java.util.List;

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
}
