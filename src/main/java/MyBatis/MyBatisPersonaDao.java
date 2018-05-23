package MyBatis;

import DAOS.PersonaDAO;
import Mappers.PersonaMapper;
import Modelo.Persona;
import com.google.inject.Inject;
import java.util.List;

/**
 *DAO de My batis de la persona
 * @author 666 Industries
 */
public class MyBatisPersonaDao implements PersonaDAO{
    
    @Inject
    PersonaMapper personaMapper;
    
    @Override
    public List<Persona> loadPersonas(){
        return personaMapper.loadPersonas();
    }

    @Override
    public void eliminarPersona(int id) {
        personaMapper.eliminarPersona(id);
    }
}
