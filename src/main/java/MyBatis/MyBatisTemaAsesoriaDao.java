/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.AsesoriaDAO;
import DAOS.TemaAsesoriaDAO;
import Mappers.TemaAsesoriaMapper;
import com.google.inject.Inject;

/**
 *
 * @author martincantorurrego
 */
public class MyBatisTemaAsesoriaDao implements TemaAsesoriaDAO{
    @Inject
    private TemaAsesoriaMapper asesoriaMapper;  
    //@Override
    //public List<Asesoria> loadAsesorias(){} 
    //@Override
    //public Asesoria loadAsesoria(@Param("id")int id){}
    //@Override
    //public void registrarInformacionDeAsesoria(){}
    //@Override
    //public void registrarInformacionDeAsistente(){}
}
