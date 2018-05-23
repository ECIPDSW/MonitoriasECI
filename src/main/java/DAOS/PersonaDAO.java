package DAOS;

import Modelo.Persona;
import java.util.List;

/**
 *DAO de la persona
 * @author 666 Industries
 */
public interface PersonaDAO {
    
    /**
     * Retorna todas las personas
     * @return Todas las personas
     */
    List<Persona> loadPersonas();
    
    void eliminarPersona(int id);
}
