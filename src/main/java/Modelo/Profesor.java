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
public class Profesor extends Persona{
    private String Decanatura;
    private Grupo grupo;
    public Profesor(int codigo, String nombre,String apellido,String correo,int telefonoMovil,Grupo grupop ,String decanatura){
         super(codigo,nombre,apellido,correo,telefonoMovil);
         grupo = grupop;
         Decanatura = decanatura;
    }
    
    public void setGrupoProfesor(Grupo grupop){
        grupo = grupop;
    }
    
    public Grupo getGrupoProfesor(){
        return grupo;
    }
    
    
    public void setDecanatura(String decanatura){
        Decanatura = decanatura;
    }
    
    public String getProgramaAcademico(){
        return Decanatura;
    }
    
    @Override
    public String toString(){
        return super.toString()+ ", Decanatura " + Decanatura +", Grupo :" + grupo+ "}";
    }
    
}
