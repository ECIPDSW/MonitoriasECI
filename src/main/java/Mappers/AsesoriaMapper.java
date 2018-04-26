
package Mappers;

import Modelo.Asesoria;
import Modelo.Monitor;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface AsesoriaMapper {
    
    //public List<Asesoria> consultarAsesorias();         
    //public Asesoria consultarAsesoria(@Param("id")int id);
    //public void registrarInformacionDeLaAsesoria();
    //public void registrarInformacionDeUnAsistente(@Param("id")int id);
    void registrarAsesoria(@Param("grupo")int grupo, @Param("moni")int monitoria, @Param("idEst")int idEstudiante, @Param("nombreEst")int nombreEstudiante, @Param("obser")String observaciones);
}
