package co.edu.uniquindio.poo.model;

import java.util.LinkedList;
import java.util.stream.Collectors;


public class EmpresaDeportiva {

    private String nombre;
    private LinkedList<Atleta> listaAtletas;
    private LinkedList<Entrenador> listaEntrenadores;
    private LinkedList<Arbitro> listaArbitros;
    private LinkedList<Apoyo> listaApoyos;
    private LinkedList<EventoDeportivo> listaEventosDeportivos;

    public EmpresaDeportiva(String nombre) {
        this.nombre = nombre;
        listaAtletas = new LinkedList<Atleta>();
        listaEntrenadores = new LinkedList<Entrenador>();
        listaArbitros = new LinkedList<Arbitro>();
        listaApoyos = new LinkedList<Apoyo>();
        listaEventosDeportivos = new LinkedList<EventoDeportivo>();

    }

    // CRUD Apoyo ---------------------------

    /**
     * Añade una persona de apoyo
     * 
     * @param apoyo
     * @return
     */
    public boolean añadirApoyo(Apoyo apoyo) {
        if (apoyo == null) {
            throw new IllegalArgumentException("No se puede agregar un elemento nulo");
        }

        listaApoyos.add(apoyo);
        return true;
    }

    /**
     * Elimina una persona de apoyo
     * 
     * @param apoyo
     * @return
     */
    public boolean eliminarApoyo(Apoyo apoyo) {
        if (apoyo == null) {
            throw new IllegalArgumentException("No se puede eliminar un elemento nulo");
        }
        if (!listaApoyos.contains(apoyo)) {
            return false;
        }

        listaApoyos.remove(apoyo);
        return true;
    }

    /**
     * Busca una persona de apoyo
     * 
     * @param apoyo
     * @return
     */
    public Apoyo buscarApoyo(Apoyo apoyo) {
        if (apoyo == null) {
            throw new IllegalArgumentException("No se puede buscar un elemento nulo");
        }
        return listaApoyos.stream().filter(apoyoaux -> apoyoaux.equals(apoyo)).findFirst().orElse(null);
    }

    /**
     * Edita una persona de apoyo
     * 
     * @param apoyo
     * @param nuevoApoyo
     * @return
     */
    public boolean editarApoyo(Apoyo apoyo, Apoyo nuevoApoyo) {
        if (apoyo == null || nuevoApoyo == null) {
            throw new IllegalArgumentException("No se aceptan elementos nulos");
        }
        boolean criterio = eliminarApoyo(apoyo);
        if (criterio) {
            añadirApoyo(nuevoApoyo);
            return true;
        }
        return false;
    }

    // CRUD Entrenador ----------------------

    /**
     * Añade una persona de entrenador
     * 
     * @param entrenador
     * @return
     */
    public boolean añadirEntrenador(Entrenador entrenador) {
        if (entrenador == null) {
            throw new IllegalArgumentException("No se puede agregar un elemento nulo");
        }

        listaEntrenadores.add(entrenador);
        return true;
    }

    /**
     * Elimina una persona de entrenador
     * 
     * @param entrenador
     * @return
     */
    public boolean eliminarEntrenador(Entrenador entrenador) {
        if (entrenador == null) {
            throw new IllegalArgumentException("No se puede eliminar un elemento nulo");
        }
        if (!listaEntrenadores.contains(entrenador)) {
            return false;
        }

        listaEntrenadores.remove(entrenador);
        return true;
    }

    /**
     * Busca una persona de entrenador
     * 
     * @param entrenador
     * @return
     */
    public Entrenador buscarEntrenador(Entrenador entrenador) {
        if (entrenador == null) {
            throw new IllegalArgumentException("No se puede buscar un elemento nulo");
        }
        return listaEntrenadores.stream().filter(entrenadoraux -> entrenadoraux.equals(entrenador)).findFirst()
                .orElse(null);
    }

    /**
     * Edita una persona de entrenador
     * 
     * @param entrenador
     * @param nuevoEntrenador
     * @return
     */
    public boolean editarEntrenador(Entrenador entrenador, Entrenador nuevoEntrenador) {
        if (entrenador == null || nuevoEntrenador == null) {
            throw new IllegalArgumentException("No se aceptan elementos nulos");
        }
        boolean criterio = eliminarEntrenador(entrenador);
        if (criterio) {
            añadirEntrenador(nuevoEntrenador);
            return true;
        }
        return false;
    }

    // CRUD Atleta --------------------------

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

    /**
     * Busca una persona de atleta
     * 
     * @param atleta
     * @return
     */
    public Atleta buscarAtleta(Atleta atleta) {
        if (atleta == null) {
            throw new IllegalArgumentException("No se puede buscar un elemento nulo");
        }
        return listaAtletas.stream().filter(atletaaux -> atletaaux.equals(atleta)).findFirst().orElse(null);
    }

    /**
     * Edita una persona de atleta
     * 
     * @param atleta
     * @param nuevoAtleta
     * @return
     */
    public boolean editarAtleta(Atleta atleta, Atleta nuevoAtleta) {
        if (atleta == null || nuevoAtleta == null) {
            throw new IllegalArgumentException("No se aceptan elementos nulos");
        }
        boolean criterio = eliminarAtleta(atleta);
        if (criterio) {
            añadirAtleta(nuevoAtleta);
            return true;
        }
        return false;
    }

    // CRUD Arbitro -------------------------

