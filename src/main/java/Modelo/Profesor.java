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
    private String decanatura;

    public Profesor() {
    }

    public Profesor(int idProfesor, String decanatura, String nombre, String apellido, String correo, String contraseña) {
        super(idProfesor, nombre, apellido, correo, contraseña);
        this.decanatura = decanatura;
    }

    public String getDecanatura() {
        return decanatura;
    }

    public void setDecanatura(String decanatura) {
        this.decanatura = decanatura;
    }


    @Override
    public String toString() {
        return super.toString() +  "Profesor{" + "decanatura=" + decanatura +'}';
    }

    
}
