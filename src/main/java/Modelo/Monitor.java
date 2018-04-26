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
    private int idMonitor;
    private int telefonoMovil;
    private String programaAcademico;
    private Semestre semestreDeIngreso;
    private ArrayList<Grupo> grupos;

    public Monitor() {
    }

    public Monitor(int idMonitor, int telefonoMovil, String programaAcademico, Semestre semestreDeIngreso, ArrayList<Grupo> grupos, String nombre, String apellido, String correo, String contraseña) {
        super(idMonitor, nombre, apellido, correo, contraseña);
        this.idMonitor = idMonitor;
        this.telefonoMovil = telefonoMovil;
        this.programaAcademico = programaAcademico;
        this.semestreDeIngreso = semestreDeIngreso;
        this.grupos = grupos;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
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

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", telefonoMovil=" + telefonoMovil + ", programaAcademico=" + programaAcademico + ", semestreDeIngreso=" + semestreDeIngreso + ", grupos=" + grupos + '}';
    }

    

    
      
}
