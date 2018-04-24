/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author martincantorurrego
 */
public class Profesor extends Persona{
    private String decanatura;
    private List<Grupo> grupos;
    
    public Profesor(){}
    
    public Profesor(int codigo, String nombre,String apellido,String correo,int telefonoMovil,List<Grupo> grupos,String decanatura){
         super(codigo,nombre,apellido,correo,telefonoMovil);
         this.grupos = grupos;
         this.decanatura = decanatura;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
    
  
    
    public void setDecanatura(String decanatura){
        this.decanatura = decanatura;
    }
    
    public String getProgramaAcademico(){
        return decanatura;
    }
    
    @Override
    public String toString(){
        return super.toString()+ ", Decanatura " + decanatura +", Grupo :" + grupos+ "}";
    }
    
}
