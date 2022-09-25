import modelo.Juego;
import modelo.Jugador;
import modelo.Revolver;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> aux = new ArrayList<Jugador>();
        Revolver revolver = new Revolver();
        Juego juego = new Juego();
        revolver.llenarRevolver();
        System.out.println("Ingrese la cantidad de jugadores 1 ~ 6 ");
        int cantJugador = leer.nextInt();

        if(cantJugador >= 1 && cantJugador <= 6){

            for (int i = 0; i < cantJugador; i++) {

                Jugador jugador = new Jugador("Jugador");
                aux.add(jugador);

            }
        }else{

            System.out.println("Debe ingresar jugadores de entre 1 ~ 6");
        }

        juego.llenarJuego(revolver, aux);

        System.out.println(revolver);

        for (Jugador j: juego.getJugadores()) {

            System.out.println(j.getInformacion());

        }

        juego.Ronda();

    }
}