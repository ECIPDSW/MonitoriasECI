package MyBatis;

import DAOS.SemestreDAO;
import Mappers.SemestreMapper;
import Modelo.Semestre;
import com.google.inject.Inject;
import java.sql.Date;
import java.util.List;


/**
 *DAO de My batis del semestre
 * @author 666 Industries
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

    @Override
    public void crearSemestre(int ano, char periodoAcademico, Date fechaInicio, Date fechaFin) {
        semestreMapper.crearSemestre(ano, periodoAcademico, fechaInicio, fechaFin);
    }
   
   
}
