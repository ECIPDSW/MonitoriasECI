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
public class TemaCurso {
     private String tema;
     private String descripcion;
     private Curso curso;

    public TemaCurso() {
    }

    public TemaCurso(String tema, String descripcion, Curso curso) {
        this.tema = tema;
        this.descripcion = descripcion;
        this.curso = curso;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "TemaCurso{" + "tema=" + tema + ", descripcion=" + descripcion + ", curso=" + curso + '}';
    }
     
     
}
