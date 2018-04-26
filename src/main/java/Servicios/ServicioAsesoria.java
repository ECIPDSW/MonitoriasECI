/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Modelo.*;
/**
 *
 * @author David Rodriguez
 */
public interface ServicioAsesoria {
    Semestre getSemestre(int id);
    Profesor getProfesor(int id);
    Monitor loadMonitor(int id);
    void registrarAsesoria(int grupo, int monitor, int idEstudiante,String nombreEstudiante, String observaciones);
}
