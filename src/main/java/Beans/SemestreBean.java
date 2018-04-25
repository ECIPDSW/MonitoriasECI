/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Semestre;
import Servicios.Fabrica;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author martincantorurrego
 */
@ManagedBean(name = "Semestre")
@SessionScoped
public class SemestreBean implements Serializable{
    private Semestre semestre;

    public Semestre getSemestre() {
        return Fabrica.getInstance().getServiciosSemestre().loadSemestre(1);
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
    
    
}
