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
public class TemaCurso {
     private String nombreDelTema;
     private String descripcion;
     private Curso curso;
     
     public TemaCurso(){}

    public TemaCurso(String nombreDelTema, String descripcion, Curso curso) {
        this.nombreDelTema = nombreDelTema;
        this.descripcion = descripcion;
        this.curso = curso;
    }
     
     public void setNombreTema(String nombre){
         nombreDelTema = nombre;
     }
     public String getNombreTema(){
         return nombreDelTema;
     }
     
     public void setDescripcion(String descripcion){
         this.descripcion = descripcion;
     }
     public String getDescripcion(){
         return descripcion;
     }
     
     public void setCurso(Curso cursot){
         curso = cursot;
     }
     public Curso getCurso(){
         return curso;
     }
     
     public String toString(){
        return "Tema {" + nombreDelTema+ ", Descripcion :" + descripcion + ", Del Curso "+ curso +"}";
    }
    
}
