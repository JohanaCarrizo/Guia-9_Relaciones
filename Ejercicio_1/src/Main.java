import vista.Vista;

public class Main {
    public static void main(String[] args) {

        Vista view = Vista.getVista();
        view.iniciar();
        view.mostrarAdopcion();

    }
}