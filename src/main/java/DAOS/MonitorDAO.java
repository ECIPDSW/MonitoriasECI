/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Monitor;

/**
 *
 * @author 2124519
 */
public interface MonitorDAO {
    Monitor loadMonitor(int id);
}