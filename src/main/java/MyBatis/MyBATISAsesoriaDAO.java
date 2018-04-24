/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.AsesoriaDAO;
import Mappers.AsesoriaMapper;
import com.google.inject.Inject;

/**
 *
 * @author martincantorurrego
 */
public class MyBATISAsesoriaDAO implements AsesoriaDAO{
    @Inject
    private AsesoriaMapper asesoriaMapper;  
    //@Override
    //public List<Asesoria> loadAsesorias(){} 
    //@Override
    //public Asesoria loadAsesoria(@Param("id")int id){}
    //@Override
    //public void registrarInformacionDeAsesoria(){}
    //@Override
    //public void registrarInformacionDeAsistente(){}
}
