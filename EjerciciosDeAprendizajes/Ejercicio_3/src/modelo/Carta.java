package modelo;

public class Carta {

    private int numero;
    private Palo tipoPalo;

    public Carta(int numero, Palo palo){

        this.numero = numero;
        this.tipoPalo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getTipoPalo() {
        return tipoPalo;
    }

    public void setTipoPalo(Palo tipoPalo) {
        this.tipoPalo = tipoPalo;
    }

    public void mostrarInformacion(){

        System.out.println("*****************");
        System.out.print(numero +" DE "+tipoPalo+"\n");
        System.out.println("*****************");
    }
}
