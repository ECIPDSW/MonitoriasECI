/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.omega.view.overlay;

import Beans.ProfesorBean;
import Modelo.Persona;
import Modelo.Profesor;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;

import java.io.IOException;
import java.io.Serializable;
import static java.lang.Integer.parseInt;
import javax.enterprise.inject.spi.Bean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;


@ManagedBean(name = "Login")
@SessionScoped
public class UserLoginView {
    
    private Integer username;
    
    //private ProfesorBean ProfesorBean;
    private String password;
    private  boolean loggedIn = false;
    private Persona user;
    private ServicioAsesoria sa = Fabrica.getInstance().getServiciosAsesoria();
    
    public Integer getUsername() {
        
        return username;
    }

    public void setUsername(Integer username) {
        System.out.println("SET USERNAME CALLED="+username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    

    public void setPassword(String password) {
        System.out.println("SET password CALLED="+password);
        this.password = password;
    }
    public Persona getUser() {
        return user;
    }
    

    public void setUser(Persona user) {
        //System.out.println("SET password CALLED="+password);
        this.user= user;
    }
  
    public void login() throws IOException {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Something Went Wrong","Wrong");
        //user=sa.getProfesor(username);
        //ProfesorBean.setProfesor((Profesor)user);
        FacesContext facesContext = FacesContext.getCurrentInstance(); 
        System.out.println("LOGIN LLAMADO");
        if(username != null && username== user.getId() && password != null && password.equals(user.getContraseña())) {
            loggedIn = true;
            user=new Persona(2125275,"Oscar","Pinto","moka117@hotmail.com","12345");
            
            Flash flash = facesContext.getExternalContext().getFlash();
            flash.setKeepMessages(true);
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", ""+username));
            facesContext.getExternalContext().redirect("/monitorias/dashboard.xhtml");
        } else {
            loggedIn = false;
            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Loggin Error", "Invalid credentials"));
            //facesContext.getExternalContext().redirect("/monitorias/login.xhtml");
        }
        
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
    }
    public void preRenderView() throws IOException {
        if(!loggedIn){
            FacesContext.getCurrentInstance().getExternalContext().redirect("/monitorias/login.xhtml");
        }
    // Do here your job which should run right before the RENDER_RESPONSE.
    }
}
