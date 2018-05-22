package Modelo;

import java.io.Serializable;

/**
 *Objeto del tema del curso
 * @author 666 Industries
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
