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

    public static View getView(){

        return view;
    }

    public void iniciarJuego(){

        System.out.println("Ingrese la cantidad de jugadores: 1 ~ 6 ");
        int cantJugador = leer.nextInt();

        if(gc.evaluarCantDeJugadores(cantJugador)){

            System.out.println("Cantidad de jugadores por defecto (6)");
            pedirNombres(6);

        }else{

            pedirNombres(cantJugador);
        }

        gc.llenarJuego();
        gc.llenarRevolver();
        System.out.println("******************************************************");
        gc.visualizarTambor();
        System.out.println("******************************************************");
        gc.ronda();
    }

    public void pedirNombres(int cantJugador){

        for (int i = 0; i < cantJugador; i++) {

            System.out.print("Ingrese el nombre del jugador "+(i+1)+" --> ");
            String nombre = leer.next();
            gc.crearJugadores(nombre);

        }
    }

}
