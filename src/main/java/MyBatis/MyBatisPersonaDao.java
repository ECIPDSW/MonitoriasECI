/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.PersonaDAO;
import Mappers.PersonaMapper;
import Modelo.Persona;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author David Rodriguez
 */
public class MyBatisPersonaDao implements PersonaDAO{
    
    @Inject
    PersonaMapper personaMapper;
    
    @Override
    public List<Persona> loadPersonas(){
        return personaMapper.loadPersonas();
    }
}
