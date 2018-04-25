/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Modelo.Semestre;

/**
 *
 * @author martincantorurrego
 */
public interface SemestreDAO {     
    public Semestre loadSemestre(int id);
    //public void registrarInformacionDeAsesoria();
    //public void registrarInformacionDeAsistente();
}
