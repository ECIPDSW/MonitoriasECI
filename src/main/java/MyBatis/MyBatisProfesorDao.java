/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.ProfesorDAO;
import Mappers.ProfesorMapper;
import Modelo.Profesor;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author 2124519
 */
public class MyBatisProfesorDao implements ProfesorDAO{
    @Inject
    private ProfesorMapper profesorMapper;

    @Override
    public Profesor loadProfesor(int id) {
        return profesorMapper.loadProfesor(id);
    }

    @Override
    public Profesor loadProfesorLogin(int id, String psw) {
        return profesorMapper.loadProfesorLogin(id, psw);
    }

    @Override
    public void crearProfesor(int id, String nombre, String apellido, String correo, String contrasena, String decanatura) {
        profesorMapper.crearProfesor(id, nombre, apellido, correo, contrasena, decanatura);
    }

    @Override
    public List<Profesor> loadProfesores() {
        return profesorMapper.loadProfesores();
    }

    @Override
    public void modificarProfesor(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena, String decanatura) {
        profesorMapper.modificarProfesor(idViejo, idNuevo, nombre, apellido, correo, contasena, decanatura);
    }
    
}
