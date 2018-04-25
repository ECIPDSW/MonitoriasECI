/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosImpl;


import DAOS.MonitorDAO;
import DAOS.ProfesorDAO;
import DAOS.SemestreDAO;
import Modelo.Monitor;
import Modelo.Profesor;
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
    private SemestreDAO semestre;
    
    @Inject
    private ProfesorDAO profesor;
    
    @Inject
    private MonitorDAO monitor;

    @Override
    public Semestre getSemestre(int id) {
        return semestre.loadSemestre(id);
    }

    @Override
    public Profesor getProfesor(int id) {
        return profesor.loadProfesor(id);
    }

    @Override
    public Monitor loadMonitor(int id) {
        return monitor.loadMonitor(id);
    }
   
    
}
