
package Mappers;

import Modelo.Semestre;
import org.apache.ibatis.annotations.Param;


public interface SemestreMapper {
    Semestre consultarSemestre(@Param("num") int num);
}
