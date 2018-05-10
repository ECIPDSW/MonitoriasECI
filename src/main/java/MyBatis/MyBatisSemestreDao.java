/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.SemestreDAO;
import Mappers.SemestreMapper;
import Modelo.Semestre;
import com.google.inject.Inject;
import java.util.List;


/**
 *
 * @author David Rodriguez
 */

public class MyBatisSemestreDao implements SemestreDAO{
   @Inject
   private SemestreMapper semestreMapper;

    @Override
    public Semestre loadSemestre(int id) {
        return semestreMapper.loadSemestre(id);
    }

    @Override
    public Semestre loadSemestreActual() {
        return semestreMapper.loadSemestreActual();
    }

    @Override
    public List<Semestre> loadSemestres() {
        return semestreMapper.loadSemestres();
    }

    @Override
    public Semestre loadSemestreAnterior() {
        return semestreMapper.loadSemestreAnterior();
    }
   
   
}
