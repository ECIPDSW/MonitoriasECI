/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatisDao;

import Mappers.SemestreMapper;
import Modelo.Semestre;
import com.google.inject.Inject;

/**
 *
 * @author David Rodriguez
 */
public class MyBatisSemestreDao {
   @Inject
   private SemestreMapper semestreMapper;
   public Semestre consultarSemestre(int num){
       return semestreMapper.consultarSemestre(num);
   }
}
