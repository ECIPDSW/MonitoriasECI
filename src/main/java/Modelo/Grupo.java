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
public class Grupo {
    private int NumeroGrupo;
    private Curso curso;
    private Profesor profesorTitular;
    private Monitor monitor;
    private Semestre semestre;
    
    public Grupo(int numeroGrupo,Curso cursog,Profesor profesor,Monitor monitorg,Semestre semestreg){
        NumeroGrupo = numeroGrupo;
        curso = cursog;
        profesorTitular = profesor;
        monitor = monitorg;
        semestre = semestreg;
    }
    
    public void setNumeroGrupo(int numeroGrupo){
        NumeroGrupo = numeroGrupo;
    }
    public int getNumeroGrupo(){
        return NumeroGrupo;
    }
    
    public void setCurso(Curso cursog){
        curso = cursog;
    }
    public Curso getCurso(){
        return curso;
    }
    
    public void setProfesor(Profesor profesorg){
        profesorTitular = profesorg;
    }
    public Profesor getProfesor(){
        return profesorTitular;
    }
    
    public void setMonitor(Monitor monitog){
        monitor = monitog;
    }
    public Monitor getMonitor(){
        return monitor;
    }
    
    public void setSemestre(Semestre semestreg){
        semestre = semestreg;
    }
    public Semestre getSemestre(){
        return semestre;
    }
    
    public String toString(){
        return "Grupo { Numero "+ NumeroGrupo + ", Curso :" + curso + ", Profesor :"+ profesorTitular +", Monitor"+ monitor +", Semestre"+ semestre +"}";
    }
}
