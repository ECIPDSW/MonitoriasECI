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
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    //private String Contraseña;
    private int telefonoMovil;
    
    public Persona(){}

    public Persona(int id, String nombre, String apellido, String correo, int telefonoMovil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefonoMovil = telefonoMovil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    
    
    public String toString(){
        return "{  Codigo" +id+ ", Nombre :" + nombre + ", Apellido :" + apellido + ", Correo: "+ correo +", TelefonoMovil"+telefonoMovil ;
    }
    
}
