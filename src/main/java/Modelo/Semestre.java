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
    private int numero;
    private String periodoAcademico;
    private Date fechaInicio;
    private Date fechaFin;
    
    public Semestre(){
    }
    
    public Semestre(int numero, String pAcademico, Date fechaInicio, Date fechaFin){
        this.numero = numero;
        periodoAcademico = pAcademico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public void setNumero( int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    
    public void setPeriodoAcademico( String pAcademico){
        periodoAcademico = pAcademico;
    }
    public String getPeriodoAcademico(){
        return periodoAcademico;
    }
    
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaInicio(){
        return fechaInicio;
    }
    
    public void setFechaFin(Date fechaFin){
        this.fechaFin = fechaFin;
    }
    public Date getFechaFin(){
        return fechaFin;
    }
    
    public String toString(){
        return "Semestre {"+ numero + "-" + periodoAcademico + "Fecha de Inicio:"+ fechaInicio +", Fecha de Finalizacion"+ fechaFin +"}";
    }
    
}
