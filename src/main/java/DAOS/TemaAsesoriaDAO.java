/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;
import Modelo.Asesoria;

/**
 *
 * @author Oscar Pinto
 */
public interface TemaAsesoriaDAO {
    //public List<Asesoria> loadAsesorias();         
    //public Asesoria loadAsesoria(@Param("id")int id);
    //public void registrarInformacionDeAsesoria();
    //public void registrarInformacionDeAsistente();
    void agregarTemaAAsesoria(int idAsesoria, int idTema);
}
