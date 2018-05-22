/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Modelo.Administrador;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author martincantorurrego
 */
public interface AdministradorMapper {
    Administrador loadAdmin(@Param("id")int id,@Param("psw")String psw);
    void modificarAdmin(@Param("idViejo")int idViejo, @Param("idNuevo")Integer idNuevo, @Param("nombre")String nombre, @Param("apellido")String apellido, @Param("correo")String correo, @Param("contra")String contasena);
}
