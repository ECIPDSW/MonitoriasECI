package MyBatis;

import DAOS.MonitoriaDAO;
import Mappers.MonitoriaMapper;
import Modelo.Monitoria;
import com.google.inject.Inject;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 *DAO de My batis de la monitoria
 * @author 666 Industries
 */
public class MyBatisMonitoriaDao implements MonitoriaDAO{

    @Inject
    MonitoriaMapper monitoriaMapper;
    
    
    @Override
    public List<Monitoria> loadMonitoriasPorMonitor(int idMonitor) {
        return monitoriaMapper.loadMonitoriasPorMonitor(idMonitor);
    }

    @Override
    public Monitoria monitoriasDisponiblesParaDictar(int idMonitor) {
        return monitoriaMapper.monitoriasDisponiblesParaDictar(idMonitor);
    }

    @Override
    public List<Monitoria> loadMonitorias(int semestre) {
        return monitoriaMapper.loadMonitorias(semestre);
    }

    @Override
    public List<Monitoria> loadMonitorias(String idcurso, int semestre) {
        return monitoriaMapper.loadMonitoriasPorCurso(idcurso, semestre);
    }

    @Override
    public List<Date> loadFechasMonitorias(String idCurso, int semestre) {
        return monitoriaMapper.loadFechasMonitorias(idCurso, semestre);
    }

    @Override
    public int numeroDeAsistenciasSegunFecha(String idCurso, int semestre, Date fecha) {
        return monitoriaMapper.numeroDeAsistenciasSegunFecha(idCurso, semestre, fecha);
    }

    @Override
    public List<Time> franjasMonitorias(String idCurso, int semestre) {
        return monitoriaMapper.franjasMonitorias(idCurso, semestre);
    }

    @Override
    public int numeroDeAsistenciasSegunFranja(String idCurso, int semestre, Time franja) {
        return monitoriaMapper.numeroDeAsistenciasSegunFranja(idCurso, semestre, franja);
    }

    @Override
    public int numeroDeAsistenciasSegunMonitoria(int idMonitoria) {
        return monitoriaMapper.numeroDeAsistenciasSegunMonitoria(idMonitoria);
    }

    @Override
    public List<Monitoria> loadMonitoriasPorGrupo(int grupo) {
        return monitoriaMapper.loadMonitoriasPorGrupo(grupo);
    }

    @Override
    public void crearMonitoria(int grupo, int dia, Time horaInicio, Time horaFin, String lugar) {
        monitoriaMapper.crearMonitoria(grupo, dia, horaInicio, horaFin, lugar);
    }

    @Override
    public void modificarMonitoria(int IDmonitoria, Integer grupo, String dia, Time horaInicio, Time horaFin, String lugar) {
        monitoriaMapper.modificarMonitoria(IDmonitoria, grupo, dia, horaInicio, horaFin, lugar);
    }

    @Override
    public void eliminarMonitoria(int IDmonitoria) {
        monitoriaMapper.eliminarMonitoria(IDmonitoria);
    }

    @Override
    public List<Integer> asistenciasPorMonitoria() {
        return monitoriaMapper.asistenciasPorMonitoria();
    }
    
}
