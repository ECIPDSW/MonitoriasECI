/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Curso;
import Modelo.Grupo;
import Modelo.Semestre;
import Servicios.Fabrica;
import Servicios.ServicioAsesoria;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.DateAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean(name = "Estadisticas")
@SessionScoped
public class EstadisticasBean implements Serializable {

    private ServicioAsesoria sa = Fabrica.getInstance().getServiciosAsesoria();
    private LineChartModel lineModel1;
    private int semestreSeleccionado;
    private String cursoSeleccionado;
    private BarChartModel asistenciaFranjas;
    private PieChartModel asistenciasSegunFranjas;
    private PieChartModel asistenciasSegunGrupos;

    public PieChartModel getAsistenciasSegunFranjas() {
        return asistenciasSegunFranjas;
    }

    public void setAsistenciasSegunFranjas(PieChartModel asistenciasSegunFranjas) {
        this.asistenciasSegunFranjas = asistenciasSegunFranjas;
    }

    public LineChartModel getLineModel1() {
        return lineModel1;
    }

    public void setLineModel1(LineChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public BarChartModel getAsistenciaFranjas() {
        return asistenciaFranjas;
    }

    public void setAsistenciaFranjas(BarChartModel asistenciaFranjas) {
        this.asistenciaFranjas = asistenciaFranjas;
    }

    @PostConstruct
    public void init() {
        crearGraficasLineares();
        crearGraficosBarras();
        crearGraficosTorta();

    }

    public void refrescar() {
        crearGraficasLineares();
        crearGraficosBarras();
        crearGraficosTorta();
    }

    public int getSemestreSeleccionado() {
        return semestreSeleccionado;
    }

    public void setSemestreSeleccionado(int semestreSeleccionado) {
        this.semestreSeleccionado = semestreSeleccionado;
    }

    public PieChartModel getAsistenciasSegunGrupos() {
        return asistenciasSegunGrupos;
    }

    public void setAsistenciasSegunGrupos(PieChartModel asistenciasSegunGrupos) {
        this.asistenciasSegunGrupos = asistenciasSegunGrupos;
    }

    public String getCursoSeleccionado() {
        return cursoSeleccionado;
    }

    public void setCursoSeleccionado(String cursoSeleccionado) {
        this.cursoSeleccionado = cursoSeleccionado;
    }

    private void crearGraficosTorta() {
        asistenciasSegunFranjas = new PieChartModel();
        asistenciasSegunGrupos = new PieChartModel();
        
        if (cursoSeleccionado != null) {
            List<Grupo> grupos=sa.loadGrupos(cursoSeleccionado, semestreSeleccionado);
            for(Grupo g:grupos){
                asistenciasSegunGrupos.set(g.getCurso().getNombre()+" - "+Integer.toString(g.getNumero()),sa.numeroDeAsistenciasSegunGrupo(g.getIdGrupo()));
            }
            asistenciasSegunGrupos.setLegendPosition("e");
            asistenciasSegunGrupos.setShowDataLabels(true);
            asistenciasSegunGrupos.setExtender("skinPie");
            List<Time> franjas = sa.franjasMonitorias(cursoSeleccionado, semestreSeleccionado);
            for (Time t : franjas) {
                asistenciasSegunFranjas.set(t.toString(), sa.numeroDeAsistenciasSegunFranja(cursoSeleccionado, semestreSeleccionado, t));
            }
            asistenciasSegunFranjas.setLegendPosition("e");
            asistenciasSegunFranjas.setShowDataLabels(true);
            asistenciasSegunFranjas.setExtender("skinPie");
        }

    }

    private void crearGraficosBarras() {
        asistenciaFranjas = initGraficosBarras();
        asistenciaFranjas.setLegendPosition("ne");

        Axis xAxis = asistenciaFranjas.getAxis(AxisType.X);
        xAxis.setLabel("Gender");

        Axis yAxis = asistenciaFranjas.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);

        asistenciaFranjas.setExtender("skinBar");
    }

    private BarChartModel initGraficosBarras() {
        BarChartModel model = new BarChartModel();

        ChartSeries semestre = new ChartSeries();
        if (cursoSeleccionado != null) {
            semestre.setLabel("Boys");
            List<Time> franjas = sa.franjasMonitorias(cursoSeleccionado, semestreSeleccionado);
            for (Time t : franjas) {
                semestre.set(t, sa.numeroDeAsistenciasSegunFranja(cursoSeleccionado, semestreSeleccionado, t));
            }
            model.addSeries(semestre);
        }

        return model;
    }

    private void crearGraficasLineares() {
        lineModel1 = initLinearModel();
        lineModel1.setLegendPosition("e");
        lineModel1.setZoom(true);
        lineModel1.setExtender("skinChart");

        DateAxis axis = new DateAxis("Fechas");
        axis.setTickAngle(-50);
        axis.setTickFormat("%b %#d, %y");
        lineModel1.getAxes().put(AxisType.X, axis);
        lineModel1.setExtender("skinZoom");
    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();

        if (cursoSeleccionado != null) {
            series1.setLabel(sa.getSemestre(semestreSeleccionado).toString());
            List<Date> fechas = sa.loadFechasMonitorias(cursoSeleccionado, semestreSeleccionado);
            for (Date d : fechas) {
                series1.set(d, sa.numeroDeAsistenciasSegunFecha(cursoSeleccionado, semestreSeleccionado, d));
            }

            if (sa.getSemestre(semestreSeleccionado - 1) != null) {
                LineChartSeries series2 = new LineChartSeries();
                series2.setLabel(sa.getSemestre(semestreSeleccionado - 1).toString());
                for (Date d : fechas) {
                    series2.set(d, sa.numeroDeAsistenciasSegunFecha(cursoSeleccionado, semestreSeleccionado - 1, d));
                }
                model.addSeries(series2);
            }
        }

        model.addSeries(series1);
        return model;
    }
}
