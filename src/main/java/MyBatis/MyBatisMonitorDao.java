package MyBatis;

import DAOS.MonitorDAO;
import Mappers.MonitorMapper;
import Modelo.Monitor;
import com.google.inject.Inject;
import java.util.List;

/**
 *DAO de My batis del monitor
 * @author 666 Industries
 */
public class MyBatisMonitorDao implements MonitorDAO{
    @Inject
    private MonitorMapper monitormapper;

    @Override
    public Monitor loadMonitor(int id) {
        return monitormapper.loadMonitor(id);
    }

    @Override
    public Monitor loadMonitorLogin(int id, String psw) {
        return monitormapper.loadMonitorLogin(id, psw);
    }

    @Override
    public List<Monitor> loadMonitoresAsociadosProfesor(int idProfesor, int semestre) {
        return monitormapper.loadMonitoresAsociadosProfesor(idProfesor, semestre);
    }

    @Override
    public Monitor loadMonitorPorGrupo(int idgrupo) {
        return monitormapper.loadMonitorPorGrupo(idgrupo);
    }

    @Override
    public void crearMonitor(int id, String nombre, String apellido, String correo, String contrasena, int telefono, String programa, String semestreIngreso) {
        monitormapper.crearMonitor(id, nombre, apellido, correo, contrasena, telefono, programa, semestreIngreso);
    }

    @Override
    public void asignarSemestreAMonitor(int idmonitor, int idsemestre) {
        monitormapper.asignarSemestreAMonitor(idmonitor, idsemestre);
    }

    @Override
    public List<Monitor> loadMonitores() {
        return monitormapper.loadMonitores();
    }

    @Override
    public void modificarMonitor(int idViejo, Integer idNuevo, String nombre, String apellido, String correo, String contasena, Integer telefono, String programaAcademico, Integer semestreDeIngreso) {
        monitormapper.modificarMonitor(idViejo, idNuevo, nombre, apellido, correo, contasena, telefono, programaAcademico, semestreDeIngreso);
    }
    
}
