/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosImpl;

import Modelo.Semestre;
import MyBatis.MyBatisSemestreDao;
import Servicios.ServicioSemestre;
import com.google.inject.Inject;

/**
 *
 * @author martincantorurrego
 */
public class ServicioSemestreImpl implements ServicioSemestre {
    @Inject
    private MyBatisSemestreDao semestreDao = new MyBatisSemestreDao();
    
    @Override
    public Semestre loadSemestre(int id){
        return semestreDao.loadSemestre(id);
    }
}
