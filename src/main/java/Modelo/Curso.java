/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author martincantorurrego
 */
public class Curso {
    private String Nemonomico;
    private String Nombre;
    private int CreditosAcademicos;
    private int HorasAprobadasDeMonitoria;
    private ArrayList<TemaCurso> temas;
    private ArrayList<Grupo> grupos;
    
    public Curso(String nemonomico , String nombre, int creditosAcademicos, int horasAprobadas, ArrayList<TemaCurso> temascurso, ArrayList<Grupo> gruposC){
        Nemonomico = nemonomico;
        Nombre = nombre;
        CreditosAcademicos = creditosAcademicos;
        HorasAprobadasDeMonitoria = horasAprobadas;
        temas = temascurso;
        grupos = gruposC;
    }
    
    public void setNemonomico(String nemonomico){
        Nemonomico = nemonomico;
    }
    public String getNemonomico(){
        return Nemonomico;
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    
    public void setCreditosAcademicos(int creditos){
        CreditosAcademicos = creditos;
    }
    public int getCreditosAcademicos(){
        return CreditosAcademicos;
    }
    
    public void setHorasAprobadasDeMonitoria(int horas){
        HorasAprobadasDeMonitoria = horas;
    }
    public int getHorasAprobadasDeMonitoria(){
        return HorasAprobadasDeMonitoria;
    }
    
    public void setTemasCurso(ArrayList<TemaCurso> temasc){
        temas=temasc;
    }
    public ArrayList<TemaCurso> getTemasCurso(){
        return temas;
    }
    
    public void setGruposCurso(ArrayList<Grupo> gruposC){
        grupos =  gruposC;
    }
    public ArrayList<Grupo> getGruposCurso(){
        return grupos;
    }
    
    public String toString(){
        return "Curso { Nemonomico "+ Nemonomico + ", Nombre :" + Nombre + ", Creditos Academicos :"+ CreditosAcademicos +", Horas Aprobadas de monitoria"+ HorasAprobadasDeMonitoria +", Temas"+ temas +", Grupos"+ grupos +"}";
    }
    
    
    
}
