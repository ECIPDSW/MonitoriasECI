/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Modelo.Monitoria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author martincantorurrego
 */
public interface MonitoriaMapper {
    List<Monitoria> loadMonitoriasPorMonitor(@Param("id")int idMonitor);
    Monitoria monitoriasDisponiblesParaDictar(@Param("id")int idMonitor);
}
