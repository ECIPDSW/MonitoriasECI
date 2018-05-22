package MyBatis;

import DAOS.GrupoDAO;
import Mappers.GrupoMapper;
import Modelo.Grupo;
import com.google.inject.Inject;
import java.util.List;

/**
 *DAO de My batis del grupo
 * @author 666 Industries
 */
public class MyBatisGrupoDao implements GrupoDAO{
    @Inject
    private GrupoMapper grupoMapper;

    @Override
    public List<Grupo> loadGrupos(String idCurso, int semestre) {
        return grupoMapper.loadGrupos(idCurso, semestre);
    }

    @Override
    public List<Grupo> loadGruposAsociadosProfesor(int idProfesor, int semestre) {
        return grupoMapper.loadGruposAsociadosProfesor(idProfesor, semestre);
    }

    @Override
    public int numeroDeAsistenciasSegunGrupo(int grupo) {
        return grupoMapper.numeroDeAsistenciasSegunGrupo(grupo);
    }

    @Override
    public void crearGrupo(int numero, String curso, int semestre, int profesor, int monitor) {
        grupoMapper.crearGrupo(numero, curso, semestre, profesor, monitor);
    }

    @Override
    public void asignarMonitorAGrupo(int idgrupo, int idmonitor) {
        grupoMapper.asignarMonitorAGrupo(idgrupo, idmonitor);
    }

    @Override
    public void modificarGrupo(int idGrupo, Integer numero, String idCurso, Integer semestre, Integer profesor, Integer monitor) {
        grupoMapper.modificarGrupo(idGrupo, numero, idCurso, semestre, profesor, monitor);
    }

    @Override
    public void eliminarGrupo(int idGrupo) {
        grupoMapper.eliminarGrupo(idGrupo);
    }
}
