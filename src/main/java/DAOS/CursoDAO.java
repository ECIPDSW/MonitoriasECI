/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Curso;
import java.util.List;

/**
 *
 * @author 2123162
 */
public interface CursoDAO {
    List<Curso> loadCursos();
    int numeroDeAsistenciasSegunCurso(String idCurso, int semestre);
    void crearCurso(String id, String nombre, int creditosAcademicos, int horasAprovadasMonitorias);
    List<Curso> loadCursosQueTienenMonitoriasPorSemestre(int semestre);
    Curso loadCursoPorMonitoria(int idMonitoria);
}
