package Beans;
 

import Modelo.Asesoria;
import Modelo.Grupo;
import Modelo.Monitor;
import Modelo.Monitoria;
import Modelo.MonitoriaRegistrada;
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
    private Map<String,String>gruposs = new HashMap<String,String>();
    private Grupo grupo;
    private String gruponame="";
    private Monitor monitor;
    private String nombrem="";
    private List<Monitoria> monitorias=new ArrayList<Monitoria>();
    private Monitoria mon;
    private List<MonitoriaRegistrada> monreg= new ArrayList<MonitoriaRegistrada>();
    private MonitoriaRegistrada monr;
    private List<Asesoria> asesorias = new ArrayList<Asesoria>();
    
 
    public Profesor getProfesor() {
        return profesor;
    }
 
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public List<Monitoria> getMonitorias(){
        //System.out.println(monitorias);
        return monitorias;
    }
    public List<Asesoria> getAsesorias(){
        //System.out.println("ASESORIAS");
        return asesorias;
    }
    public void setMonitoria(Monitoria mo){
        this.mon=mo;
    }
    public Monitoria getMonitoria(){
        return mon;
    }
    public List<MonitoriaRegistrada> getMonitoriasr(){
        //System.out.println("MONITORIAS");
        return monreg;
    }
    public void setMonitoriar(MonitoriaRegistrada mo){
        this.monr=mo;
    }
    public MonitoriaRegistrada getMonitoriar(){
        return monr;
    }
    public Map<String, String> getGrupos() {
        //System.out.println("LLAMADOG");
        return gruposs;
    }
    public void setGrupo(String name){
        //System.out.println("LLAMADOGS");
        this.gruponame=name;
        grupo=grupos.get(name);
        //System.out.println("GRUPOOOO="+grupo);
    }
    public String getGrupo(){
        return gruponame;
    }

 
    public String getGrupoName(){
        return gruponame;
    }
        public void setGrupoName(String name){
            grupo=grupos.get(name);
        this.gruponame=name;
    }
 
    public String getNombrem(){
        
        return  nombrem;
    }
    /*
    public void refresh(){
        //System.out.println("tamaño="+profesor.getGrupos().size());
        for(int i=0;i<profesor.getGrupos().size();i++){
            grupos.put(profesor.getGrupos().get(i).getCurso().getNombre()+""+profesor.getGrupos().get(i).getNumero(),profesor.getGrupos().get(i));
            gruposs.put(profesor.getGrupos().get(i).getCurso().getNombre()+""+profesor.getGrupos().get(i).getNumero(),profesor.getGrupos().get(i).getCurso().getNombre()+""+profesor.getGrupos().get(i).getNumero());
        }
        //System.out.println("LLENADO");
    }
    */
    /*
    public void buscar(){
       // System.out.println("BUSCAR");
        //System.out.println("GRUPOOOOFINAL="+grupo);
        monitor=grupo.getMonitor();
        nombrem=monitor.getNombre()+" "+monitor.getApellido();
        //System.out.println("MONITORIAS SIZE="+grupo.getMonitorias().size());
        monitorias=new ArrayList<Monitoria>();
        for(int i=0;i<grupo.getMonitorias().size();i++){
            Monitoria mu = grupo.getMonitorias().get(i);
            monitorias.add(mu);
            //System.out.println("DIA"+mu.getDia()+" FIN"+mu.getHoraFin()+"INI"+mu.getHoraInicio()+"LUGAR"+mu.getLugar());
        }
        //System.out.println("LLENADO");
    }
    */
    /*
    public void moni(Monitoria mon){
        //System.out.println("ELEGIDA");
        this.mon=mon;
        monreg=new ArrayList<MonitoriaRegistrada>();
        for(int i=0;i<mon.getMregistrada().size();i++){
            MonitoriaRegistrada mr = mon.getMregistrada().get(i);
            monreg.add(mr);
            
        }
    }
    */
    /*
    public void aseso(MonitoriaRegistrada monreg){
        this.monr=monreg;
        asesorias=new ArrayList<Asesoria>();
        for(int i=0;i<monr.getAsesorias().size();i++){
            Asesoria as = monr.getAsesorias().get(i);
            asesorias.add(as);
            
        }
    }
    */
}