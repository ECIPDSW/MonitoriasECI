package Beans;
 

import Modelo.Grupo;
import Modelo.Monitor;
import Modelo.Profesor;
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

 

@ManagedBean(name = "Profesor")
@SessionScoped
public class ProfesorBean implements Serializable  {
    
    private ServicioAsesoria sa = Fabrica.getInstance().getServiciosAsesoria();
    
    private Profesor profesor;
    private Map<String,Grupo> grupos = new HashMap<String, Grupo>();
    private Grupo grupo;
    
    public void MonitorBean() {
        for(int i=0;i<profesor.getGrupos().size();i++){
            grupos.put(profesor.getGrupos().get(i).getCurso().getNombre()+""+profesor.getGrupos().get(i).getNumero(),profesor.getGrupos().get(i));
        }
        System.out.println("LLENADO");
 
    }
 
    public Profesor getProfesor() {
        return profesor;
    }
 
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
 
    public Map<String, Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupo(Grupo grupo){
        this.grupo=grupo;
    }
    public Grupo getGrupo(){
        return grupo;
    }
}