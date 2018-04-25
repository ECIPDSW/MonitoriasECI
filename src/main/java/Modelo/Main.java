/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Servicios.Fabrica;


/**
 *
 * @author martincantorurrego
 */
public class Main {
    public static Monitor monitor;
    public static Fabrica fabrica = new Fabrica();
    public static void main(String a[]){
        System.out.println("\nConsultar cliente\n");
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().getSemestre(2018));
    }
}
