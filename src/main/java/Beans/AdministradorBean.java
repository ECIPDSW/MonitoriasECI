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
    private String codNuevoCurso;
    private String nombreNuevoCurso;
    private int horasAprovadasNuevoCurso;
    private int creditosNuevoCurso;
 
 
    
    public void AdministradorBean() {
     
    }

    public String getCodNuevoCurso() {
        return codNuevoCurso;
    }

    public void setCodNuevoCurso(String codNuevoCurso) {
        this.codNuevoCurso = codNuevoCurso.toUpperCase();
    }

    public String getNombreNuevoCurso() {
        return nombreNuevoCurso;
    }

    public void setNombreNuevoCurso(String nombreNuevoCurso) {
        this.nombreNuevoCurso = nombreNuevoCurso.toUpperCase();
    }

    public int getHorasAprovadasNuevoCurso() {
        return horasAprovadasNuevoCurso;
    }

    public void setHorasAprovadasNuevoCurso(int horasAprovadosNuevoCurso) {
        this.horasAprovadasNuevoCurso = horasAprovadosNuevoCurso;
    }

    public int getCreditosNuevoCurso() {
        return creditosNuevoCurso;
    }

    public void setCreditosNuevoCurso(int creditosNuevoCurso) {
        this.creditosNuevoCurso = creditosNuevoCurso;
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
 
    public void crearCurso(){
     System.out.println("entro");
     sa.crearCurso(codNuevoCurso, nombreNuevoCurso, creditosNuevoCurso, horasAprovadasNuevoCurso);
    }

    
    
}