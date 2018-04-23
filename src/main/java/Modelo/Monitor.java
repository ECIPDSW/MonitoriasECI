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
    
    private List<Grupo> grupos;
    private List<Asesoria> asesorias;
    private Semestre semestreingreso;
    private String programaAcademico;

    public Monitor() {}

    public Monitor(List<Grupo> grupos, List<Asesoria> asesorias, Semestre semestreingreso, String programaAcademico, int codigo, String nombre, String apellido, String correo, int telefonoMovil) {
        super(codigo, nombre, apellido, correo, telefonoMovil);
        this.grupos = grupos;
        this.asesorias = asesorias;
        this.semestreingreso = semestreingreso;
        this.programaAcademico = programaAcademico;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Asesoria> getAsesorias() {
        return asesorias;
    }

    public void setAsesorias(List<Asesoria> asesorias) {
        this.asesorias = asesorias;
    }

    public Semestre getSemestreingreso() {
        return semestreingreso;
    }

    public void setSemestreingreso(Semestre semestreingreso) {
        this.semestreingreso = semestreingreso;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
    
    
    
    @Override
    public String toString(){
        return super.toString()+ ", ProgramaAcademico: " + programaAcademico +", SemestreIngreso :" + semestreingreso+", Grupo de Monitoria :" + grupos +", franjas Monitoria :" + "}";
    }
    
}
