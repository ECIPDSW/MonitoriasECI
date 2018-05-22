package MyBatis;

import DAOS.MonitoriaRegistradaDAO;
import Mappers.MonitoriaRegistradaMapper;
import Modelo.MonitoriaRegistrada;
import com.google.inject.Inject;
import java.util.List;

/**
 *DAO de My batis de la monitori registrada
 * @author 666 Industries
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
