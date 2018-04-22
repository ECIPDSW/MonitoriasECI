/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author martincantorurrego
 */
public class Persona{
    private int Codigo;
    private String Nombre;
    private String Apellido;
    private String Correo;
    //private String Contraseña;
    private int TelefonoMovil;
    
    public Persona(int codigo, String nombre,String apellido,String correo,int telefonoMovil){
        Codigo = codigo;
        Nombre = nombre;
        Apellido=apellido;
        Correo=correo;
        TelefonoMovil=telefonoMovil;
    }
    
    public void setCodigo(int codigo){
        Codigo = codigo;
    }
    
    public int getCodigo(){
        return Codigo;
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setApellido(String apellido){
        Apellido = apellido;
    }
    
    public String getApellido(){
        return Apellido;
    }
   
    public void setCorreo(String correo){
        Correo = correo;
    }
    
    public String getCorreo(){
        return Correo;
    }
    
    public void setTelefonoMovil(int telefonoMovil){
        TelefonoMovil = telefonoMovil;
    }
    
    public int getTelefonoMovil(){
        return TelefonoMovil;
    }
    
    public String toString(){
        return "{  Codigo" +Codigo+ ", Nombre :" + Nombre + ", Apellido :" + Apellido + ", Correo: "+ Correo +", TelefonoMovil"+TelefonoMovil ;
    }
    
}
