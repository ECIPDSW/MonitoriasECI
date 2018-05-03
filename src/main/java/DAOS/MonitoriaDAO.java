/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Monitoria;
import java.util.List;


public interface MonitoriaDAO {
    List<Monitoria> loadMonitoriasPorMonitor(int idMonitor);
}
