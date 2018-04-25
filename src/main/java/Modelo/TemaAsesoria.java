/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author martincantorurrego
 */
public class TemaAsesoria {
    private int idTemaAsesoria;
    private TemaCurso temaCurso;
    private Asesoria asesoria;

    public TemaAsesoria() {
    }

    public TemaAsesoria(int idTemaAsesoria, TemaCurso temaCurso, Asesoria asesoria) {
        this.idTemaAsesoria = idTemaAsesoria;
        this.temaCurso = temaCurso;
        this.asesoria = asesoria;
    }

    public int getIdTemaAsesoria() {
        return idTemaAsesoria;
    }

    public void setIdTemaAsesoria(int idTemaAsesoria) {
        this.idTemaAsesoria = idTemaAsesoria;
    }

    public TemaCurso getTemaCurso() {
        return temaCurso;
    }

    public void setTemaCurso(TemaCurso temaCurso) {
        this.temaCurso = temaCurso;
    }

    public Asesoria getAsesoria() {
        return asesoria;
    }

    public void setAsesoria(Asesoria asesoria) {
        this.asesoria = asesoria;
    }

    @Override
    public String toString() {
        return "TemaAsesoria{" + "idTemaAsesoria=" + idTemaAsesoria + ", temaCurso=" + temaCurso + ", asesoria=" + asesoria + '}';
    }

}
