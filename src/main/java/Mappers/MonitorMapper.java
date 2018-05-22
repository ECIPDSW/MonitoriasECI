
package Mappers;

import Modelo.Monitor;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonitorMapper {
    Monitor loadMonitor(@Param("id") int id);
    Monitor loadMonitorLogin(@Param("id")int id, @Param("psw")String psw);
    List<Monitor> loadMonitoresAsociadosProfesor(@Param("idprofesor")int idProfesor, @Param("semestre")int semestre);
    Monitor loadMonitorPorGrupo(@Param("idgrupo")int idgrupo);
    void crearMonitor(@Param("id")int id, @Param("nombre")String nombre, @Param("apellido")String apellido, @Param("correo")String correo, @Param("contra")String contrasena, @Param("tel")int telefono, @Param("programa")String programa, @Param("semestre")String semestreIngreso);
    void asignarSemestreAMonitor(@Param("moni")int idmonitor, @Param("semestre")int idsemestre);
    List<Monitor> loadMonitores();
}
