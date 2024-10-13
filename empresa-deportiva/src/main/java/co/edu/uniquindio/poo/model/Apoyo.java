package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Apoyo extends Persona{

    private int experienciAños;

    public Apoyo(String nombre, String apellidos, LocalDate fechaNacimiento, String nacionalidad, int experienciAños) {
        super(nombre, apellidos, fechaNacimiento, nacionalidad);
        this.experienciAños = experienciAños;
    }


    //Setters & Getters

    
    public int getExperienciAños() {
        return experienciAños;
    }

    public void setExperienciAños(int experienciAños) {
        this.experienciAños = experienciAños;
    }

    
}
