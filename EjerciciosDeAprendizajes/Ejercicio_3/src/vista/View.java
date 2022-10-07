package vista;

import controlador.DeckController;

import java.util.Scanner;

public class View {

    private Scanner leer;
    private DeckController bc;
    private static final View view = new View();

    public View(){
        this.leer = new Scanner(System.in);
        this.bc = new DeckController();
    }

    public static View getView(){
        return view;
    }

    public void run(){

        bc.crearCartas();
        boolean flag = true;

        do{

            menu();
            int opcion = leer.nextInt();

            switch (opcion){

                case 1:
                    barajar();
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarBarja();
                    break;
                case 7:
                    flag = false;
                    break;

            }

        }while(flag);
    }

    public void menu(){

            System.out.println("\n*********CARTAS ESPAÑOLAS********");
            System.out.println("1) Barajar");
            System.out.println("2) Siguiente carta");
            System.out.println("3) Cartas disponibles");
            System.out.println("4) Dar cartas");
            System.out.println("5) Cartas monton");
            System.out.println("6) Mostrar baraja");
            System.out.println("7) Salir");
            System.out.print("Seleccione la operacion a realizar: 1 ~ 7 >> ");
            System.out.println("");

    }

    public void barajar(){

        System.out.println("\n/////////MAZO DE CARTAS MEZCLADAS.../////////\n");
        bc.barajar();
    }

    public void siguienteCarta(){

        System.out.println("/////////DAR LA SIGUIENTE CARTA/////////\n");

        if(bc.siguienteCarta() != null){

            System.out.println("/////////AUN HAY CARTAS EN EL MAZO, TOMA.../////////\n");
            bc.siguienteCarta().mostrarInformacion();
            System.out.println("\n");

        }else{
            System.out.println("/////////YA NO HAY MAS CARTAS EN EL MAZO/////////");
        }
    }

    public void cartasDisponibles(){

        System.out.print("\nCANTIDAD DE CARTAS DISPONIBLES EN EL MAZO --> "+bc.cartasDisponibles()+"\n");

    }

    public void darCartas(){

        System.out.println("Ingrese la cantidad de cartas que quiere: ");
        int cantidad = leer.nextInt();
        if(bc.darCartas(cantidad).size() > 0){

            System.out.println("/////////TOME SUS "+cantidad+" CARTAS/////////");

        }else{

            System.out.println("/////////LA CANTIDAD QUE QUIERES NO ALCANZA/////////");
        }
    }

    public void cartasMonton(){

        bc.cartasMonton();
        System.out.println("");
    }

    public void mostrarBarja(){

        bc.mostrarBaraja();
    }
}
