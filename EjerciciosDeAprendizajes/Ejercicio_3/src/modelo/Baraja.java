package modelo;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> cartasDisponibles;
    private ArrayList<Carta> cartasMonton;

    public Baraja(){

        this.cartasDisponibles = new ArrayList<>();
        this.cartasMonton = new ArrayList<>();
    }

    public void agregarCartaDisponible(Carta carta){

        cartasDisponibles.add(carta);
    }

    public void agregarCartaMonton(Carta carta){

        cartasMonton.add(carta);
    }



    public ArrayList<Carta> getCartasMonton() {
        return cartasMonton;
    }

    public void setCartasMonton(ArrayList<Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }

    public ArrayList<Carta> getCartasDisponibles() {
        return cartasDisponibles;
    }

    public void setCartasDisponibles(ArrayList<Carta> cartasDisponibles) {
        this.cartasDisponibles = cartasDisponibles;
    }
}
