/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBatis;

import DAOS.GrupoDAO;
import Mappers.GrupoMapper;
import Modelo.Grupo;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author David Rodriguez
 */
public class MyBatisGrupoDao implements GrupoDAO{
    @Inject
    private GrupoMapper grupoMapper;

    @Override
    public List<Grupo> loadGrupos(String idCurso, int semestre) {
        return grupoMapper.loadGrupos(idCurso, semestre);
    }
}
