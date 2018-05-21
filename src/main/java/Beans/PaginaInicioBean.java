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
    private String cursoSeleccionado="todos";
    private List<Monitoria> monitorias;
    private List<Monitoria> monitoriasFiltradas;
    private String[] dias={"lunes","martes","miercoles","jueves","viernes","sabado"};

    public String[] getDias() {
        return dias;
    }

    public List<Monitoria> getMonitoriasFiltradas() {
        return monitoriasFiltradas;
    }

    public void setMonitoriasFiltradas(List<Monitoria> monitoriasFiltradas) {
        this.monitoriasFiltradas = monitoriasFiltradas;
    }

    public List<Monitoria> getMonitorias() {      
            return sa.loadMonitorias(sa.loadSemestreActual().getNumero());
        
    }

    public void setMonitorias(List<Monitoria> monitorias) {
        this.monitorias = monitorias;
    }

    public String getCursoSeleccionado() {
        return cursoSeleccionado;
    }

    public void setCursoSeleccionado(String cursoSeleccionado) {

        this.cursoSeleccionado = cursoSeleccionado;
    }

    public List<Curso> getCursos() {
        return sa.loadCursosQueTienenMonitoriasPorSemestre(sa.loadSemestreActual().getNumero());
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

}
