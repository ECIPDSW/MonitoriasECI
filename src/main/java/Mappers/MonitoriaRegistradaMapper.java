/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import org.apache.ibatis.annotations.Param;

/**
 *
 * @author martincantorurrego
 */
public interface MonitoriaRegistradaMapper {
    void registrarInicioMonitoriaDictada(@Param("id")int idMonitoria,@Param("ip")String ip);
    void registrarFinMonitoria(@Param("id")int idMonitor);
}
