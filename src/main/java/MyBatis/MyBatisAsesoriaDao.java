/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.AsesoriaDAO;
import Mappers.AsesoriaMapper;
import Modelo.Asesoria;
import com.google.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author martincantorurrego
 */
public class MyBatisAsesoriaDao implements AsesoriaDAO,Serializable{
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

    @Override
    public void registrarAsesoria(int grupo, int monitor, int idEstudiante, String nombreEstudiante, String observaciones) {
        asesoriaMapper.registrarAsesoria(grupo, monitor, idEstudiante, nombreEstudiante, observaciones);
}

    @Override
    public List<Asesoria> loadAsesorias(int semestre) {
        return asesoriaMapper.loadAsesorias(semestre);
    }
}