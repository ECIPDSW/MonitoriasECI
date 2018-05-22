/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Persona;
import java.util.List;

/**
 *
 * @author David Rodriguez
 */
public interface PersonaDAO {
    List<Persona> loadPersonas();
}
