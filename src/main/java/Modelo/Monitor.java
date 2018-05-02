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
public class Monitor extends Persona implements Serializable{
    private int telefonoMovil;
    private String programaAcademico;
    private Semestre semestreDeIngreso;

    public Monitor() {
    }

    public Monitor(int idMonitor, int telefonoMovil, String programaAcademico, Semestre semestreDeIngreso, String nombre, String apellido, String correo, String contraseña) {
        super(idMonitor, nombre, apellido, correo, contraseña);
        this.telefonoMovil = telefonoMovil;
        this.programaAcademico = programaAcademico;
        this.semestreDeIngreso = semestreDeIngreso;
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

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public Semestre getSemestreDeIngreso() {
        return semestreDeIngreso;
    }

    public void setSemestreDeIngreso(Semestre semestreDeIngreso) {
        this.semestreDeIngreso = semestreDeIngreso;
    }


    @Override
    public String toString() {
        return "Monitor{" + " telefonoMovil=" + telefonoMovil + ", programaAcademico=" + programaAcademico + ", semestreDeIngreso=" + semestreDeIngreso + '}';
    }

    

    
      
}
