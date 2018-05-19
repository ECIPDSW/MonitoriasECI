
package Mappers;

import Modelo.Semestre;
import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface SemestreMapper {
    Semestre loadSemestre(@Param("id")int id);
    Semestre loadSemestreActual();
    List<Semestre> loadSemestres();
    Semestre loadSemestreAnterior();
    void crearSemestre(@Param("ano")int ano, @Param("periodo")char periodoAcademico, @Param("fechaInicio")Date fechaInicio,@Param("fechaFin")Date fechaFin);
}
