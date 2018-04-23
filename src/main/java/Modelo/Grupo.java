/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author martincantorurrego
 */
public class Grupo {
    Semestre semestre;
    Curso curso;
    Profesor profesor;
    int numero;
    Monitor monitor;
    List<FranjaDisponibilidad> franjas;
    
    public Grupo(){}
    
    public Grupo(int numeroGrupo,Curso cursog,Profesor profesor,Monitor monitorg,Semestre semestreg, List<FranjaDisponibilidad> franjas){
        numero = numeroGrupo;
        curso = cursog;
        this.profesor = profesor;
        monitor = monitorg;
        semestre = semestreg;
        this.franjas = franjas;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public List<FranjaDisponibilidad> getFranjas() {
        return franjas;
    }

    public void setFranjas(List<FranjaDisponibilidad> franjas) {
        this.franjas = franjas;
    }
    
    
    
    public String toString(){
        return "Grupo { Numero "+ numero + ", Curso :" + curso + ", Profesor :"+ profesor +", Monitor"+ monitor +", Semestre"+ semestre +"}";
    }
}
