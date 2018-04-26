/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author martincantorurrego
 */
public class Monitoria implements Serializable {
    private int idMonitoria;
    private String dia;
    private Time horaInicio;
    private Time horaFin;
    private String lugar;
    
    private ArrayList<MonitoriaRegistrada> mregistrada;

    public Monitoria() {
    }

    public Monitoria(int idMonitoria, String dia, Time horaInicio, Time horaFin, String lugar, ArrayList<MonitoriaRegistrada> mregistrada) {
        this.idMonitoria = idMonitoria;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
        this.mregistrada = mregistrada;
    }

    public int getIdMonitoria() {
        return idMonitoria;
    }

    public void setIdMonitoria(int idMonitoria) {
        this.idMonitoria = idMonitoria;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<MonitoriaRegistrada> getMregistrada() {
        return mregistrada;
    }

    public void setMregistrada(ArrayList<MonitoriaRegistrada> mregistrada) {
        this.mregistrada = mregistrada;
    }

    @Override
    public String toString() {
        return "Monitoria{" + "idMonitoria=" + idMonitoria + ", dia=" + dia + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", lugar=" + lugar +  '}';
    }

    
}
