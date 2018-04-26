/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

/**
 *
 * @author martincantorurrego
 */
public interface AsesoriaDAO {
    //public List<Asesoria> loadAsesorias();         
    //public Asesoria loadAsesoria(@Param("id")int id);
    //public void registrarInformacionDeAsesoria();
    //public void registrarInformacionDeAsistente();
    void registrarAsesoria(int grupo, int monitoria, int idEstudiante, int nombreEstudiante, String observaciones);
}
