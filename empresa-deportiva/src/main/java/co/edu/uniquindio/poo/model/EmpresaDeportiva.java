package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class EmpresaDeportiva {

    private String nombre;
    private Collection<Atleta> listaAtletas;
    private Collection<Entrenador> listaEntrenadores;
    private Collection<Arbitro> listaArbitros;
    private Collection<Apoyo> listaApoyos;

    public EmpresaDeportiva(String nombre) {
        this.nombre = nombre;
        listaAtletas = new LinkedList<Atleta>();
        listaEntrenadores = new LinkedList<Entrenador>();
        listaArbitros = new LinkedList<Arbitro>();
        listaApoyos = new LinkedList<Apoyo>();

    }







    //Setters & Getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(Collection<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }

    public Collection<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }


    public void setListaEntrenadores(Collection<Entrenador> listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
    }

    public Collection<Arbitro> getListaArbitros() {
        return listaArbitros;
    }

    public void setListaArbitros(Collection<Arbitro> listaArbitros) {
        this.listaArbitros = listaArbitros;
    }

    public Collection<Apoyo> getListaApoyos() {
        return listaApoyos;
    }

    public void setListaApoyos(Collection<Apoyo> listaApoyos) {
        this.listaApoyos = listaApoyos;
    }

    
}
