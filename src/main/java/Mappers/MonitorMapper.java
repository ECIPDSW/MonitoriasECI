
package Mappers;

import Modelo.Monitor;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonitorMapper {
    Monitor loadMonitor(@Param("id") int id);
    Monitor loadMonitorLogin(@Param("id")int id, @Param("psw")String psw);
    List<Monitor> loadMonitoresAsociadosProfesor(@Param("idprofesor")int idProfesor, @Param("semestre")int semestre);
    Monitor loadMonitorPorGrupo(@Param("idgrupo")int idgrupo);
}
