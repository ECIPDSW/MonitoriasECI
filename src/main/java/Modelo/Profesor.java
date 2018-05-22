package Modelo;

import java.io.Serializable;

/**
 *Objeto del profesor
 * @author 666 Industries
 */
public class Profesor extends Persona implements Serializable{
    private String decanatura;

    public Profesor() {
    }

    public Profesor(int idProfesor, String decanatura, String nombre, String apellido, String correo, String contraseña) {
        super(idProfesor, nombre, apellido, correo, contraseña);
        this.decanatura = decanatura;
    }

    public String getDecanatura() {
        return decanatura;
    }

    public void setDecanatura(String decanatura) {
        this.decanatura = decanatura;
    }


    @Override
    public String toString() {
        return super.toString() +  "Profesor{" + "decanatura=" + decanatura +'}';
    }

    
}
