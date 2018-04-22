/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author martincantorurrego
 */
public class FranjaDisponibilidad {
    private String Dia;
    private String HoraInicio;
    private String HoraFinal;
    
    public FranjaDisponibilidad(String dia, String horaInicio, String horaFinal){
        Dia = dia;
        HoraInicio = horaInicio;
        HoraFinal = horaFinal;
    }
    
    public void setDia(String dia){
        Dia = dia;
    }
    public String getDia(){
        return Dia;
    }
    
    public void setHoraInicio(String horainicial){
        HoraInicio = horainicial;
    }
    public String getHoraInicio(){
        return HoraInicio;
    }
    
    public void setHoraFinal(String horaFinal){
        HoraFinal = horaFinal;
    }
    public String getHoraFinal(){
        return HoraFinal;
    }
    
    public String toString(){
        return "Franja Horaria{" + "Dia :" + Dia + ", De :" + HoraInicio + "-"+ HoraFinal +"}";
    }
    
}
