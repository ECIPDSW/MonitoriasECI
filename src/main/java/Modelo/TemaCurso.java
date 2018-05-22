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
public class TemaCurso implements Serializable {
     private int idTemaCurso;
     private String tema;
     private String descripcion;
     

    public TemaCurso(int idTemaCurso, String tema, String descripcion) {
        this.idTemaCurso = idTemaCurso;
        this.tema = tema;
        this.descripcion = descripcion;
        
    }

    public TemaCurso() {
        
    }

    public int getIdTemaCurso() {
        return idTemaCurso;
    }

    public void setIdTemaCurso(int idTemaCurso) {
        this.idTemaCurso = idTemaCurso;
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

 
    @Override
    public String toString() {
        return tema;
    }

         
}
