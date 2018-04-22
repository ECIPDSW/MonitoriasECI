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
    private Date fecha;
    private FranjaDisponibilidad franja;
    private Monitor Monitor;
    private int CodigoDelEstudiante;
    private String NombreDelEstudiante;
    private Profesor profesorTitular;
    private String Observaciones;
    private String IpDelNavegador;
    
    
    public Asesoria(Date fechaAsesoria, FranjaDisponibilidad franjaMonitoria, Monitor monitor){
        fecha = fechaAsesoria;
        franja = franjaMonitoria;
        Monitor = monitor;
    }
    
    public Asesoria(int codigoEstudiante,String nombre,Profesor profesorDelEstudiante, String observaciones){
        CodigoDelEstudiante = codigoEstudiante;
        NombreDelEstudiante = nombre;
        profesorTitular = profesorDelEstudiante;
        Observaciones=observaciones;        
    }
    
    public void setIpDelNavegador(String IP){
        IpDelNavegador = IP;
    }
    public String getIpDelNavegador(){
        return IpDelNavegador;
    }
    
    public void setFecha(Date fechaMonitoria){
        fecha = fechaMonitoria;
    }
    public Date getFecha(){
        return fecha;
    }
    
    public void setFranjaMonitoria(FranjaDisponibilidad franjaMonitoria){
        franja = franjaMonitoria;
    }
    public FranjaDisponibilidad getFranjaMonitoria(){
        return franja;
    }
    
    public void setMonitor(Monitor monitor){
        Monitor = monitor;
    }
    public Monitor getMonitor(){
        return Monitor;
    }
    
    public void setCodigoDelEstudiante(int codigo){
        CodigoDelEstudiante = codigo;
    }
    public int getCodigoDelEstudiante(){
        return CodigoDelEstudiante;
    }
    
    public void setNombreEstudiante(String nombreE){
        NombreDelEstudiante = nombreE;
    }
    public String getNombreEstudiante(){
        return NombreDelEstudiante;
    }
    
    public void setProfesor(Profesor profesor){
        profesorTitular = profesor;
    }
    public Profesor getProfesor(){
        return profesorTitular;
    }
    
    public void setObservaciones(String observacionesM){
        Observaciones = observacionesM;
    }
    public String getObservaciones(){
        return Observaciones;
    }
    
    public String toString(){
        return "Asesoria:\n" + "fecha:\n" + fecha +"franja:\n" + franja + "Monitor\n"+ Monitor +"Codigo del estudiante\n"+ CodigoDelEstudiante +"Nombre\n"+ NombreDelEstudiante +"Profesor Titular\n"+ profesorTitular +"Observaciones\n"+ Observaciones +"IP del Navegador \n"+ IpDelNavegador ;
    }
    
}
