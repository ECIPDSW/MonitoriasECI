/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.TemaCurso;
import java.util.List;

/**
 *
 * @author David Rodriguez
 */
public interface TemaCursoDAO {
    List<TemaCurso> loadTemasCurso(String idCurso);
    List<TemaCurso> loadTemasAsesoria(int idAsesoria);
}
