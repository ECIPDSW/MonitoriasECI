
package Mappers;

import Modelo.Semestre;
import org.apache.ibatis.annotations.Param;


public interface SemestreMapper {
    public Semestre loadSemestre(@Param("id")int id);
}
