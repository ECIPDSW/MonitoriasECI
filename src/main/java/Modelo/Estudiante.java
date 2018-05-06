/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author David Rodriguez
 */
public class Estudiante {
    private int carnet;
    private String nombre;

    public Estudiante(int carnet, String nombre) {
        this.carnet = carnet;
        this.nombre = nombre;
    }
    
    public Estudiante(){}

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carnet=" + carnet + ", nombre=" + nombre + '}';
    }
    
    
}
