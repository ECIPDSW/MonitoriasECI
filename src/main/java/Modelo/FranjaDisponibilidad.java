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
    private String dia;
    private String franja;
    private String lugar;  
    private Grupo grupo;

    public FranjaDisponibilidad(){}
    
    public FranjaDisponibilidad(String dia, String franja, String lugar, Grupo grupo) {
        this.dia = dia;
        this.franja = franja;
        this.lugar = lugar;
        this.grupo = grupo;
    }

    
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getFranja() {
        return franja;
    }

    public void setFranja(String franja) {
        this.franja = franja;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    
    
    public String toString(){
        return "Franja Horaria{" + "Dia :" + dia + ", De :" + franja+"}";
    }
    
}
