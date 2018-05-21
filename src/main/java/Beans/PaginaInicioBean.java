/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Curso;
import Modelo.Monitoria;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name = "Inicio")
@SessionScoped
public class PaginaInicioBean implements Serializable {
    private static final ServicioAsesoria sa = Fabrica.getInstance().getServiciosAsesoria();
    private List<Curso> cursos;
    private Curso cursoSeleccionado;
    private List<Monitoria> monitorias;

    

    public List<Monitoria> getMonitorias() {
        return monitorias;
    }

    public void setMonitorias(List<Monitoria> monitorias) {
        this.monitorias = monitorias;
    }
    
    

    public Curso getCursoSeleccionado() {
        return cursoSeleccionado;
    }

    public void setCursoSeleccionado(Curso cursoSeleccionado) {
        this.cursoSeleccionado = cursoSeleccionado;
    }
    
    

    public List<Curso> getCursos() {
        return sa.loadCursos();
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
    
}
