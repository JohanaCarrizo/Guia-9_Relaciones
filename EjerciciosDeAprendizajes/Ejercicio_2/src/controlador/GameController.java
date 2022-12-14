package controlador;

import modelo.Juego;
import modelo.Jugador;
import modelo.Revolver;

import java.util.ArrayList;

public class GameController {

    Juego juego = new Juego();
    Revolver revolver = new Revolver();
    ArrayList<Jugador> aux = new ArrayList<Jugador>();

    public void iniciarJuego(){}

    public boolean evaluarCantDeJugadores(int cantJugadores){

        return cantJugadores < 0 || cantJugadores > 6;
    }

    public void crearJugadores(String nombre){

        aux.add(Jugador.crearJugadores(nombre));

    }

    public void llenarRevolver(){

        revolver.llenarRevolver();
    }

    public void llenarJuego(){

        juego.llenarJuego(revolver, aux);
    }

    public void ronda(){

        juego.Ronda();
    }

    public void visualizarTambor(){

        System.out.println(revolver);
    }
}
