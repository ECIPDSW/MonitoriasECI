
package Mappers;

import Modelo.Semestre;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface SemestreMapper {
    Semestre loadSemestre(@Param("id")int id);
    Semestre loadSemestreActual();
    List<Semestre> loadSemestres();
    Semestre loadSemestreAnterior();
}
