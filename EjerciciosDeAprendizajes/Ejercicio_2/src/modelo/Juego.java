package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;


    public Juego() {}

    public void llenarJuego(Revolver revolver, ArrayList<Jugador> jugadores){

        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public void Ronda(){

        boolean bandera = true;

        while(bandera) {

            for (Jugador jugador : jugadores) {

                if (jugador.disparar(revolver)) {

                    System.out.print("\nFin del juego. Jugador mojado --> " + jugador.getInformacion());
                    bandera = false;
                    return;

                } else {

                    System.out.println("\nJugador a salvo. Siguiente...\n");

                }
            }
        }

    }

    public void agregarJugador(Jugador jugador){

        jugadores.add(jugador);

    }
    public ArrayList<Jugador> getJugadores(){

        return jugadores;
    }
}

