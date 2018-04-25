
package Mappers;

import Modelo.Monitor;
import org.apache.ibatis.annotations.Param;

public interface MonitorMapper {
    Monitor loadMonitor(@Param("id") int id);
    
}
