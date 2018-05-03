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
    
}
