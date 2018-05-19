/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import Modelo.Estudiante;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author David Rodriguez
 */
public interface EstudianteMapper {
    Estudiante loadEstudiantePorAsesoria(@Param("idasesoria")int idasesoria);
    void crearEstudiante(@Param("id")int carnet, @Param("nombre")String nombre);
}
