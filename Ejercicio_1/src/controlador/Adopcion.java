package controlador;

import Modelo.Perro;
import Modelo.Persona;

import java.util.ArrayList;

public class Adopcion {

    private ArrayList<Persona> adopciones;
    public Adopcion(){
        this.adopciones = new ArrayList<>();
    }

    public void guardarAdopcion(Persona persona){

        adopciones.add(persona);
    }

    public void mostrarInformacion(){

        for (Persona p: adopciones) {

            System.out.println(p.getNombre()+" adoptó a "+p.getPerro().getNombre()+" un perro de tamaño "+p.getPerro().getTamanio());

        }
    }

}
