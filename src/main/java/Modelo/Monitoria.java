package Modelo;

import Servicios.Fabrica;
import java.io.Serializable;
import java.sql.Time;

/**
 *Objeto de monitoria
 * @author 666 Industries
 */
public class Monitoria implements Serializable {
    private int idMonitoria;
    private String dia;
    private Time horaInicio;
    private Time horaFin;
    private String lugar;
    private Grupo grupo;
    private Curso curso;

    public Monitoria() {
    }

    public Monitoria(int idMonitoria, String dia, Time horaInicio, Time horaFin, String lugar, Grupo grupo) {
        this.idMonitoria = idMonitoria;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
        this.grupo = grupo;
    }

    public Curso getCurso() {
        return Fabrica.getInstance().getServiciosAsesoria().loadCursoPorMonitoria(idMonitoria);
    }
    

    public int getIdMonitoria() {
        return idMonitoria;
    }

    public void setIdMonitoria(int idMonitoria) {
        this.idMonitoria = idMonitoria;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Monitoria{" + "idMonitoria=" + idMonitoria + ", dia=" + dia + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", lugar=" + lugar + ", grupo=" + grupo + '}';
    }

    
}
