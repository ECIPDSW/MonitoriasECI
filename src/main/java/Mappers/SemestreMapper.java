
package Mappers;

import Modelo.Semestre;
import java.util.Date;
import org.apache.ibatis.annotations.Param;


public interface SemestreMapper {
    Semestre loadSemestre(@Param("id")int id);
}
