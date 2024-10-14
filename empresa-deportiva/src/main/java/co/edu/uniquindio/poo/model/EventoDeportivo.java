package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class EventoDeportivo {
    private String nombre;
    private LocalDate fechaInicio;
    private String país;
    private String ciudad;
    private String deporte;
    private TipoEvento tipoEvento;
    private LinkedList<Participante> listaParticipantes;
    private LinkedList<Equipo> listaEquipos;

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

    // CRUD Participante

    /**
     * Añade un participante a la lista de participantes
     * @param participante Participante a añadir
     * @return true si se añadió correctamente
     * @throws IllegalArgumentException si el participante es nulo
     */
    public boolean añadirParticipante(Participante participante) {
        if (participante == null) {
            throw new IllegalArgumentException("No se puede agregar un participante nulo");
        }
        return listaParticipantes.add(participante); 
    }

    /**
     * Elimina un participante de la lista de participantes
     * @param participante Participante a eliminar
     * @return true si se eliminó correctamente, false si no estaba en la lista
     * @throws IllegalArgumentException si el participante es nulo
     */
    public boolean eliminarParticipante(Participante participante) {
        if (participante == null) {
            throw new IllegalArgumentException("No se puede eliminar un participante nulo");
        }
        return listaParticipantes.remove(participante); 
    }

    /**
     * Busca un participante en la lista
     * @param participante Participante a buscar
     * @return El participante encontrado o null si no está en la lista
     * @throws IllegalArgumentException si el participante es nulo
     */
    public Participante buscarParticipante(Participante participante) {
        if (participante == null) {
            throw new IllegalArgumentException("No se puede buscar un participante nulo");
        }
        return listaParticipantes.stream()
                .filter(participanteAux -> participanteAux.equals(participante))
                .findFirst()
                .orElse(null);
    }

    /**
     * Edita un participante en la lista
     * @param participante      Participante existente a editar
     * @param nuevoParticipante Nuevos datos del participante
     * @return true si la edición fue exitosa, false si el participante original no
     *         fue encontrado
     * @throws IllegalArgumentException si alguno de los participantes es nulo
     */
    public boolean editarParticipante(Participante participante, Participante nuevoParticipante) {
        if (participante == null || nuevoParticipante == null) {
            throw new IllegalArgumentException("No se pueden aceptar participantes nulos");
        }

        boolean eliminado = eliminarParticipante(participante);

        if (eliminado) {
            añadirParticipante(nuevoParticipante);
            return true;
        }

        return false;
    }

    // CRUD Equipo

    /**
     * Añade un equipo a la lista de equipos
     * @param equipo Equipo a añadir
     * @return true si se añadió correctamente
     * @throws IllegalArgumentException si el equipo es nulo
     */
    public boolean añadirEquipo(Equipo equipo) {
        if (equipo == null) {
            throw new IllegalArgumentException("No se puede agregar un equipo nulo");
        }
        return listaEquipos.add(equipo);
    }

    /**
     * Elimina un equipo de la lista de equipos
     * @param equipo Equipo a eliminar
     * @return true si se eliminó correctamente, false si no estaba en la lista
     * @throws IllegalArgumentException si el equipo es nulo
     */
    public boolean eliminarEquipo(Equipo equipo) {
        if (equipo == null) {
            throw new IllegalArgumentException("No se puede eliminar un equipo nulo");
        }
        return listaEquipos.remove(equipo); 
    }

    /**
     * Busca un equipo en la lista
     * @param equipo Equipo a buscar
     * @return El equipo encontrado o null si no está en la lista
     * @throws IllegalArgumentException si el equipo es nulo
     */
    public Equipo buscarEquipo(Equipo equipo) {
        if (equipo == null) {
            throw new IllegalArgumentException("No se puede buscar un equipo nulo");
        }
        return listaEquipos.stream()
                .filter(equipoAux -> equipoAux.equals(equipo))
                .findFirst()
                .orElse(null);
    }

    /**
     * Edita un equipo en la lista
     * @param equipo      Equipo existente a editar
     * @param nuevoEquipo Nuevos datos del equipo
     * @return true si la edición fue exitosa, false si el equipo original no fue
     *         encontrado
     * @throws IllegalArgumentException si alguno de los equipos es nulo
     */
    public boolean editarEquipo(Equipo equipo, Equipo nuevoEquipo) {
        if (equipo == null || nuevoEquipo == null) {
            throw new IllegalArgumentException("No se pueden aceptar equipos nulos");
        }


        boolean eliminado = eliminarEquipo(equipo);

  
        if (eliminado) {
            añadirEquipo(nuevoEquipo);
            return true;
        }


        return false;
    }

    // ................................

    // Setters & Getters
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

    public LinkedList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(LinkedList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public LinkedList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(LinkedList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

}
