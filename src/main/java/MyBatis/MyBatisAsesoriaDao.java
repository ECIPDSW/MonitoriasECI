package MyBatis;

import DAOS.AsesoriaDAO;
import Mappers.AsesoriaMapper;
import Modelo.Asesoria;
import com.google.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *DAO de My batis de la asesoria
 * @author 666 Industries
 */
public class MyBatisAsesoriaDao implements AsesoriaDAO,Serializable{
    @Inject
    private AsesoriaMapper asesoriaMapper;  

    @Override
    public void registrarAsesoria(int grupo, int monitoriaRegistrada, int idEstudiante) {
        asesoriaMapper.registrarAsesoria(grupo, monitoriaRegistrada, idEstudiante);
}

    @Override
    public List<Asesoria> loadAsesorias(int semestre) {
        return asesoriaMapper.loadAsesorias(semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorTema(int idTema, int semestre) {
        return asesoriaMapper.loadAsesoriasPorTema(idTema, semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorMonitor(int idMonitor, int semestre) {
        return asesoriaMapper.loadAsesoriasPorMonitor(idMonitor, semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorGrupo(int idGrupo) {
        return asesoriaMapper.loadAsesoriasPorGrupo(idGrupo);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorCurso(String idCurso, int semestre) {
        return asesoriaMapper.loadAsesoriasPorCurso(idCurso, semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorMonitoriaRegistrada(int idMonitoriaRegistrada) {
        return asesoriaMapper.loadAsesoriasPorMonitoriaRegistrada(idMonitoriaRegistrada);
    }

    @Override
    public List<Asesoria> asesoriasDeUnaMonitoria(int idmonitoria) {
        return asesoriaMapper.asesoriasDeUnaMonitoria(idmonitoria);
    }

    @Override
    public void finalizarAsesoria(int idAsesoria, String observaciones) {
        asesoriaMapper.finalizarAsesoria(idAsesoria, observaciones);
    }

    @Override
    public List<Asesoria> loadAsesoriasRealizandosePorMonitoriaRegistrada(int idMonitoriaRegistrada) {
        return asesoriaMapper.loadAsesoriasRealizandosePorMonitoriaRegistrada(idMonitoriaRegistrada);
    }
}