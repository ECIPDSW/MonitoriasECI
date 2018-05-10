/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.Date;



/**
 *
 * @author martincantorurrego
 */
public class Semestre implements Serializable {
    private int numero;
    private int ano;
    private char periodoAcademico;
    private Date fechaInicio;
    private Date fechaFin;

    public Semestre(int numero, int ano, char periodoAcademico, Date fechaInicio, Date fechaFin) {
        this.numero = numero;
        this.ano = ano;
        this.periodoAcademico = periodoAcademico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Semestre() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public char getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(char periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Semestre{" + "numero=" + numero + ", ano=" + ano + ", periodoAcademico=" + periodoAcademico + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

    

}
