package Vista;

import Controlador.Adopcion;
import Modelo.Perro;
import Modelo.Persona;
import Modelo.Tamanio;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    private Adopcion adopcion;
    private Scanner leer;
    private static final Vista view = new Vista();

    public Vista(){
        this.adopcion = new Adopcion();
        this.leer = new Scanner(System.in);
    }

    public static Vista getView(){
        return view;
    }

    public void iniciarRepositorio(){

        Persona p1 = new Persona("Lionel", "Messi", 32569874, 36);
        Persona p2 = new Persona("Rodrigo", "De Poul", 38326951, 28);
        Persona p3 = new Persona("Tini", "La triple T", 39529696, 27);

        Perro perro1 = new Perro("Coraje", "Caniche", 1, Tamanio.CHICO);
        Perro perro2 = new Perro("Thor", "Pitbul", 3, Tamanio.GRANDE);
        Perro perro3 = new Perro("Rolo", "Dalmata", 2, Tamanio.GRANDE);
        Perro perro4 = new Perro("Susy", "Coquer", 1, Tamanio.MEDIANO);

        adopcion.agregarPersona(p1);
        adopcion.agregarPersona(p2);
        adopcion.agregarPersona(p3);

        adopcion.agregarPerro(perro1);
        adopcion.agregarPerro(perro2);
        adopcion.agregarPerro(perro3);
        adopcion.agregarPerro(perro4);

    }
    public void iniciarAdopcion(){

        iniciarRepositorio();

            ArrayList<Persona> people = adopcion.retornarAdopcion();

            for (Persona persona: people) {

                System.out.println("Hola " + persona.getNombre());
                System.out.println("Por favor, ingrese el nombre del perro a adoptar");
                String nombre = leer.next();
                Perro perro = adopcion.buscarPerro(nombre);

                if (perro.getAdoptado()) {

                    System.out.println("Este perrito ya fue adoptado");
                    continue;

                } else {
                    persona.setPerros(perro);
                    perro.setAdoptado(true);
                    System.out.println("Muchas gracias por su adopcion *.*/ \n");
                    continue;
                }
            }

            mostrarAdopciones(people);
    }

    public void mostrarAdopciones(ArrayList<Persona> personas){

        for (Persona people: personas) {

            people.mostrarInformacion();

        }
    }
}
