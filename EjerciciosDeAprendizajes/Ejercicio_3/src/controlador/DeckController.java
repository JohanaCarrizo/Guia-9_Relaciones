package controlador;

import modelo.Baraja;
import modelo.Carta;
import modelo.Palo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class DeckController {
    Baraja deck = new Baraja();

    public void crearCartas(){

        for (int j = 1; j <= 12; j++) {

            if(j != 8 && j != 9) {
                deck.agregarCartaDisponible(new Carta(j, Palo.ORO));
                deck.agregarCartaDisponible(new Carta(j, Palo.BASTO));
                deck.agregarCartaDisponible(new Carta(j, Palo.COPA));
                deck.agregarCartaDisponible(new Carta(j, Palo.ESPADA));

            }
        }
    }


    /*
    // Cambia de posición todas las cartas aleatoriamente.
     */
    public void barajar(){

        Collections.shuffle(deck.getCartasDisponibles());
    }

    /*
    //Devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas
     */
    public Carta siguienteCarta(){

        if(deck.getCartasDisponibles().size() > 0) {

            Carta cart = deck.getCartasDisponibles().get(deck.getCartasDisponibles().size()-1);
            deck.agregarCartaMonton(cart);
            Iterator it = deck.getCartasDisponibles().iterator();

            while (it.hasNext()){
                if(cart == it.next()){

                    it.remove();
                }
            }
            //deck.getCartasDisponibles().remove(deck.getCartasDisponibles().size()-1);
            return cart;

        }else{
            return null;
        }
    }

    /*
    // indica el número de cartas que aún se puede repartir
     */
    public int cartasDisponibles(){

        return deck.getCartasDisponibles().size();
    }

    /*
    //Dado un número de cartas que nos pidan, le devolveremos ese número de
    //cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    //debemos indicárselo al usuario.
     */
    public ArrayList<Carta> darCartas(int cantidad){

        ArrayList<Carta> cartasElegidas = new ArrayList<>();
        if(deck.getCartasDisponibles().size() > cantidad){

            for (int i = 0; i < cantidad; i++) {

                Carta carta = siguienteCarta();
                cartasElegidas.add(carta);
            }
            return cartasElegidas;
        }else{

            return cartasElegidas;
        }
    }

    /*
    //mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    //indicárselo al usuario
     */
    public void cartasMonton(){

        for (Carta carta: deck.getCartasMonton()) {

            carta.mostrarInformacion();
        }
    }

    /*
    //muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    //luego se llama al método, este no mostrara esa primera carta
     */
    public void mostrarBaraja(){

        for (Carta carta: deck.getCartasDisponibles()) {

            carta.mostrarInformacion();
        }
    }
}
