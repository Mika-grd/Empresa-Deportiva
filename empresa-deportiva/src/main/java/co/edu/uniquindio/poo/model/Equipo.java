package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Equipo {

    private String nombre;
    private String paisOrigen;
    private LinkedList<Atleta> listaAtletas;


    public Equipo(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        listaAtletas = new LinkedList<Atleta>();
    }

 /**
     * Añade una persona de atleta
     * 
     * @param atleta
     * @return
     */
    public boolean añadirAtleta(Atleta atleta) {
        if (atleta == null) {
            throw new IllegalArgumentException("No se puede agregar un elemento nulo");
        }

        listaAtletas.add(atleta);
        return true;
    }

    /**
     * Elimina una persona de atleta
     * 
     * @param atleta
     * @return
     */
    public boolean eliminarAtleta(Atleta atleta) {
        if (atleta == null) {
            throw new IllegalArgumentException("No se puede eliminar un elemento nulo");
        }
        if (!listaAtletas.contains(atleta)) {
            return false;
        }

        listaAtletas.remove(atleta);
        return true;
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

    public LinkedList<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(LinkedList<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }



    }



