
package Mappers;

import Modelo.TemaCurso;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface TemaCursoMapper {
    List<TemaCurso> loadTemasCurso(@Param("idcurso")String idCurso);
    List<TemaCurso> loadTemasAsesoria(@Param("idasesoria")int idAsesoria);
}
