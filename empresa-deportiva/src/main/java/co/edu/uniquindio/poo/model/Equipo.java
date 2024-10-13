package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Equipo {

    private String nombre;
    private String paisOrigen;
    private Collection<Atleta> listaAtletas;


    public Equipo(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        listaAtletas = new LinkedList<Atleta>();
    }



    
    //Setters & Getters
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPaisOrigen() {
        return paisOrigen;
    }


    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }


    public Collection<Atleta> getListaAtletas() {
        return listaAtletas;
    }


    public void setListaAtletas(Collection<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }


}
