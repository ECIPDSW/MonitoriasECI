/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author martincantorurrego
 */
public class Asesoria {
    private Date fecha;
    private int idEstudiante;
    private String nombreEstudiante;
    private String ip;
    private String observaciones;
    private Monitoria monitoria;
    private Grupo grupo;
    private ArrayList<TemaAsesoria> temas;

    public Asesoria(Date fecha, int idEstudiante, String nombreEstudiante, String ip, String observaciones, Monitoria monitoria, Grupo grupo, ArrayList<TemaAsesoria> temas) {
        this.fecha = fecha;
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.ip = ip;
        this.observaciones = observaciones;
        this.monitoria = monitoria;
        this.grupo = grupo;
        this.temas = temas;
    }

    public Asesoria() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Monitoria getMonitoria() {
        return monitoria;
    }

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<TemaAsesoria> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<TemaAsesoria> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Asesoria{" + "fecha=" + fecha + ", idEstudiante=" + idEstudiante + ", nombreEstudiante=" + nombreEstudiante + ", ip=" + ip + ", observaciones=" + observaciones + ", monitoria=" + monitoria + ", grupo=" + grupo + ", temas=" + temas + '}';
    }
    
    
}
