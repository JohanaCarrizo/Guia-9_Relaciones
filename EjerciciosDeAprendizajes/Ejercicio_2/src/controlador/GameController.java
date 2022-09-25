package controlador;

import modelo.Juego;
import modelo.Jugador;
import modelo.Revolver;

import java.util.ArrayList;

public class GameController {

    Juego juego = new Juego();

    Revolver revolver = new Revolver();
    ArrayList<Jugador> aux = new ArrayList<Jugador>();

    public void iniciarJuego(){

    }

    public boolean evaluarCantDeJugadores(int cantJugadores){

        return cantJugadores < 0 || cantJugadores > 6;
    }

    public void crearJugadores(int cantJugadores){

        for (int i = 0; i < cantJugadores; i++) {

            juego.agregarJugador(new Jugador("Jugador"));

        }
    }

}
