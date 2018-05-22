/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.AdministradorDAO;
import Mappers.AdministradorMapper;
import Modelo.Administrador;
import com.google.inject.Inject;
import java.io.Serializable;

/**
 *
 * @author 2123162
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
