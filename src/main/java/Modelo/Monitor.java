/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author martincantorurrego
 */
public class Monitor extends Persona{
    private String ProgramaAcademico;
    private Semestre SemestreDeIngreso; 
    private Grupo Grupo;
    private ArrayList<FranjaDisponibilidad> franjasMonitoria;
    
    public Monitor(int codigo, String nombre,String apellido,String correo,int telefonoMovil,String programaAcademico,Semestre semestreingreso, Grupo grupom){
        super(codigo,nombre,apellido,correo,telefonoMovil);
        ProgramaAcademico = programaAcademico;
        SemestreDeIngreso = semestreingreso;
        Grupo = grupom;
    }
    
    public void setProgramaAcademico(String programaAcademico){
        ProgramaAcademico = programaAcademico;
    }
    
    public String getProgramaAcademico(){
        return ProgramaAcademico;
    }
    
    public void setSemestreIngreso(Semestre semestrem){
        SemestreDeIngreso = semestrem;
    }
    
    public Semestre getSemestreIngreso(){
        return SemestreDeIngreso;
    }
    
    public Grupo getGrupoMonitor(){
        return Grupo;
    }
    
    public void setGrupoMonitor(Grupo grupom){
        Grupo = grupom;
    }
    
    public ArrayList<FranjaDisponibilidad> getFranjasXMonitor(){
        return franjasMonitoria;
    }
    
    public void setFranjasXMonitor(ArrayList<FranjaDisponibilidad> franjasAsignadas){
        franjasMonitoria = franjasAsignadas;
    }
    
    @Override
    public String toString(){
        return super.toString()+ ", ProgramaAcademico: " + ProgramaAcademico +", SemestreIngreso :" + SemestreDeIngreso+", Grupo de Monitoria :" + Grupo +", franjas Monitoria :" + franjasMonitoria + "}";
    }
    
}
