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
public class TemaCurso {
     private String NombreDelTema;
     private String Descripcion;
     private Curso curso;
     
     public TemaCurso(String nombre,String descripcion,Curso cursot){
        NombreDelTema = nombre;
        Descripcion = descripcion;
        curso = cursot;  
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
