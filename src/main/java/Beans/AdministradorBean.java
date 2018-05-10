package Beans;
 

import Modelo.Administrador;
import Modelo.Curso;
import Modelo.Monitor;
import Modelo.Semestre;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

 

@ManagedBean(name = "Administrador")
@SessionScoped
public class AdministradorBean implements Serializable  {
    private ServicioAsesoria sa = Fabrica.getInstance().getServiciosAsesoria();
    private Administrador administrador;
    private List<Curso> cursos;
    private Curso cursoSeleccionado;
    private Semestre semestreSeleccionado;
    private List<Semestre> semestres;
 
 
    
    public void AdministradorBean() {
     
    }

    public List<Curso> getCursos() {
        return sa.loadCursos();
    }

   

    public Curso getCursoSeleccionado() {
        return cursoSeleccionado;
    }

    public void setCursoSeleccionado(Curso cursoSeleccionado) {
        this.cursoSeleccionado = cursoSeleccionado;
    }

    public Semestre getSemestreSeleccionado() {
        return semestreSeleccionado;
    }

    public void setSemestreSeleccionado(Semestre semestreSeleccionado) {
        this.semestreSeleccionado = semestreSeleccionado;
    }

    public List<Semestre> getSemestres() {
        return sa.loadSemestres();
    }

    public void setSemestres(List<Semestre> semestres) {
        this.semestres = semestres;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
 
    

    
    
}