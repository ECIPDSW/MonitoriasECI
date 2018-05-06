/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.MonitorDAO;
import Mappers.MonitorMapper;
import Modelo.Monitor;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author 2124519
 */
public class MyBatisMonitorDao implements MonitorDAO{
    @Inject
    private MonitorMapper monitormapper;

    @Override
    public Monitor loadMonitor(int id) {
        return monitormapper.loadMonitor(id);
    }

    @Override
    public Monitor loadMonitorLogin(int id, String psw) {
        return monitormapper.loadMonitorLogin(id, psw);
    }

    @Override
    public List<Monitor> loadMonitoresAsociadosProfesor(int idProfesor, int semestre) {
        return monitormapper.loadMonitoresAsociadosProfesor(idProfesor, semestre);
    }

    @Override
    public Monitor loadMonitorPorGrupo(int idgrupo) {
        return monitormapper.loadMonitorPorGrupo(idgrupo);
    }
    
}
