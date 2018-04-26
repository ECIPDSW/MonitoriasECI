/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


/**
 *
 * @author martincantorurrego
 */
public class MonitoriaRegistrada implements Serializable {
    private int idMonitoria;
    private String IP;
    private Time horaInicio;
    private Time horaFin;
    private Date fecha;
    
    private ArrayList<Asesoria> asesorias;

    public MonitoriaRegistrada() {
    }

    public MonitoriaRegistrada(int idMonitoria,String IP, Time horaInicio, Time horaFin,Date fecha, ArrayList<Asesoria> asesorias) {
        this.idMonitoria = idMonitoria;
        this.IP = IP;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.asesorias = asesorias;
        this.fecha=fecha;
    }

    public int getIdMonitoria() {
        return idMonitoria;
    }

    public void setIdMonitoria(int idMonitoria) {
        this.idMonitoria = idMonitoria;
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

    public String getIp() {
        return IP;
    }

    public void setIp(String ip) {
        this.IP = ip;
    }
      public Date getFecha() {
        return fecha;
    }
          
    public String getFechas() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaComoCadena = sdf.format(fecha);
        return fechaComoCadena;
    }
      

    public void setFecha(Date Fecha) {
        this.fecha = Fecha;
    }
    

    public ArrayList<Asesoria> getAsesorias() {
        return asesorias;
    }

    public void setAsesorias(ArrayList<Asesoria> asesorias) {
        this.asesorias = asesorias;
    }

    @Override
    public String toString() {
        return "Monitoria{" + "idMonitoria=" + idMonitoria +  ", horaInicio=" + horaInicio + ", horaFin=" + horaFin +   ", asesorias=" + asesorias + '}';
    }

    
}
