/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Curso;
import Modelo.Semestre;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean(name = "Estadisticas")
@SessionScoped
public class EstadisticasBean implements Serializable {
    private ServicioAsesoria sa = Fabrica.getInstance().getServiciosAsesoria();
    private LineChartModel lineModel1;
    private int semestreSeleccionado =sa.loadSemestreActual().getNumero();
    private String cursoSeleccionado;

    public LineChartModel getLineModel1() {
        return lineModel1;
    }

    public void setLineModel1(LineChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }
    
    @PostConstruct
    public void init() {
        crearGraficasLineares();
        
	}

    public int getSemestreSeleccionado() {
        return semestreSeleccionado;
    }

    public void setSemestreSeleccionado(int semestreSeleccionado) {
        this.semestreSeleccionado = semestreSeleccionado;
    }

    public String getCursoSeleccionado() {
        return cursoSeleccionado;
    }

    public void setCursoSeleccionado(String cursoSeleccionado) {
        this.cursoSeleccionado = cursoSeleccionado;
    }
    
    
    private void crearGraficasLineares() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Linear Chart");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
        lineModel1.setZoom(true);
        lineModel1.setExtender("skinChart");   
    }
    
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel(sa.getSemestre(semestreSeleccionado).toString());

        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");

        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);

        model.addSeries(series1);
        model.addSeries(series2);
        
        return model;
    }
}
