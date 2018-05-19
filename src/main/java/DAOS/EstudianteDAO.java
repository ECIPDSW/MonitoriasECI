/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Estudiante;

/**
 *
 * @author David Rodriguez
 */
public interface EstudianteDAO {
    Estudiante loadEstudiantePorAsesoria(int idasesoria);
    void crearEstudiante(int carnet, String nombre);
}
