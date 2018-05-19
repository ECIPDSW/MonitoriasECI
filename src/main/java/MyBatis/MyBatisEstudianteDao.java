/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.EstudianteDAO;import Mappers.EstudianteMapper;
import Modelo.Estudiante;
import com.google.inject.Inject;

/**
 *
 * @author David Rodriguez
 */
public class MyBatisEstudianteDao implements EstudianteDAO{
    @Inject
    private EstudianteMapper estudiante;

    @Override
    public Estudiante loadEstudiantePorAsesoria(int idasesoria) {
        return estudiante.loadEstudiantePorAsesoria(idasesoria);
    }

    @Override
    public void crearEstudiante(int carnet, String nombre) {
        estudiante.crearEstudiante(carnet, nombre);
    }

 
}
