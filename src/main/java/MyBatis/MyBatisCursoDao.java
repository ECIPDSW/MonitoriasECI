package MyBatis;

import DAOS.CursoDAO;
import Mappers.CursoMapper;
import Modelo.Curso;
import com.google.inject.Inject;
import java.util.List;

/**
 *DAO de My batis del curso
 * @author 666 Industries
 */
public class MyBatisCursoDao implements CursoDAO{
    
    @Inject
    private CursoMapper cursoMapper;

    @Override
    public List<Curso> loadCursos() {
        return cursoMapper.loadCursos();
    }

    @Override
    public int numeroDeAsistenciasSegunCurso(String idCurso, int semestre) {
        return cursoMapper.numeroDeAsistenciasSegunCurso(idCurso, semestre);
    }

    @Override
    public void crearCurso(String id, String nombre, int creditosAcademicos, int horasAprovadasMonitorias) {
        cursoMapper.crearCurso(id, nombre, creditosAcademicos, horasAprovadasMonitorias);
    }

    @Override
    public List<Curso> loadCursosQueTienenMonitoriasPorSemestre(int semestre) {
        return cursoMapper.loadCursosQueTienenMonitoriasPorSemestre(semestre);
    }

    @Override
    public Curso loadCursoPorMonitoria(int idMonitoria) {
        return cursoMapper.loadCursoPorMonitoria(idMonitoria);
    }
    
}
