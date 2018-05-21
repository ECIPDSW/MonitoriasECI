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
public class Curso implements Serializable {
    private String id;
    private String nombre;
    private int creditosAcademicos;
    private int horasAprobadasMonitoria;
    private ArrayList<TemaCurso> temas;

    public Curso(String id, String nombre, int creditosAcademicos, int horasAprobadasMonitoria, ArrayList<TemaCurso> temas) {
        this.id = id;
        this.nombre = nombre;
        this.creditosAcademicos = creditosAcademicos;
        this.horasAprobadasMonitoria = horasAprobadasMonitoria;
        this.temas = temas;
    }

    public Curso() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditosAcademicos() {
        return creditosAcademicos;
    }

    public void setCreditosAcademicos(int creditosAcademicos) {
        this.creditosAcademicos = creditosAcademicos;
    }

    public int getHorasAprobadasMonitoria() {
        return horasAprobadasMonitoria;
    }

    public void setHorasAprobadasMonitoria(int horasAprobadasMonitoria) {
        this.horasAprobadasMonitoria = horasAprobadasMonitoria;
    }

    public ArrayList<TemaCurso> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<TemaCurso> temas) {
        this.temas = temas;
    }
    
    public String getNombreCompleto(){
        return id+" - "+nombre; 
    }
    
    
    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", creditosAcademicos=" + creditosAcademicos + ", horasAprobadasMonitoria=" + horasAprobadasMonitoria + ", temas=" + temas + '}';
    }

  
   
    
}
