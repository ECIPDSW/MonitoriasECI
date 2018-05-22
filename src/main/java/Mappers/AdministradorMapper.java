package Mappers;

import Modelo.Administrador;
import org.apache.ibatis.annotations.Param;

/**
 *Mapper del administrador
 * @author 666 Industries
 */
public interface AdministradorMapper {
    
    /**
     * Carga un administrador
     * @param id ID del administrador
     * @param psw Contra del administrador
     * @return administrador
     */
    Administrador loadAdmin(@Param("id")int id,@Param("psw")String psw);
    
    /**
     * Modifica la informacion de un administrador
     * @param idViejo id viejo, puede ser nulo
     * @param idNuevo id para cambiar, puede ser nulo
     * @param nombre nombre al que se desea cambiar, puede ser nulo
     * @param apellido apellido que se desea cambiar, puede ser nulo
     * @param correo  correo que se desea cambiar, puede ser nulo
     * @param contasena  ontraseña que se desea cambiar, puede ser nulo
     */
    void modificarAdmin(@Param("idViejo")int idViejo, @Param("idNuevo")Integer idNuevo, @Param("nombre")String nombre, @Param("apellido")String apellido, @Param("correo")String correo, @Param("contra")String contasena);
}
