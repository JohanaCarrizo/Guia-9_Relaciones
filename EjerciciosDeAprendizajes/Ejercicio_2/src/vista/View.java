package vista;

import controlador.GameController;

import java.util.Scanner;

public class View {

    private Scanner leer;
    private GameController gc;
    private static final View view = new View();

    public View(){

        this.leer = new Scanner(System.in);
        this.gc = new GameController();
    }

    public View getView(){

        return view;
    }

    public void iniciarJuego(){

        System.out.println("Ingrese la cantidad de jugadores: 1 ~ 6 ");
        int cantJugador = leer.nextInt();

        if(gc.evaluarCantDeJugadores(cantJugador)){

            System.out.println("Cantidad de jugadores por defecto (6)");
            gc.crearJugadores(6);
        }else{

            gc.crearJugadores(cantJugador);
        }


    }

}
