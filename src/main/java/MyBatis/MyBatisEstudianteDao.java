package MyBatis;

import DAOS.EstudianteDAO;import Mappers.EstudianteMapper;
import Modelo.Estudiante;
import com.google.inject.Inject;

/**
 *DAO de My batis del estudiante
 * @author 666 Industries
 */
public class MyBatisEstudianteDao implements EstudianteDAO{
    @Inject
    private EstudianteMapper estudiante;

    @Override
    public Estudiante loadEstudiantePorAsesoria(int idasesoria) {
        return estudiante.loadEstudiantePorAsesoria(idasesoria);
    }

    @Override
    public void crearEstudiante(int carnet, String nombre) {
        estudiante.crearEstudiante(carnet, nombre);
    }

 
}
