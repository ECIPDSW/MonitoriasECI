package Mappers;

import Modelo.Profesor;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper del profesor
 * @author 666 Industries
 */
public interface ProfesorMapper {
    
    /**
     * Recibe el profesor
     * @param id Id Del profesor
     * @return Profesor
     */
    Profesor loadProfesor(@Param("id") int id);
    
    /**
     * retorna el Profesor con las credenciales registradas
     * @param id ID del profesor
     * @param psw Contra del profesor
     * @return Profesor
     */
    Profesor loadProfesorLogin(@Param("id")int id,@Param("psw")String psw);
    
    /**
     * Crea un profesor
     * @param id ID del profesor
     * @param nombre Nombre del profesor
     * @param apellido apellido del profesor
     * @param correo Correo del profesor
     * @param contrasena Contraseña del profesor
     * @param decanatura Decanatura
     */
    void crearProfesor(@Param("id")int id, @Param("nombre")String nombre, @Param("apellido")String apellido, @Param("correo")String correo, @Param("contra")String contrasena,@Param("dec") String decanatura);
    
    /**
     * Retorna todos los profesores
     * @return todos los profesores
     */
    List<Profesor> loadProfesores();
    
    /**
     * Modifica la informacion de un profesor
     * @param idViejo id viejo, puede ser nulo
     * @param idNuevo id para cambiar, puede ser nulo
     * @param nombre nombre al que se desea cambiar, puede ser nulo
     * @param apellido apellido que se desea cambiar, puede ser nulo
     * @param correo  correo que se desea cambiar, puede ser nulo
     * @param contasena  contraseña que se desea cambiar, puede ser nulo
     * @param decanatura decanatura que se desea cambiar
     */
    void modificarProfesor(@Param("idViejo")int idViejo, @Param("idNuevo")Integer idNuevo, @Param("nombre")String nombre, @Param("apellido")String apellido, @Param("correo")String correo, @Param("contra")String contasena,@Param("dec") String decanatura);
}