    /**
     * Añade una persona de arbitro
     * 
     * @param arbitro
     * @return
     */
    public boolean añadirArbitro(Arbitro arbitro) {
        if (arbitro == null) {
            throw new IllegalArgumentException("No se puede agregar un elemento nulo");
        }

        listaArbitros.add(arbitro);
        return true;
    }

    /**
     * Elimina una persona de arbitro
     * 
     * @param arbitro
     * @return
     */
    public boolean eliminarArbitro(Arbitro arbitro) {
        if (arbitro == null) {
            throw new IllegalArgumentException("No se puede eliminar un elemento nulo");
        }
        if (!listaArbitros.contains(arbitro)) {
            return false;
        }

        listaArbitros.remove(arbitro);
        return true;
    }

    /**
     * Busca una persona de arbitro
     * 
     * @param arbitro
     * @return
     */
    public Arbitro buscarArbitro(Arbitro arbitro) {
        if (arbitro == null) {
            throw new IllegalArgumentException("No se puede buscar un elemento nulo");
        }
        return listaArbitros.stream().filter(arbitroaux -> arbitroaux.equals(arbitro)).findFirst().orElse(null);
    }

    /**
     * Edita una persona de arbitro
     * 
     * @param arbitro
     * @param nuevoArbitro
     * @return
     */
    public boolean editarArbitro(Arbitro arbitro, Arbitro nuevoArbitro) {
        if (arbitro == null || nuevoArbitro == null) {
            throw new IllegalArgumentException("No se aceptan elementos nulos");
        }
        boolean criterio = eliminarArbitro(arbitro);
        if (criterio) {
            añadirArbitro(nuevoArbitro);
            return true;
        }
        return false;
    }

    // CRUD EventoDeportivo -----------------

    /**
     * Añade un evento deportivo a la lista de eventos
     * 
     * @param evento Evento deportivo a añadir
     * @return true si se añadió correctamente
     * @throws IllegalArgumentException si el evento es nulo
     */
    public boolean añadirEventoDeportivo(EventoDeportivo evento) {
        if (evento == null) {
            throw new IllegalArgumentException("No se puede agregar un evento deportivo nulo");
        }
        return listaEventosDeportivos.add(evento); 
    }

    /**
     * Elimina un evento deportivo de la lista
     * 
     * @param evento Evento deportivo a eliminar
     * @return true si se eliminó correctamente, false si no estaba en la lista
     * @throws IllegalArgumentException si el evento es nulo
     */
    public boolean eliminarEventoDeportivo(EventoDeportivo evento) {
        if (evento == null) {
            throw new IllegalArgumentException("No se puede eliminar un evento deportivo nulo");
        }
        return listaEventosDeportivos.remove(evento); 
    }

    /**
     * Busca un evento deportivo en la lista
     * 
     * @param evento Evento deportivo a buscar
     * @return El evento encontrado o null si no está en la lista
     * @throws IllegalArgumentException si el evento es nulo
     */
    public EventoDeportivo buscarEventoDeportivo(EventoDeportivo evento) {
        if (evento == null) {
            throw new IllegalArgumentException("No se puede buscar un evento deportivo nulo");
        }
        return listaEventosDeportivos.stream()
                .filter(eventoAux -> eventoAux.equals(evento))
                .findFirst()
                .orElse(null);
    }

    /**
     * Edita un evento deportivo en la lista
     * 
     * @param evento      Evento deportivo existente a editar
     * @param nuevoEvento Nuevos datos del evento deportivo
     * @return true si la edición fue exitosa, false si el evento original no fue
     *         encontrado
     * @throws IllegalArgumentException si alguno de los eventos es nulo
     */
    public boolean editarEventoDeportivo(EventoDeportivo evento, EventoDeportivo nuevoEvento) {
        if (evento == null || nuevoEvento == null) {
            throw new IllegalArgumentException("No se pueden aceptar eventos nulos");
        }

        boolean eliminado = eliminarEventoDeportivo(evento);

        if (eliminado) {
            añadirEventoDeportivo(nuevoEvento);
            return true;
        }

        return false;
    }

    // Otros metodos

    public LinkedList<Atleta> atletasEventoNatacion(){
        LinkedList<Atleta> lista= listaEventosDeportivos.stream().filter(eventoaux -> eventoaux.getTipoEvento().equals(TipoEvento.COMPETICION) && eventoaux.getDeporte().equals("natación")).collect(Collectors.toList()).stream().flatMap(evento -> evento.getListaEquipos().stream()).flatMap(equipo -> equipo.getListaAtletas().stream()).collect(Collectors.toCollection(LinkedList::new));


        return lista;
    }

    // Setters & Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(LinkedList<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }

    public LinkedList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    public void setListaEntrenadores(LinkedList<Entrenador> listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
    }

    public LinkedList<Arbitro> getListaArbitros() {
        return listaArbitros;
    }

    public void setListaArbitros(LinkedList<Arbitro> listaArbitros) {
        this.listaArbitros = listaArbitros;
    }

    public LinkedList<Apoyo> getListaApoyos() {
        return listaApoyos;
    }

    public void setListaApoyos(LinkedList<Apoyo> listaApoyos) {
        this.listaApoyos = listaApoyos;
    }

    public LinkedList<EventoDeportivo> getListaEventosDeportivos() {
        return listaEventosDeportivos;
    }

    public void setListaEventosDeportivos(LinkedList<EventoDeportivo> listaEventosDeportivos) {
        this.listaEventosDeportivos = listaEventosDeportivos;
    }

}
