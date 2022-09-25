package modelo;

public class Jugador {

    private int id;

    private static int contador = 1;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.id = contador++;
        this.nombre = nombre;
        this.mojado = false;
    }

    public String getInformacion(){

         return nombre+" "+id;
    }

    public static Jugador crearJugadores(){

        return new Jugador("Jugador");
    }

    public boolean disparar(Revolver revolver) {

    if(revolver.mojar()){

            this.mojado = true;
            return true;
        }else{

            revolver.siguienteChorro();
            return false;
        }
    }
}
