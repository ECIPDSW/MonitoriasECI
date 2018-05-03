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

import Beans.AdministradorBean;
import Beans.MonitorBean;
import Beans.ProfesorBean;
import Modelo.Administrador;
import Modelo.Main;
import Modelo.Monitor;
import Modelo.Persona;
import Modelo.Profesor;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;

import java.io.IOException;
import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.util.Map;
import javax.enterprise.inject.spi.Bean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

@ManagedBean(name = "Login")
@SessionScoped
public class UserLoginView implements Serializable {
    private boolean monitor=false;
    private boolean profesor=false;
    private boolean administrador=false;
    private Integer username;
    private ProfesorBean profesorBean;
    private MonitorBean monitorBean;
    private AdministradorBean administradorBean;
    private String password;
    private boolean loggedIn = false;
    private Persona user;
    private ServicioAsesoria sp = Fabrica.getInstance().getServiciosAsesoria();

    public UserLoginView() {

    }

    public Integer getUsername() {

        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Persona getUser() {
        return user;
    }

    public void setUser(Persona user) {

        this.user = user;
    }

    public boolean isMonitor() {
        return monitor;
    }

    public boolean isProfesor() {
        return profesor;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void login() throws IOException {

        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Something Went Wrong", "Wrong");
        FacesContext facesContext = FacesContext.getCurrentInstance();

        if (username != null && password != null) {
            if (sp.loadProfesorLogin(username, password) != null) {
                loginProfesor(facesContext);
            } else if (sp.loadMonitorLogin(username, password) != null) {
                loginMonitor(facesContext);
            } else if (sp.loadAdminLogin(username, password) != null) {
                loginAdmin(facesContext);
            } else {
                loggedIn = false;
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Loggin Error", "Invalid credentials"));
            }
        } else {
            loggedIn = false;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Loggin Error", "Invalid credentials"));
        }

        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
    }

    private void loginProfesor(FacesContext f) throws IOException {
        user = sp.loadProfesorLogin(username, password);
        profesorBean = f.getApplication().evaluateExpressionGet(f, "#{Profesor}", ProfesorBean.class);
        profesorBean.setProfesor((Profesor) user);
        profesor=true;
        loggedIn(f);
    }

    private void loginMonitor(FacesContext f) throws IOException {
        user = sp.loadMonitorLogin(username, password);
        monitorBean = f.getApplication().evaluateExpressionGet(f, "#{Monitor}", MonitorBean.class);
        monitorBean.setMonitor((Monitor) user);
        monitor=true;
        loggedIn(f);
    }

    private void loginAdmin(FacesContext f) throws IOException {
        user = sp.loadAdminLogin(username, password);
        administradorBean = f.getApplication().evaluateExpressionGet(f, "#{Administrador}", AdministradorBean.class);
        administradorBean.setAdministrador((Administrador) user);
        administrador=true;
        loggedIn(f);
    }

    private void loggedIn(FacesContext f) throws IOException {
        Flash flash = f.getExternalContext().getFlash();
        loggedIn = true;
        flash.setKeepMessages(true);
        f.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", "" + username));
        f.getExternalContext().redirect("/monitorias/dashboard.xhtml");

    }

    public void preRenderView() throws IOException {
        if (!loggedIn) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("/monitorias/login.xhtml");
        }

        // Do here your job which should run right before the RENDER_RESPONSE.
    }
    
    public String logout() throws IOException{
        monitor=false;
        profesor=false;
        administrador=false;
        loggedIn = false;
        username=null;
        password=null;
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        
        return "/login?faces-redirect=true";// indicas a donde quieres direccionar después de cerrar sesión 
        //FacesContext.getCurrentInstance().getExternalContext().redirect("/monitorias/login.xhtml");
        
    }
    

}
