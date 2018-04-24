/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosImpl;


import Modelo.Semestre;
import MyBatis.MyBatisSemestreDao;
import Servicios.ServicioAsesoria;
import com.google.inject.Inject;

/**
 *
 * @author David Rodriguez
 */
public class ServicioAsesoriaImpl implements ServicioAsesoria{

    @Inject
    private MyBatisSemestreDao semestreDao = new MyBatisSemestreDao();
   
    
}
