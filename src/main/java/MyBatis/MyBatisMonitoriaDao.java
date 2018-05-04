/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.MonitoriaDAO;
import Mappers.MonitoriaMapper;
import Modelo.Monitoria;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author David Rodriguez
 */
public class MyBatisMonitoriaDao implements MonitoriaDAO{

    @Inject
    MonitoriaMapper monitoriaMapper;
    
    
    @Override
    public List<Monitoria> loadMonitoriasPorMonitor(int idMonitor) {
        return monitoriaMapper.loadMonitoriasPorMonitor(idMonitor);
    }

    @Override
    public Monitoria monitoriasDisponiblesParaDictar(int idMonitor) {
        return monitoriaMapper.monitoriasDisponiblesParaDictar(idMonitor);
    }

    @Override
    public List<Monitoria> loadMonitorias(int semestre) {
        return monitoriaMapper.loadMonitorias(semestre);
    }

    @Override
    public List<Monitoria> loadMonitorias(String idcurso, int semestre) {
        return monitoriaMapper.loadMonitoriasPorCurso(idcurso, semestre);
    }
    
}
