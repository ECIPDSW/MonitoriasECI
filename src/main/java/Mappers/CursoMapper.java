
package Mappers;

import Modelo.Curso;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface CursoMapper {
    List<Curso> loadCursos();
    int numeroDeAsistenciasSegunCurso(@Param("curso")String idCurso, @Param("semestre")int semestre);
    void crearCurso(@Param("id")String id, @Param("nombre")String nombre,@Param("creditos") int creditosAcademicos,@Param("horas") int horasAprovadasMonitorias);
}
