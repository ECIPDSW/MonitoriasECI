
package Mappers;

import Modelo.Grupo;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface GrupoMapper {
    List<Grupo> loadGrupos(@Param("curso") String idCurso,@Param("semestre") int semestre);
    List<Grupo> loadGruposAsociadosProfesor(@Param("idprofesor")int idProfesor,@Param("semestre")int semestre);
    int numeroDeAsistenciasSegunGrupo(@Param("grupo")int grupo);
    void crearGrupo(@Param("numero")int numero, @Param("curso")String curso, @Param("semestre")int semestre, @Param("profe")int profesor, @Param("moni")int monitor);
    void asignarMonitorAGrupo(@Param("grupo")int idgrupo, @Param("moni")int idmonitor);
}
