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
public class Monitor extends Persona{
    private int telefonoMovil;
    private String programaAcademico;
    private Semestre semestreDeIngreso;
    private ArrayList<Grupo> grupos;

    public Monitor() {
    }

    public Monitor(int telefonoMovil, String ProgramaAcademico, Semestre semestreDeIngreso, ArrayList<Grupo> grupos, int id, String nombre, String apellido, String correo, String contraseña) {
        super(id, nombre, apellido, correo, contraseña);
        this.telefonoMovil = telefonoMovil;
        this.programaAcademico = ProgramaAcademico;
        this.semestreDeIngreso = semestreDeIngreso;
        this.grupos = grupos;
    }

    public int getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String ProgramaAcademico) {
        this.programaAcademico = ProgramaAcademico;
    }

    public Semestre getSemestreDeIngreso() {
        return semestreDeIngreso;
    }

    public void setSemestreDeIngreso(Semestre semestreDeIngreso) {
        this.semestreDeIngreso = semestreDeIngreso;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "Monitor{" + "telefonoMovil=" + telefonoMovil + ", ProgramaAcademico=" + programaAcademico + ", semestreDeIngreso=" + semestreDeIngreso + ", grupos=" + grupos + '}';
    }

    
      
}
