package DAOS;

import Modelo.Administrador;
/**
 *DAO de la administrador
 * @author 666 Industries
 */
public interface AdministradorDAO {
    /**
     * Carga un administrador
     * @param id ID del administrador
     * @param psw Contra del administrador
     * @return administrador
     */
    Administrador loadAdmin(int id,String psw);
    
    /**
     * Modifica la informacion de un administrador
     * @param idViejo id viejo, puede ser nulo
     * @param idNuevo id para cambiar, puede ser nulo
     * @param nombre nombre al que se desea cambiar, puede ser nulo
     * @param apellido apellido que se desea cambiar, puede ser nulo
     * @param correo  correo que se desea cambiar, puede ser nulo
     * @param contasena  ontraseña que se desea cambiar, puede ser nulo
     */
    void modificarAdmin(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena);
}
