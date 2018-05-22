package MyBatis;

import DAOS.ProfesorDAO;
import Mappers.ProfesorMapper;
import Modelo.Profesor;
import com.google.inject.Inject;
import java.util.List;

/**
 *DAO de My batis del profesor
 * @author 666 Industries
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
