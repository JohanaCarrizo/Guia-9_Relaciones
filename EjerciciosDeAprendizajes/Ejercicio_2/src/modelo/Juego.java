package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {}

    public void llenarJuego(Revolver revolver, ArrayList<Jugador> jugadores){

        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public void Ronda(){

        int intento= 1;
        boolean bandera = true;

        while(bandera) {

            for (Jugador jugador : jugadores) {

                if (jugador.disparar(revolver)) {

                    System.out.print("Fin del juego. Jugador mojado --> " + jugador.getInformacion());
                    bandera = false;
                    return;

                } else {

                    System.out.println("Jugador a salvo. Siguiente...");
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
