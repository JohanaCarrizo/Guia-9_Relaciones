package vista;

import Modelo.Perro;
import Modelo.Persona;
import Modelo.Tamanio;
import controlador.Adopcion;

public class Vista {

    private Adopcion adopcion;
    private static final Vista view = new Vista();
    public Vista(){

        this.adopcion = new Adopcion();
    }

    public static Vista getVista(){
        return view;
    }

    public void iniciar(){

        adopcion.guardarAdopcion(new Persona(38119654, "Cintia", "Aguirre", 30,
                new Perro("Thor", "Pitbul", 1, Tamanio.GRANDE)));

        adopcion.guardarAdopcion(new Persona(40188954, "Alejo", "Tejada", 34,
                new Perro("Pulga", "Terry", 2, Tamanio.PEQUENIO)));

    }

    public void mostrarAdopcion(){

        adopcion.mostrarInformacion();
    }
}
