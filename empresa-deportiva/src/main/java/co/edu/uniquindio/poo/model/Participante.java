package co.edu.uniquindio.poo.model;

public class Participante {

    private int edad;
    private String paisRepresentacion;
    private Persona persona;


    
    public Participante(int edad, String paisRepresentacion, Persona persona) {
        this.edad = edad;
        this.paisRepresentacion = paisRepresentacion;
        this.persona = persona;
    }




    //Setters & Getters
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPaisRepresentacion() {
        return paisRepresentacion;
    }
    public void setPaisRepresentacion(String paisRepresentacion) {
        this.paisRepresentacion = paisRepresentacion;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    

    
}
