package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class EventoDeportivo {
    private String nombre;
    private LocalDate fechaInicio;
    private String país;
    private String ciudad;
    private String deporte;
    private TipoEvento tipoEvento;
    private Collection<Participante> listaParticipantes;
    private Collection<Equipo> listaEquipos;


    public EventoDeportivo(String nombre, LocalDate fechaInicio, String país, String ciudad, String deporte,
            TipoEvento tipoEvento) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.país = país;
        this.ciudad = ciudad;
        this.deporte = deporte;
        this.tipoEvento = tipoEvento;
        listaParticipantes = new LinkedList<Participante>();
        listaEquipos = new LinkedList<Equipo>();
    }






//Setters & Getters
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public LocalDate getFechaInicio() {
        return fechaInicio;
    }


    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public String getPaís() {
        return país;
    }


    public void setPaís(String país) {
        this.país = país;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public String getDeporte() {
        return deporte;
    }


    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }


    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }


    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }


    public Collection<Participante> getListaParticipantes() {
        return listaParticipantes;
    }


    public void setListaParticipantes(Collection<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }


    public Collection<Equipo> getListaEquipos() {
        return listaEquipos;
    }


    public void setListaEquipos(Collection<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    


    
}
