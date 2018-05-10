/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.AsesoriaDAO;
import Mappers.AsesoriaMapper;
import Modelo.Asesoria;
import com.google.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author martincantorurrego
 */
public class MyBatisAsesoriaDao implements AsesoriaDAO,Serializable{
    @Inject
    private AsesoriaMapper asesoriaMapper;  

    @Override
    public void registrarAsesoria(int grupo, int monitor, int idEstudiante, String nombreEstudiante, String observaciones) {
        asesoriaMapper.registrarAsesoria(grupo, monitor, idEstudiante, nombreEstudiante, observaciones);
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
}