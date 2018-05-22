package Mappers;

import Modelo.MonitoriaRegistrada;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *Mapper de la monitoria registrada
 * @author 666 Industries
 */
public interface MonitoriaRegistradaMapper {
    
    /**
     * registra el inicio de una monitoria en especifico por un monitor
     * @param idMonitoria ID de la monitoria
     * @param ip IP desde donde se hizo la entrada
     */
    void registrarInicioMonitoriaDictada(@Param("id")int idMonitoria,@Param("ip")String ip);
    
    /**
     * registra el fin de la franja de un monitor
     * @param idMonitor ID del monitor
     */
    void registrarFinMonitoria(@Param("id")int idMonitor);
    
    /**
     * Carga las Moniotiras registradas por un monitor
     * @param idMonitoria ID monitoria
     * @return Monitorias registradas
     */
    List<MonitoriaRegistrada> loadMonitoriasRegistradasPorMonitoria(@Param("idmonitoria")int idMonitoria);
}
