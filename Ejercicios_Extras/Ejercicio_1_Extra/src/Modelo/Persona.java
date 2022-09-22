package Modelo;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellido;
    private Integer dni;
    private int edad;
    private Perro perro;

    public Persona(String nombre, String apellido, Integer dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerros() {
        return perro;
    }

    public void setPerros(Perro perro) {
        this.perro = perro;
    }

    public void mostrarInformacion(){

        System.out.println(nombre+" adoptó a "+ perro.getNombre());
    }
}
