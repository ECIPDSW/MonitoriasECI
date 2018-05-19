
package Mappers;

import Modelo.TemaCurso;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface TemaCursoMapper {
    List<TemaCurso> loadTemasCurso(@Param("idcurso")String idCurso);
    List<TemaCurso> loadTemasAsesoria(@Param("idasesoria")int idAsesoria);
    int numeroDeAsistenciasSegunTema(@Param("tema")int tema,@Param("semestre")int semestre);
    void crearTema(@Param("idCurso")String idCurso,@Param("tema") String tema,@Param("des") String descripcion);
}
