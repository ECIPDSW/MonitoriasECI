package Beans;
 

import Modelo.Semestre;
import Servicios.Fabrica;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

 

@ManagedBean(name = "login")
@SessionScoped
public class Login implements Serializable  {

    int usuario=-666;
    String password;
    
 
    @PostConstruct
    public void Login() {
        
        
    }
    public void setUsuario(int usuario){
        this.usuario=usuario;
        
    }
    public int getUsuario(){
        return usuario;
    }
    public void setPassword(String password){
        this.password=password;
        
    }
    public String getPassword(){
        return password;
    }
    public void Sign() throws MonitoriasException, IOException{
        /*
        FacesContext.getCurrentInstance().getExternalContext().dispatch("/foo.xhtml");*/

        
    }
    
    
 
    
    
    
}