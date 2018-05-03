/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Modelo.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author David Rodriguez
 */
public interface ServicioAsesoria {
    Semestre getSemestre(int id);
    Profesor getProfesor(int id);
    Monitor loadMonitor(int id);
    void registrarAsesoria(int grupo, int monitoriaRegistrada, int idEstudiante, String observaciones);
    /**
     * registra el inicio de una monitoria en especifico por un monitor
     * @param idMonitoria
     * @param ip 
     */
    void registrarInicioMonitoriaDictada(int idMonitoria,String ip);
    
    /**
     * registra el fin de la franja de un monitor
     * @param idMonitoria
     * @param ip 
     */
    void registrarFinMonitoria(int idMonitor);
    
    /**
     * devuelve todas las monitorias que estan disponibles para dictar por el monitor 
     * en la hora actual
     * @param idMonitor
     * @return 
     */
    List<Monitoria> monitoriasDisponiblesParaDictar(int idMonitor);
    /**
     * Carga todos los cursos disponibles  
     * @return 
     */
    List<Curso> loadCursos();
    /**
     * Retorna todas las monitorias dictadas en un semestre especifico
     * @return 
     */
    List<Monitoria> loadMonitorias(int semestre);
  
     /**
     * Retorna todas las monitorias disponibles en el semestre actual de un curso en especifico
     * @return 
     */
    List<Monitoria> loadMonitorias(String idcurso, int semestre);
    
     /**
     * Retorna todas las asesorias dictadas  el semestre especificado
     * @return 
     */
    List<Asesoria> loadAsesorias(int semestre);
    /**
     * Retorna todas las asesorias dictadas  por tema especificado
     * @return 
     */
    List<Asesoria> loadAsesoriasPorTema(int idTema,int semestre);
    /**
     * Retorna todas las asesorias dictadas  por monitor
     * @return 
     */
    List<Asesoria> loadAsesoriasPorMonitor(int idMonitor,int semestre);
    
    /**
     * Retorna todas las asesorias dictadas  por Grupo
     * @return 
     */
    List<Asesoria> loadAsesoriasPorGrupo(int idGrupo);
      /**
     * Retorna todas las asesorias dictadas  por curso
     * @return 
     */
    List<Asesoria> loadAsesoriasPorCurso(String idCurso);
    
    /**
     * retorna todos los semestres que han sido creados
     * @return 
     */
    List<Semestre> loadSemestres();
    /**
     * retorna el semestre actual
     * @return 
     */
    Semestre loadSemestreActual();
    
    /**
     * retorna los temas disponibles para un curso
     * @param idCurso
     * @return 
     */
    List<TemaCurso> loadTemasCurso(int idCurso);
    
      /**
     * retorna los temas dicrtados en una asesoria
     * @param idCurso
     * @return 
     */
    List<TemaAsesoria> loadTemasAsesoria(int idAsesoria);
    
    /**
     * devuelve todos los monitores por profesor
     * @param idProfesor
     * @return 
     */
    List<Monitor> LoadMonitoresAsociadosProfesor(int idProfesor,int semestre);
    
      /**
     * devuelve todos los grupos por profesor
     * @param idProfesor
     * @return 
     */
    List<Grupo> LoadGruposAsociadosProfesor(int idProfesor,int semestre);
    
    /**
     * retorna el administrador con las credenciales registradas
     * @param id
     * @param psw
     * @return 
     */
    Administrador loadAdminLogin(int id,String psw);
    
    /**
     * retorna el monitor con las credenciales registradas
     * @param id
     * @param psw
     * @return 
     */
    Monitor loadMonitorLogin(int id,String psw);
    
    /**
     * retorna el Profesor con las credenciales registradas
     * @param id
     * @param psw
     * @return 
     */
    Profesor loadProfesorLogin(int id,String psw);
    
    /**
     * retorna todods los grupos existentes para un curso
     * @param idCurso
     * @return 
     */
    List<Grupo> loadGrupos(String idCurso,int semestre);
    
    List<Monitoria> loadMonitoriasPorMonitor(int idMonitor);
}
