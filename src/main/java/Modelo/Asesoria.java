/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Servicios.Fabrica;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author martincantorurrego
 */
public class Asesoria implements Serializable {
    private int idAsesoria;
    private int idEstudiante;
    private String observaciones;
    private MonitoriaRegistrada monitoria;
    private List<TemaCurso> temas;

    public Asesoria(int idAsesoria, Date fecha, int idEstudiante, String nombreEstudiante, String observaciones, MonitoriaRegistrada monitoria, ArrayList<TemaCurso> temas) {
        this.idAsesoria = idAsesoria;
        this.idEstudiante = idEstudiante;
        this.observaciones = observaciones;
        this.monitoria = monitoria;
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
    
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<TemaCurso> getTemas() {
        return Fabrica.getInstance().getServiciosAsesoria().loadTemasAsesoria(idAsesoria);
    }

    public void setTemas(ArrayList<TemaCurso> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Asesoria{" + "idAsesoria=" + idAsesoria +  ", idEstudiante=" + idEstudiante +   ", observaciones=" + observaciones +"monitoriaregistrada="+monitoria +", temas=" + temas + '}';
    }
    public String getTemass(){
        String t="";
        temas= Fabrica.getInstance().getServiciosAsesoria().loadTemasAsesoria(idAsesoria);
        for(int i =0;i<temas.size();i++){
            t+=" "+temas.get(i).getTema()+"\n";
        }
        return t;
    }

    public MonitoriaRegistrada getMonitoriaR() {
        return monitoria;
    }

    public void setMonitoriaR(MonitoriaRegistrada monitoriaR) {
        this.monitoria = monitoriaR;
    }
    
    public String getNombreEstudiante(){
        return Fabrica.getInstance().getServiciosAsesoria().loadEstudiantePorAsesoria(idAsesoria).getNombre();
    }
}
