/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Monitor;
import java.util.List;

/**
 *
 * @author 2124519
 */
public interface MonitorDAO {
    Monitor loadMonitor(int id);
    Monitor loadMonitorLogin(int id, String psw);
    List<Monitor> loadMonitoresAsociadosProfesor(int idProfesor, int semestre);
    Monitor loadMonitorPorGrupo(int idgrupo);
    void crearMonitor(int id, String nombre, String apellido, String correo, String contrasena, int telefono, String programa, String semestreIngreso);
    void asignarSemestreAMonitor(int idmonitor, int idsemestre);
    List<Monitor> loadMonitores();
}
