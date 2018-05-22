package MyBatis;

import DAOS.AdministradorDAO;
import Mappers.AdministradorMapper;
import Modelo.Administrador;
import com.google.inject.Inject;
import java.io.Serializable;

/**
 *DAO de My batis del administrador
 * @author 666 Industries
 */
public class MyBatisAdministradorDao implements AdministradorDAO,Serializable{

    @Inject
    AdministradorMapper administradorMapper;
    
    
    @Override
    public Administrador loadAdmin(int id, String psw) {
        return administradorMapper.loadAdmin(id, psw);
    }

    @Override
    public void modificarAdmin(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena) {
        administradorMapper.modificarAdmin(idViejo, idNuevo, nombre, apellido, correo, contasena);
    }
    
}
