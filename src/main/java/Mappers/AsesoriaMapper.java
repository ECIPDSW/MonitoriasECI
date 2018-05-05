
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
    void registrarAsesoria(@Param("grupo")int grupo, @Param("moni")int monitor, @Param("idEst")int idEstudiante, @Param("nombreEst")String nombreEstudiante, @Param("obser")String observaciones);
    List<Asesoria> loadAsesorias(@Param("semestre")int semestre);
    List<Asesoria> loadAsesoriasPorTema(@Param("idtema")int idTema, @Param("semestre")int semestre);
    List<Asesoria> loadAsesoriasPorMonitor(@Param("idmonitor")int idMonitor,@Param("semestre")int semestre);
    List<Asesoria> loadAsesoriasPorGrupo(@Param("idgrupo")int idGrupo);
    List<Asesoria> loadAsesoriasPorCurso(@Param("idcurso")String idCurso,@Param("semestre")int semestre);
    List<Asesoria> loadAsesoriasPorMonitoriaRegistrada(@Param("idmonitoriaregistrada")int idMonitoriaRegistrada);
}
