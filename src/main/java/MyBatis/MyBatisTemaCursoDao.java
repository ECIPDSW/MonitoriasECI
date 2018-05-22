package MyBatis;

import DAOS.TemaCursoDAO;
import Mappers.TemaCursoMapper;
import Modelo.TemaCurso;
import com.google.inject.Inject;
import java.util.List;

/**
 *DAO de My batis del administradorl tema del curso
 * @author 666 industries
 */
public class MyBatisTemaCursoDao implements TemaCursoDAO{

    @Inject
    TemaCursoMapper temaCurso;
    
    @Override
    public List<TemaCurso> loadTemasCurso(String idCurso) {
        return temaCurso.loadTemasCurso(idCurso);
    }

    @Override
    public List<TemaCurso> loadTemasAsesoria(int idAsesoria) {
        return temaCurso.loadTemasAsesoria(idAsesoria);
    }

    @Override
    public int numeroDeAsistenciasSegunTema(int tema, int semestre) {
        return temaCurso.numeroDeAsistenciasSegunTema(tema, semestre);
    }

    @Override
    public void crearTema(String idCurso, String tema, String descripcion) {
        temaCurso.crearTema(idCurso, tema, descripcion);;
    }

    @Override
    public void eliminarTemaCurso(int idTema) {
        temaCurso.eliminarTemaCurso(idTema);
    }

    @Override
    public void modificarTemaCurso(int IDtema, String tema, String descripcion, String curso) {
        temaCurso.modificarTemaCurso(IDtema, tema, descripcion, curso);
    }
    
}
