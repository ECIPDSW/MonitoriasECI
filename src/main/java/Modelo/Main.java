/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Servicios.Fabrica;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author martincantorurrego
 */
public class Main {
    public static Monitor monitor;
    public static Profesor profesor;
    public static Fabrica fabrica = Fabrica.getInstance();
    
    public static void main(String a[]){
        System.out.println("PROFE");
        Profesor p = fabrica.getServiciosAsesoria().getProfesor(3);
        System.out.println(p);
        System.out.println("\nConsultar cliente\n");
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().getSemestre(1).getAno());
    }
    public static void poblar(){
        System.out.println("POBLAR");
        Date d = new Date(2018,04,17);
        Time ti = new Time(12,7,1);
        Semestre sem = new Semestre(1,2018,'a',d,d);
        ArrayList<Grupo> grupos = new ArrayList<Grupo>();

        profesor = new Profesor(2125275,"Sistemas","Nelson","Mandela","Nelson@gmail.com","12345");
        for (int x=0;x<10;x++){
            ArrayList<TemaCurso> t =new ArrayList<TemaCurso>();
            ArrayList<Monitoria> mo =new ArrayList<Monitoria>();
            ArrayList<Asesoria> af = new ArrayList<Asesoria>();
            ArrayList<MonitoriaRegistrada> as = new ArrayList<MonitoriaRegistrada>();
            for(int j=0;j<10;j++){
                int i =j*x;
                t.add(new TemaCurso(i+4,"Tema"+i,"Descripcion"+i));
                mo.add(new Monitoria(i,"Dia"+i,ti,ti,"lugar"+i,as));
                af.add(new Asesoria(i,d,666,"Estudiante"+i,"Observacion"+i,new Grupo(),t));
                as.add(new MonitoriaRegistrada(i*3,""+i*124,ti,ti,d,af));
                
            }
            Curso c= new Curso(""+x,"Curso"+x,x*2,x,t);
            Grupo g = new Grupo(x,x*10,c,sem,profesor,mo);
            
            
            grupos.add(g);
            profesor.setGrupos(grupos);
            
            
        }
        monitor= new Monitor(2129175,666,"Ing Sistemas",sem,grupos,"Nicolás","García","nicoga97@hotmail.com","12345");
        for(int i=0;i<grupos.size();i++){
            grupos.get(i).setMonitor(monitor);
            
        }
    }
}
