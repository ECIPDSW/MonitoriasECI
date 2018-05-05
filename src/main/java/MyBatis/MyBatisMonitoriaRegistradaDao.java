/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.MonitoriaRegistradaDAO;
import DAOS.PersistenceException;
import Mappers.MonitoriaRegistradaMapper;
import Modelo.MonitoriaRegistrada;
import com.google.inject.Inject;
import java.util.List;
import org.postgresql.util.PSQLException;

/**
 *
 * @author martincantorurrego
 */
public class MyBatisMonitoriaRegistradaDao implements MonitoriaRegistradaDAO{

    @Inject
    MonitoriaRegistradaMapper monitoriaRegistradaMapper;
    
    @Override
    public void registrarInicioMonitoriaDictada(int idMonitoria, String ip){
        monitoriaRegistradaMapper.registrarInicioMonitoriaDictada(idMonitoria, ip);
    }

    @Override
    public void registrarFinMonitoria(int idMonitor) {
        monitoriaRegistradaMapper.registrarFinMonitoria(idMonitor);
    }

    @Override
    public List<MonitoriaRegistrada> loadMonitoriasRegistradasPorMonitoria(int idMonitoria) {
        return monitoriaRegistradaMapper.loadMonitoriasRegistradasPorMonitoria(idMonitoria);
    }
    
}
