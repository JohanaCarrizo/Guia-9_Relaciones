package Modelo;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private Tamanio tamanio;

    public Perro(String nombre, String raza, int edad, Tamanio tamanio){

        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;

    }

    public String getNombre(){
        return nombre;
    }

    public String getTamanio(){
        return tamanio.name();
    }
}
