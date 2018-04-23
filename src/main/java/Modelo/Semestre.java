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
    private int ano;
    private char periodoAcademico; // es '1' o '2' o 'I'
    private Date fechaInicio;
    private Date fechaFin;
    
    public Semestre(){
    }
    
    public Semestre(int ano, char pAcademico, Date fechaInicio, Date fechaFin){
        this.ano = ano;
        periodoAcademico = pAcademico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getNumero(){
        return ano;
    }
    
    public void setPeriodoAcademico(char pAcademico){
        periodoAcademico = pAcademico;
    }
    public char getPeriodoAcademico(){
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
        return "Semestre {"+ ano + "-" + periodoAcademico + "Fecha de Inicio:"+ fechaInicio +", Fecha de Finalizacion"+ fechaFin +"}";
    }
    
}
