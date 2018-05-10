/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author martincantorurrego
 */
public class Grupo implements Serializable {
    private int idGrupo;
    private int numero;
    private Curso curso;
    private Semestre semestre;
    private Monitor monitor;
    private Profesor profesor;
    

    public Grupo(int idGrupo, int numero, Curso curso, Semestre semestre, Profesor profesor) {
        this.idGrupo = idGrupo;
        this.numero = numero;
        this.curso = curso;
        this.semestre = semestre;
        this.monitor = null;
        this.profesor = profesor;
        
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

/*
    @Override
    public String toString() {
        return curso.getNombre()+""+numero;
    }
*/

    @Override
    public String toString() {
        return "Grupo{" + "idGrupo=" + idGrupo + ", numero=" + numero + ", curso=" + curso + ", semestre=" + semestre + ", monitor=" + monitor + ", profesor=" + profesor + '}';
    }
    



   
    
    
}
