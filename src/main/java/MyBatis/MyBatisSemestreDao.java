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

/**
 *
 * @author David Rodriguez
 */
public class MyBatisSemestreDao implements SemestreDAO{
   @Inject
   private SemestreMapper semestreMapper;

    @Override
    public Semestre loadSemestre(int año) {
        return semestreMapper.loadSemestre(año);
    }
   
   
}
