
package Mappers;

import Modelo.Profesor;
import org.apache.ibatis.annotations.Param;


public interface ProfesorMapper {
    Profesor loadProfesor(@Param("id") int id);
}
