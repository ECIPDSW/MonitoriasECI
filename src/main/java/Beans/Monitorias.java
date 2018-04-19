package Beans;
 
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

 

@ManagedBean(name = "Monitorias")
@SessionScoped
public class Monitorias implements Serializable  {
 
    private String console;
 
    private String car;
    private List<SelectItem> cars;
 
    private String city;
    private Map<String,String> cities = new HashMap<String, String>();
 
    private String profesor;
    private List<String> profesores;
 
    private String curso;
    private List<String> cursos;
 
 
    @PostConstruct
    public void Monitorias() {
        //cars
        System.out.println("LLENADO");
    

 
        //cursos
        cursos = new ArrayList<String>();
        cursos.add("PDSW");
        cursos.add("TPRO");
        cursos.add("TCOM");
        cursos.add("MDIS");
        cursos.add("ARQC");
        cursos.add("SOPC");
        //profesor
        profesores = new ArrayList<String>();
        profesores.add("Nesol Mandela");
        profesores.add("Ghandi");
        profesores.add("Martin Luther King");
        profesores.add("Atila El Huno");
        profesores.add("Teresa de Calcuta");
        profesores.add("Alan Turing");
    }
 
    public String getProfesor() {
        return profesor;
    }
 
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
 
    public List<String> getProfesores() {
        return profesores;
    }
 
    public void setProfesores(List<String> profesores) {
        this.profesores = profesores;
    }

 
    public String getCurso() {
        return curso;
    }
 
    public void setCurso(String curso) {
        this.curso = curso;
    }
 
    public List<String> getCursos() {
        return cursos;
    }
 
    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }
}