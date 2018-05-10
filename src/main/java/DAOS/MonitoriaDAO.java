/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Monitoria;
import java.sql.Date;
import java.sql.Time;
import java.util.List;


public interface MonitoriaDAO {
    List<Monitoria> loadMonitoriasPorMonitor(int idMonitor);
    Monitoria monitoriasDisponiblesParaDictar(int idMonitor);
    List<Monitoria> loadMonitorias(int semestre);
    List<Monitoria> loadMonitorias(String idcurso, int semestre);
    List<Date> loadFechasMonitorias(String idCurso, int semestre);
    int numeroDeAsistenciasSegunFecha(String idCurso, int semestre, Date fecha);
    List<Time> franjasMonitorias(String idCurso, int semestre);
    int numeroDeAsistenciasSegunFranja(String idCurso, int semestre, Time franja);
    int numeroDeAsistenciasSegunMonitoria(int idMonitoria);
    
}
