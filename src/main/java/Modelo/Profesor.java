/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martincantorurrego
 */
public class Profesor extends Persona{
    private String decanatura;
    private ArrayList<Grupo> grupos;

    public Profesor(String Decanatura, ArrayList<Grupo> grupos, int id, String nombre, String apellido, String correo, String contraseña) {
        super(id, nombre, apellido, correo, contraseña);
        this.decanatura = Decanatura;
        this.grupos = grupos;
    }

    public Profesor() {
    }

    public String getDecanatura() {
        return decanatura;
    }

    public void setDecanatura(String Decanatura) {
        this.decanatura = Decanatura;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "Profesor{" + "Decanatura=" + decanatura + ", grupos=" + grupos + '}';
    }
    
    
    
}
