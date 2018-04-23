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
public class Curso {
    private String id;
    private String nombre;
    private int creditosAcademicos;
    private int horasAprovadasMonitoria;
    private List<Grupo> grupos;
    private List<TemaCurso> temas;

    public Curso(String id, String nombre, int CreditosAcademicos, int HorasAprovadasMonitoria, List<Grupo> grupos, List<TemaCurso> temas) {
        this.id = id;
        this.nombre = nombre;
        this.creditosAcademicos = CreditosAcademicos;
        this.horasAprovadasMonitoria = HorasAprovadasMonitoria;
        this.grupos = grupos;
        this.temas = temas;
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

    public void setCreditosAcademicos(int CreditosAcademicos) {
        this.creditosAcademicos = CreditosAcademicos;
    }

    public int getHorasAprovadasMonitoria() {
        return horasAprovadasMonitoria;
    }

    public void setHorasAprovadasMonitoria(int HorasAprovadasMonitoria) {
        this.horasAprovadasMonitoria = HorasAprovadasMonitoria;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<TemaCurso> getTemas() {
        return temas;
    }

    public void setTemas(List<TemaCurso> temas) {
        this.temas = temas;
    }
    
    
    
    
    public String toString(){
        return "Curso { Nemonomico "+ id + ", Nombre :" + nombre + ", Creditos Academicos :"+ creditosAcademicos +", Horas Aprobadas de monitoria"+ horasAprovadasMonitoria +", Temas"+ temas +", Grupos"+ grupos +"}";
    }
    
    
    
}
