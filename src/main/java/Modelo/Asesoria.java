/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author martincantorurrego
 */
public class Asesoria implements Serializable {
    private int idAsesoria;
    private Date fecha;
    private int idEstudiante;
    private String nombreEstudiante;
    private String observaciones;
    private MonitoriaRegistrada monitoriaR;
    private ArrayList<TemaCurso> temas;

    public Asesoria(int idAsesoria, Date fecha, int idEstudiante, String nombreEstudiante, String observaciones, MonitoriaRegistrada monitoriaR, ArrayList<TemaCurso> temas) {
        this.idAsesoria = idAsesoria;
        this.fecha = fecha;
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.observaciones = observaciones;
        this.monitoriaR = monitoriaR;
        this.temas = temas;
    }

    

    public Asesoria() {
    }

    public int getIdAsesoria() {
        return idAsesoria;
    }

    public void setIdAsesoria(int idAsesoria) {
        this.idAsesoria = idAsesoria;
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



    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public ArrayList<TemaCurso> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<TemaCurso> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Asesoria{" + "idAsesoria=" + idAsesoria + ", fecha=" + fecha + ", idEstudiante=" + idEstudiante + ", nombreEstudiante=" + nombreEstudiante +  ", observaciones=" + observaciones + ", temas=" + temas + '}';
    }
    public String getTemass(){
        String t="";
        for(int i =0;i<temas.size();i++){
            t+=" "+temas.get(i).getTema()+"\n";
        }
        return t;
    }

    public MonitoriaRegistrada getMonitoriaR() {
        return monitoriaR;
    }

    public void setMonitoriaR(MonitoriaRegistrada monitoriaR) {
        this.monitoriaR = monitoriaR;
    }
    
    
}
