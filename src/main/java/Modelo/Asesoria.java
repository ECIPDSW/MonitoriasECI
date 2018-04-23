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
public class Asesoria {
    private int id;
    private Date fecha;
    private int idEstudiante;
    private String nombreEstudiante;
    private String ip;
    private String observaciones;
    private Grupo grupo;
    private TemaCurso tema;
    private Monitor monitor;

    public Asesoria(){}
    
    public Asesoria(int id, Date fecha, int idEstudiante, String nombreEstudiante, String ip, String observaciones, Grupo grupo, TemaCurso tema, Monitor monitor) {
        this.id = id;
        this.fecha = fecha;
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.ip = ip;
        this.observaciones = observaciones;
        this.grupo = grupo;
        this.tema = tema;
        this.monitor = monitor;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public TemaCurso getTema() {
        return tema;
    }

    public void setTema(TemaCurso tema) {
        this.tema = tema;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    
    
    
    public String toString(){
        return "Asesoria:\n" + "fecha:\n" + fecha  + "Monitor\n"+ monitor +"Codigo del estudiante\n"+ idEstudiante +"Nombre\n"+ nombreEstudiante  +"Observaciones\n"+ observaciones +"IP del Navegador \n"+ ip ;
    }
    
}
