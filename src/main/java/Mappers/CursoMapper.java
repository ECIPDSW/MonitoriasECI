
package Mappers;

import Modelo.Curso;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface CursoMapper {
    List<Curso> loadCursos();
    int numeroDeAsistenciasSegunCurso(@Param("curso")String idCurso, @Param("semestre")int semestre);
}
