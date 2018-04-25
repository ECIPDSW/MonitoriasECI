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

import Modelo.Persona;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;


@ManagedBean(name = "Login")
@SessionScoped
public class UserLoginView implements Serializable{
    
    private String username;
    
    private String password;
    private  boolean loggedIn = false;
    private Persona user;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
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
        
        System.out.println("LOGIN LLAMADO");
        if(username != null && username.equals("admin") && password != null && password.equals("admin")) {
            loggedIn = true;
            user=new Persona(2125275,"Oscar","Pinto","moka117@hotmail.com","12345");
            FacesContext facesContext = FacesContext.getCurrentInstance();
            Flash flash = facesContext.getExternalContext().getFlash();
            flash.setKeepMessages(true);
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username));
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
