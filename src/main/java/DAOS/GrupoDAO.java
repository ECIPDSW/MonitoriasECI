/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Grupo;
import java.util.List;

/**
 *
 * @author David Rodriguez
 */
public interface GrupoDAO{
    List<Grupo> loadGrupos(String idCurso,int semestre);
    List<Grupo> loadGruposAsociadosProfesor(int idProfesor, int semestre);
    int numeroDeAsistenciasSegunGrupo(int grupo);
    void crearGrupo(int numero, String curso, int semestre, int profesor, int monitor);
    void asignarMonitorAGrupo(int idgrupo, int idmonitor);
}
