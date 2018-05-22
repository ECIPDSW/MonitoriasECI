package MyBatis;

import DAOS.TemaAsesoriaDAO;
import Mappers.TemaAsesoriaMapper;
import com.google.inject.Inject;

/**
 *DAO de My batis del tema de asesoria
 * @author 666 Industries
 */
public class MyBatisTemaAsesoriaDao implements TemaAsesoriaDAO{
    @Inject
    private TemaAsesoriaMapper asesoriaMapper;  

    @Override
    public void agregarTemaAAsesoria(int idAsesoria, int idTema) {
        asesoriaMapper.agregarTemaAAsesoria(idAsesoria, idTema);
    }
}
