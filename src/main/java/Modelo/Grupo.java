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
public class Grupo {
    private int idGrupo;
    private int numero;
    private Curso curso;
    private Semestre semestre;
    private Monitor monitor;
    private Profesor profesor;
    private ArrayList<Monitoria> monitorias;
    private ArrayList<Asesoria> asesoria;

    public Grupo(int idGrupo, int numero, Curso curso, Semestre semestre, Monitor monitor, Profesor profesor, ArrayList<Monitoria> monitorias, ArrayList<Asesoria> asesoria) {
        this.idGrupo = idGrupo;
        this.numero = numero;
        this.curso = curso;
        this.semestre = semestre;
        this.monitor = monitor;
        this.profesor = profesor;
        this.monitorias = monitorias;
        this.asesoria = asesoria;
    }

    public Grupo() {
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Monitoria> getMonitorias() {
        return monitorias;
    }

    public void setMonitorias(ArrayList<Monitoria> monitorias) {
        this.monitorias = monitorias;
    }

    public ArrayList<Asesoria> getAsesoria() {
        return asesoria;
    }

    public void setAsesoria(ArrayList<Asesoria> asesoria) {
        this.asesoria = asesoria;
    }

    @Override
    public String toString() {
        return "Grupo{" + "idGrupo=" + idGrupo + ", numero=" + numero + ", curso=" + curso + ", semestre=" + semestre + ", monitor=" + monitor + ", profesor=" + profesor + ", monitorias=" + monitorias + ", asesoria=" + asesoria + '}';
    }

   
    
    
}
