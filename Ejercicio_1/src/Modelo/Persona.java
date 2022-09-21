package Modelo;

import Modelo.Perro;

public class Persona {

    private Integer dni;
    private String nombre;
    private String apellido;
    private int edad;
    private Perro perro;

    public Persona(Integer dni, String nombre, String apellido, int edad, Perro perro){

        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.perro = perro;
    }

    public String getNombre(){
        return nombre;
    }

    public Perro getPerro(){
        return perro;
    }

}
