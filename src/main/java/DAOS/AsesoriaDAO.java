/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Asesoria;
import java.util.List;

/**
 *
 * @author martincantorurrego
 */
public interface AsesoriaDAO {
    //public List<Asesoria> loadAsesorias();         
    //public Asesoria loadAsesoria(@Param("id")int id);
    //public void registrarInformacionDeAsesoria();
    //public void registrarInformacionDeAsistente();
    void registrarAsesoria(int grupo, int monitor, int idEstudiante, String nombreEstudiante, String observaciones);
    List<Asesoria> loadAsesorias(int semestre);
    List<Asesoria> loadAsesoriasPorTema(int idTema, int semestre);
    List<Asesoria> loadAsesoriasPorMonitor(int idMonitor, int semestre);
    List<Asesoria> loadAsesoriasPorGrupo(int idGrupo);
    List<Asesoria> loadAsesoriasPorCurso(String idCurso, int semestre);
}
