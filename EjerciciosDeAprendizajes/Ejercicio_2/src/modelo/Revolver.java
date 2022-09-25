package modelo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {}

    public void llenarRevolver(){

        this.posicionActual = getPosicionAleatorio(6, 1);
        this.posicionAgua = getPosicionAleatorio(6, 1);
    }

    public boolean mojar(){

        return posicionAgua==posicionActual;
    }

    public void siguienteChorro(){

        posicionActual += 1;
        if(posicionActual > 6){

            posicionActual = posicionActual-6;

        }
    }

    public void tambor(){
        System.out.println("Posicion actual: "+posicionActual+" y Posicion del agua: "+posicionAgua);
    }

    public static int getPosicionAleatorio(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    @Override
    public String toString() {
        return "Revolver --> Posicion Actual: "+posicionActual+", Posicion del agua: "+posicionAgua;
    }


}
