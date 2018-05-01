/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martincantorurrego
 */
public class Profesor extends Persona implements Serializable{
    private int idProfesor;
    private String decanatura;

    public Profesor() {
    }

    public Profesor(int idProfesor, String decanatura, String nombre, String apellido, String correo, String contraseña) {
        super(idProfesor, nombre, apellido, correo, contraseña);
        this.idProfesor = idProfesor;
        this.decanatura = decanatura;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getDecanatura() {
        return decanatura;
    }

    public void setDecanatura(String decanatura) {
        this.decanatura = decanatura;
    }


    @Override
    public String toString() {
        return "Profesor{" + "idProfesor=" + idProfesor + ", decanatura=" + decanatura +'}';
    }

    
}
