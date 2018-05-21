/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Generadores.GeneradorExcel;
import Generadores.GeneradorPdf;
import Servicios.Fabrica;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.write.WriteException;


/**
 *
 * @author martincantorurrego
 */
public class Main {
    public static Monitor monitor;
    public static Profesor profesor;
    public static Fabrica fabrica = Fabrica.getInstance();  
    public static GeneradorExcel g = new GeneradorExcel();
    public static void main(String args[]){
         //Descarga de PDFS
        /*String sPropiedades = System.getProperty("user.name");
        GeneradorPdf pdf = new GeneradorPdf();
        pdf.generarPDF("CONSULTA ASESORIAS", "Asistencia Asesorias:", "Porcentajes por curso:","Porcentajes por grupo:","porcentajes por tema:", "/home/local/LABINFO/"+sPropiedades+"/Desktop/MonitoriasECI/img/grafica.png", "/home/local/LABINFO/"+sPropiedades+"/Desktop/MonitoriasECI/img/grafica.png","/home/local/LABINFO/"+sPropiedades+"/Desktop/MonitoriasECI/img/grafica.png","/home/local/LABINFO/"+sPropiedades+"/Desktop/MonitoriasECI/img/grafica.png","/home/local/LABINFO/"+sPropiedades+"/Downloads/prueba.pdf");
        pdf.generarPdfv2("ASESORIA","Materia:","Franja Horaria:", "Temas:", "Numero de Estudiantes:", "/home/local/LABINFO/"+sPropiedades+"/Downloads/prueba2.pdf");

       //Ejemplo Descarga Excel
        String[][] entrada = new String[5][5];
        entrada[1][1] = "Asesoria";
        entrada[1][2] = "Materia";
        entrada[1][3] = "Franja Horaria";
        entrada[1][4] = "# de Estudiantes";
        
        try {
            g.generarExcel(entrada,"/home/local/LABINFO/"+sPropiedades+"/Downloads/pruebaexcel.xls");
        } catch (WriteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/


        /*System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadGrupos("PIMB", 1));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadAdminLogin(5, "admin"));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().getProfesor(3));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitor(1));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitorLogin(2, "admin"));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadProfesorLogin(4, "admin"));
        //Donde ponen la constrasena mala
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadProfesorLogin(4, "mala"));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadCursos());
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitoriasPorMonitor(2));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().monitoriasDisponiblesParaDictar(1));
        //Inserts asesoria
        try{
            Fabrica.getInstance().getServiciosAsesoria().registrarInicioMonitoriaDictada(1, "124.58.45.2");
            Fabrica.getInstance().getServiciosAsesoria().registrarFinMonitoria(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("NO ES LA HORA DEL MONITOR");
        }
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual());
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitorias(Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadSemestres());
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitorias("PIMB", Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadAsesorias(Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadTemasCurso("PIMB"));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadTemasAsesoria(1));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitoresAsociadosProfesor(3, Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadGruposAsociadosProfesor(4, Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadAsesoriasPorTema(1, Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadAsesoriasPorMonitor(1, Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadAsesoriasPorGrupo(5));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadAsesoriasPorCurso("PIMO", Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitoriasRegistradasPorMonitoria(5));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadAsesoriasPorMonitoriaRegistrada(1));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitorPorGrupo(5));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadEstudiantePorAsesoria(1));*/
        //INICIO
       /* System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadFechasMonitorias("PIMO", Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().numeroDeAsistenciasSegunFecha("PIMO", Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero(), Fabrica.getInstance().getServiciosAsesoria().loadFechasMonitorias("PIMO", Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()).get(0)));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().numeroDeAsistenciasSegunGrupo(5));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().franjasMonitorias("PIMO", Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().numeroDeAsistenciasSegunFranja("PIMB", Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero(), Fabrica.getInstance().getServiciosAsesoria().franjasMonitorias("PIMB", Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()).get(0)));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().numeroDeAsistenciasSegunMonitoria(2));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().numeroDeAsistenciasSegunTema(1, Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().numeroDeAsistenciasSegunCurso("PIMB", Fabrica.getInstance().getServiciosAsesoria().loadSemestreActual().getNumero()));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().asesoriasDeUnaMonitoria(17));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadSemestreAnterior());

        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitoriasPorGrupo(13));*/

        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitoriasPorGrupo(13));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadCursosQueTienenMonitoriasPorSemestre(1));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitorias("PIMB", 2));
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadMonitorias(null, 2));

        //FIN
        /*System.out.println("PROFE");
        Profesor p = fabrica.getServiciosAsesoria().getProfesor(4);
        System.out.println(p);
        System.out.println("\nConsultar Monitor\n");
        System.out.println(fabrica.getServiciosAsesoria().loadMonitor(1));*/
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadCursos());
        System.out.println(Fabrica.getInstance().getServiciosAsesoria().loadCursoPorMonitoria(2));
    }
    
}
