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
    private TemaCurso temaCurso;
    private Asesoria asesoria;

    public TemaAsesoria() {
    }
    
    
    public TemaAsesoria(Asesoria asesoria, TemaCurso temaCurso) {
        this.asesoria = asesoria;
        this.temaCurso = temaCurso;
    }

    public Asesoria getAsesoria() {
        return asesoria;
    }

    public void setAsesoria(Asesoria asesoria) {
        this.asesoria = asesoria;
    }

    public TemaCurso getTemaCurso() {
        return temaCurso;
    }

    public void setTemaCurso(TemaCurso temaCurso) {
        this.temaCurso = temaCurso;
    }

    @Override
    public String toString() {
        return "TemaAsesoria{" + "asesoria=" + asesoria + ", temaCurso=" + temaCurso + '}';
    }
    
   
}
