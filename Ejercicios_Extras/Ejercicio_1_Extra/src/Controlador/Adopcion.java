package Controlador;

import Modelo.Perro;
import Modelo.Persona;
import Modelo.Tamanio;

import java.util.ArrayList;

public class Adopcion {

    private ArrayList<Perro> perros = new ArrayList<>();
    private ArrayList<Persona> personas = new ArrayList<>();



    public void agregarPersona(Persona p){

        personas.add(p);
    }

    public void agregarPerro(Perro p){

        perros.add(p);
    }
    public ArrayList<Persona> retornarAdopcion(){

        return personas;
    }

    public Perro buscarPerro(String nombre){

        for (Perro p: perros ) {

            if(p.getNombre().equalsIgnoreCase(nombre)){

                return p;
            }

        }
        return null;
    }

    public int getListaPerro(){
        return perros.size();
    }
}
