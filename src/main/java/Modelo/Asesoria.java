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
    
    private Grupo grupo;
    private ArrayList<TemaCurso> temas;

    public Asesoria(int idAsesoria,Date fecha, int idEstudiante, String nombreEstudiante, String observaciones,  Grupo grupo, ArrayList<TemaCurso> temas) {
        this.idAsesoria=idAsesoria;
        this.fecha = fecha;
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.observaciones = observaciones;
        
        this.grupo = grupo;
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


    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<TemaCurso> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<TemaCurso> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Asesoria{" + "idAsesoria=" + idAsesoria + ", fecha=" + fecha + ", idEstudiante=" + idEstudiante + ", nombreEstudiante=" + nombreEstudiante +  ", observaciones=" + observaciones + ", grupo=" + grupo + ", temas=" + temas + '}';
    }
    public String getTemass(){
        String t="";
        for(int i =0;i<temas.size();i++){
            t+=" "+temas.get(i).getTema()+"\n";
        }
        return t;
    }
    
    
}
