package Modelo;

import java.util.ArrayList;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private Tamanio tamanio;
    private boolean adoptado;
    private Perro perro;

    private ArrayList<Persona> personas;

    public Perro() {
    }

    public static Perro getPerro() {

        return new Perro();

    }

    public Perro(String nombre, String raza, int edad, Tamanio tamanio){

        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.personas = new ArrayList<>();
        this.adoptado = false;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
}
