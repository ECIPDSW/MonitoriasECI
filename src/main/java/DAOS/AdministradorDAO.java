/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Administrador;
/**
 *
 * @author 2123162
 */
public interface AdministradorDAO {
    Administrador loadAdmin(int id,String psw);
    void modificarAdmin(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena);
}
