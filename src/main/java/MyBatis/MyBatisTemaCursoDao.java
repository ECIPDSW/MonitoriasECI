/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.TemaCursoDAO;
import Mappers.TemaCursoMapper;
import Modelo.TemaCurso;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author David Rodriguez
 */
public class MyBatisTemaCursoDao implements TemaCursoDAO{

    @Inject
    TemaCursoMapper temaCurso;
    
    @Override
    public List<TemaCurso> loadTemasCurso(String idCurso) {
        return temaCurso.loadTemasCurso(idCurso);
    }

    @Override
    public List<TemaCurso> loadTemasAsesoria(int idAsesoria) {
        return temaCurso.loadTemasAsesoria(idAsesoria);
    }

    @Override
    public int numeroDeAsistenciasSegunTema(int tema, int semestre) {
        return temaCurso.numeroDeAsistenciasSegunTema(tema, semestre);
    }

    @Override
    public void crearTema(String idCurso, String tema, String descripcion) {
        temaCurso.crearTema(idCurso, tema, descripcion);;
    }
    
}
