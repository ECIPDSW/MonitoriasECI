/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Profesor;
import java.util.List;

/**
 *
 * @author 2124519
 */
public interface ProfesorDAO {
    Profesor loadProfesor(int id);
    Profesor loadProfesorLogin(int id,String psw);
    void crearProfesor(int id, String nombre, String apellido, String correo, String contrasena, String decanatura);
    List<Profesor> loadProfesores();
    void modificarProfesor(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena, String decanatura);
}
