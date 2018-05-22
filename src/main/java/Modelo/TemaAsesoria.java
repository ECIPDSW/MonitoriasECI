package Modelo;

import java.io.Serializable;

/**
 *Objeto del tema de asesoria
 * @author 666 Industries
 */
public class TemaAsesoria implements Serializable {
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
