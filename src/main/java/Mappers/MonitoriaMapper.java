/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Modelo.Monitoria;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author martincantorurrego
 */
public interface MonitoriaMapper {
    List<Monitoria> loadMonitoriasPorMonitor(@Param("id")int idMonitor);
    Monitoria monitoriasDisponiblesParaDictar(@Param("id")int idMonitor);
    List<Monitoria> loadMonitorias(@Param("semestre")int semestre);
    List<Monitoria> loadMonitoriasPorCurso(@Param("idcurso")String idcurso, @Param("semestre")int semestre);
    List<Date> loadFechasMonitorias(@Param("curso")String idCurso, @Param("semestre")int semestre);
    int numeroDeAsistenciasSegunFecha(@Param("curso")String idCurso,@Param("semestre")int semestre,@Param("fecha") Date fecha);
    List<Time> franjasMonitorias(@Param("curso")String idCurso,@Param("semestre") int semestre);
    int numeroDeAsistenciasSegunFranja(@Param("curso")String idCurso,@Param("semestre") int semestre,@Param("franja") Time franja);
    int numeroDeAsistenciasSegunMonitoria(@Param("monitoria")int idMonitoria);
}
