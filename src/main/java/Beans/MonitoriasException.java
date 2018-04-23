/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author 2125275
 */
public class MonitoriasException extends Exception {
    public static String BAD_USER="Usuario o Contraseña Inválida";
    public MonitoriasException(String message){
       super(message);
       
    }
    
}
