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
     private String NombreDelTema;
     private String Descripcion;
     private Curso curso;
     private List<Asesoria> asesorias;
     
     public TemaCurso(){}

    public TemaCurso(String NombreDelTema, String Descripcion, Curso curso, List<Asesoria> asesorias) {
        this.NombreDelTema = NombreDelTema;
        this.Descripcion = Descripcion;
        this.curso = curso;
        this.asesorias = asesorias;
    }
     
     public void setNombreTema(String nombre){
         NombreDelTema = nombre;
     }
     public String getNombreTema(){
         return NombreDelTema;
     }
     
     public void setDescripcion(String descripcion){
         Descripcion = descripcion;
     }
     public String getDescripcion(){
         return Descripcion;
     }
     
     public void setCurso(Curso cursot){
         curso = cursot;
     }
     public Curso getCurso(){
         return curso;
     }
     
     public String toString(){
        return "Tema {" + NombreDelTema+ ", Descripcion :" + Descripcion + ", Del Curso "+ curso +"}";
    }
    
}
