
package Mappers;

import Modelo.Profesor;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface ProfesorMapper {
    Profesor loadProfesor(@Param("id") int id);
    Profesor loadProfesorLogin(@Param("id")int id,@Param("psw")String psw);
    void crearProfesor(@Param("id")int id, @Param("nombre")String nombre, @Param("apellido")String apellido, @Param("correo")String correo, @Param("contra")String contrasena,@Param("dec") String decanatura);
    List<Profesor> loadProfesores();
}
