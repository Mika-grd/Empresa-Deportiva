package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Arbitro extends Persona{

    private String categoria;

    public Arbitro(String nombre, String apellidos, LocalDate fechaNacimiento, String nacionalidad, String categoria) {
        super(nombre, apellidos, fechaNacimiento, nacionalidad);
        this.categoria = categoria;
    }


    
    //Setters & Getters


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
