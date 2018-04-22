/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author martincantorurrego
 */
public class Semestre {
    private int Año;
    private String PeriodoAcademico;
    private Date FechaInicio;
    private Date FechaFin;
    
    public Semestre(int año, String pAcademico, Date fechaInicio, Date fechaFin){
        Año = año;
        PeriodoAcademico = pAcademico;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
    }
    
    public void setAño( int año){
        Año = año;
    }
    public int getAño(){
        return Año;
    }
    
    public void setPeriodoAcademico( String pAcademico){
        PeriodoAcademico = pAcademico;
    }
    public String getPeriodoAcademico(){
        return PeriodoAcademico;
    }
    
    public void setFechaInicio(Date fechaInicio){
        FechaInicio = fechaInicio;
    }
    public Date getFechaInicio(){
        return FechaInicio;
    }
    
    public void setFechaFin(Date fechaFin){
        FechaFin = fechaFin;
    }
    public Date getFechaFin(){
        return FechaFin;
    }
    
    public String toString(){
        return "Semestre {"+ Año + "-" + PeriodoAcademico + "Fecha de Inicio:"+ FechaInicio +", Fecha de Finalizacion"+ FechaFin +"}";
    }
    
}
