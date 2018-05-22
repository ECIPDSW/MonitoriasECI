package DAOS;

import Modelo.MonitoriaRegistrada;
import java.util.List;

/**
 *DAO de la monitoria registrada
 * @author 666 Industries
 */
public interface MonitoriaRegistradaDAO {
    
    /**
     * registra el inicio de una monitoria en especifico por un monitor
     * @param idMonitoria ID de la monitoria
     * @param ip IP desde donde se hizo la entrada
     */
    void registrarInicioMonitoriaDictada(int idMonitoria,String ip);
    
    /**
     * registra el fin de la franja de un monitor
     * @param idMonitor ID del monitor
     */
    void registrarFinMonitoria(int idMonitor);
    
    /**
     * Carga las Moniotiras registradas por un monitor
     * @param idMonitoria ID monitoria
     * @return Monitorias registradas
     */
    List<MonitoriaRegistrada> loadMonitoriasRegistradasPorMonitoria(int idMonitoria);
    
}
