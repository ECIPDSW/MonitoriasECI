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
    
    public static void main(String args[]){
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadGrupos("PIMB", 1));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadAdminLogin(5, "admin"));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().getProfesor(3));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitor(1));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitorLogin(2, "admin"));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadProfesorLogin(4, "admin"));
        //Donde ponen la constrasena mala
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadProfesorLogin(4, "mala"));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadCursos());
        /*System.out.println("PROFE");
        Profesor p = fabrica.getServiciosAsesoria().getProfesor(4);
        System.out.println(p);
        System.out.println("\nConsultar Monitor\n");
        System.out.println(fabrica.getServiciosAsesoria().loadMonitor(1));*/
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
                mo.add(new Monitoria(i,"Dia"+i,ti,ti,"lugar"+i,grupos.get(i)));
                af.add(new Asesoria(i,d,666,"Estudiante"+i,"Observacion"+i,as.get(i),t));
                as.add(new MonitoriaRegistrada(i*3,""+i*124,ti,ti,d,mo.get(i)));
                
            }
            Curso c= new Curso(""+x,"Curso"+x,x*2,x,t);
            Grupo g = new Grupo(x,x*10,c,sem,profesor);
            
            
            grupos.add(g);
            
            
        }
        monitor= new Monitor(2129175,666,"Ing Sistemas",sem,"Nicolás","García","nicoga97@hotmail.com","12345");
        for(int i=0;i<grupos.size();i++){
            grupos.get(i).setMonitor(monitor);
            
        }
    }
}
