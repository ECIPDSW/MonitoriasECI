/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Generadores.GeneradorExcel;
import Generadores.GeneradorPdf;
import Modelo.Administrador;
import Modelo.Monitor;
import Modelo.Profesor;
import Modelo.Semestre;
import Servicios.Fabrica;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andres Martin Cantor
 */
public class MonitoriasTest {
    
    private GeneradorExcel g = new GeneradorExcel();
    private GeneradorPdf p = new GeneradorPdf();
    
    public MonitoriasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     
    }
   
    @Test
    public void deberiaTenerEnCuentaLosRolesDeUsuario(){
       Administrador admin = Fabrica.getInstance().getServiciosAsesoria().loadAdminLogin(5, "admin");
       Monitor monitor = Fabrica.getInstance().getServiciosAsesoria().loadMonitorLogin(2, "admin");
       Profesor profesor = Fabrica.getInstance().getServiciosAsesoria().loadProfesorLogin(4, "admin") ;
       String p = (String) profesor.getClass().getName();
       String m = (String) monitor.getClass().getName();
       String a = (String) admin.getClass().getName();
       
       assertTrue(a.equals("Modelo.Administrador"));
       assertTrue(m.equals("Modelo.Monitor"));
       assertTrue(p.equals("Modelo.Profesor"));
             
    }
    
    @Test
    public void noDeberiaAceptarContraseñasMalas(){
        Profesor profesorbien = Fabrica.getInstance().getServiciosAsesoria().loadProfesorLogin(4, "admin") ;
        Profesor profesorpaila = Fabrica.getInstance().getServiciosAsesoria().loadProfesorLogin(4, "mala");
        
        assertTrue(profesorbien!=profesorpaila);
    }
    
    @Test
    public void deberiaCargarElSemestreActual(){
        Semestre actual = Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual();
        String actuals = actual.getAno()+"-"+actual.getPeriodoAcademico();
        assertTrue(actuals.equals("2018-2"));
    }
    
    @Test
    public void deberiaConsultarBienLasPersonas(){
        Administrador a = Fabrica.getInstance().getServiciosAsesoria().loadAdminLogin(5, "admin");
        Profesor p3 = Fabrica.getInstance().getServiciosAsesoria().getProfesor(3);
        Profesor p4 = Fabrica.getInstance().getServiciosAsesoria().getProfesor(4);
        Monitor m1 = Fabrica.getInstance().getServiciosAsesoria().loadMonitor(1);
        Monitor m2 = Fabrica.getInstance().getServiciosAsesoria().loadMonitor(2);
        
        assertTrue((a.getNombre()).equals("admin"));
        assertTrue((p3.getNombre()).equals("Nicolas"));
        assertTrue((p4.getNombre()).equals("Oscar"));
        assertTrue((m1.getNombre()).equals("David"));
        assertTrue((m2.getNombre()).equals("Martin"));
    }
    
    @Test
    public void deberiaConsultarMonitoresAsociadosAlProfesor(){
        List<Monitor> monitores = Fabrica.getInstance().getServiciosAsesoria().loadMonitoresAsociadosProfesor(Fabrica.getInstance().getServiciosAsesoria().getProfesor(3).getId(),Fabrica.getInstance().getServiciosAsesoria().getSemestre(1).getNumero());
        assertTrue((monitores.get(0).getNombre()).equals("Martin"));
    }
    
    
    

    @After
    public void tearDown() {
    }

}
