/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosImpl;


import DAOS.AdministradorDAO;
import DAOS.AsesoriaDAO;
import DAOS.CursoDAO;
import DAOS.GrupoDAO;
import DAOS.MonitorDAO;
import DAOS.MonitoriaDAO;
import DAOS.MonitoriaRegistradaDAO;
import DAOS.ProfesorDAO;
import DAOS.SemestreDAO;
import DAOS.TemaAsesoriaDAO;
import DAOS.TemaCursoDAO;
import Modelo.Administrador;
import Modelo.Asesoria;
import Modelo.Curso;
import Modelo.Grupo;
import Modelo.Monitor;
import Modelo.Monitoria;
import Modelo.MonitoriaRegistrada;
import Modelo.Profesor;
import Modelo.Semestre;
import Modelo.TemaAsesoria;
import Modelo.TemaCurso;
import MyBatis.MyBatisMonitorDao;
import MyBatis.MyBatisProfesorDao;
import MyBatis.MyBatisSemestreDao;
import Servicios.ServicioAsesoria;
import com.google.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author David Rodriguez
 */
public class ServicioAsesoriaImpl implements ServicioAsesoria,Serializable{

    @Inject
    private SemestreDAO semestre;
    @Inject
    private AsesoriaDAO asesoria;
    @Inject
    private TemaAsesoriaDAO temaasesoria;
    @Inject
    private MonitorDAO monitor;
    @Inject
    private ProfesorDAO profesor;
    @Inject
    private MonitoriaRegistradaDAO monitoriaregistrada;
    @Inject
    private GrupoDAO grupo;
    @Inject
    private AdministradorDAO administrador;
    @Inject
    private CursoDAO curso;
    @Inject
    private MonitoriaDAO monitoria;
    @Inject
    private TemaCursoDAO temaCurso;
    
    
    
    
    

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

    

    @Override
    public void registrarAsesoria(int grupo, int monitoriaRegistrada, int idEstudiante, String observaciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarInicioMonitoriaDictada(int idMonitoria, String ip) {
        monitoriaregistrada.registrarInicioMonitoriaDictada(idMonitoria, ip);
    }

    @Override
    public void registrarFinMonitoria(int idMonitor) {
        monitoriaregistrada.registrarFinMonitoria(idMonitor);
    }

    @Override
    public Monitoria monitoriasDisponiblesParaDictar(int idMonitor) {
        return monitoria.monitoriasDisponiblesParaDictar(idMonitor);
    }

    @Override
    public List<Curso> loadCursos() {
        return curso.loadCursos();
    }

    @Override
    public List<Monitoria> loadMonitorias(int semestre) {
        return monitoria.loadMonitorias(semestre);
    }

    @Override
    public List<Monitoria> loadMonitorias(String idcurso, int semestre) {
        return monitoria.loadMonitorias(idcurso,semestre);
    }

    @Override
    public List<Asesoria> loadAsesorias(int semestre) {
        return asesoria.loadAsesorias(semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorTema(int idTema, int semestre) {
        return asesoria.loadAsesoriasPorTema(idTema, semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorMonitor(int idMonitor, int semestre) {
        return asesoria.loadAsesoriasPorMonitor(idMonitor, semestre);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorGrupo(int idGrupo) {
        return asesoria.loadAsesoriasPorGrupo(idGrupo);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorCurso(String idCurso, int semestre) {
        return asesoria.loadAsesoriasPorCurso(idCurso, semestre);
    }

    @Override
    public List<Semestre> loadSemestres() {
        return semestre.loadSemestres();
    }

    @Override
    public Semestre loadSemestreActual() {
        return semestre.loadSemestreActual();
    }

    @Override
    public List<TemaCurso> loadTemasCurso(String idCurso) {
        return temaCurso.loadTemasCurso(idCurso);
    }

    @Override
    public List<TemaCurso> loadTemasAsesoria(int idAsesoria) {
        return temaCurso.loadTemasAsesoria(idAsesoria);
    }

    @Override
    public List<Monitor> loadMonitoresAsociadosProfesor(int idProfesor, int semestre) {
        return monitor.loadMonitoresAsociadosProfesor(idProfesor, semestre);
    }

    @Override
    public List<Grupo> loadGruposAsociadosProfesor(int idProfesor, int semestre) {
        return grupo.loadGruposAsociadosProfesor(idProfesor, semestre);
    }

    @Override
    public Administrador loadAdminLogin(int id, String psw) {
        return administrador.loadAdmin(id, psw);
    }

    @Override
    public Monitor loadMonitorLogin(int id, String psw) {
        return monitor.loadMonitorLogin(id, psw);
    }

    @Override
    public Profesor loadProfesorLogin(int id, String psw) {
        return profesor.loadProfesorLogin(id, psw);
    }

    @Override
    public List<Grupo> loadGrupos(String idCurso, int semestre) {
        return grupo.loadGrupos(idCurso, semestre);
    }

    @Override
    public List<Monitoria> loadMonitoriasPorMonitor(int idMonitor) {
        return monitoria.loadMonitoriasPorMonitor(idMonitor);
    }

    @Override
    public List<MonitoriaRegistrada> loadMonitoriasRegistradasPorMonitoria(int idMonitoria) {
        return monitoriaregistrada.loadMonitoriasRegistradasPorMonitoria(idMonitoria);
    }

    @Override
    public List<Asesoria> loadAsesoriasPorMonitoriaRegistrada(int idMonitoriaRegistrada) {
        return asesoria.loadAsesoriasPorMonitoriaRegistrada(idMonitoriaRegistrada);
    }

    @Override
    public Monitor loadMonitorPorGrupo(int idgrupo) {
        return monitor.loadMonitorPorGrupo(idgrupo);
    }
   
    
}
