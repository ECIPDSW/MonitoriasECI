/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Profesor;

/**
 *
 * @author 2124519
 */
public interface ProfesorDAO {
    Profesor loadProfesor(int id);
    Profesor loadProfesorLogin(int id,String psw);
}
