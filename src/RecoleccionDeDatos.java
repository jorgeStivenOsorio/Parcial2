import java.util.InputMismatchException;
import java.util.Scanner;

public class RecoleccionDeDatos extends Menu {
    Scanner sc = new Scanner(System.in);
    Garaje garaje = new Garaje();
    int opcion;
    int opcion2;
    Color color;
    String referencia;
    int velMaxima;


    public void Menu() {
        boolean salir = true;

        do {
            try {
                ShowMenuPrincipal();
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        boolean salir_2 = true;
                        do {
                            try {

                                boolean estado = garaje.EstadoDelGarage();
                                if (estado == true) {
                                    ShowMenuVehiculos();
                                    opcion2 = sc.nextInt();
                                    sc.nextLine();
                                    switch (opcion2) {
                                        case 1:
                                            System.out.println("Ingrese la referencia del avion: ");
                                            referencia = sc.nextLine();
                                            System.out.println("Ingrese velocidad maxima en Km/h: ");
                                            velMaxima = sc.nextInt();
                                            System.out.println("Ingrese altitud");
                                            int altitud = sc.nextInt();
                                            color = OpcionDeColores();
                                            garaje.AgregarAvion(referencia, velMaxima, altitud, color);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese referencia: ");
                                            referencia = sc.nextLine();
                                            System.out.println("Ingrese velocidad maxima en Km/h: ");
                                            velMaxima = sc.nextInt();
                                            System.out.println("Ingrese el peso maximo en Kg: ");
                                            int pesoMaximo = sc.nextInt();
                                            color = OpcionDeColores();
                                            garaje.AgregarYate(referencia, velMaxima, pesoMaximo, color);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese referencia: ");
                                            referencia = sc.nextLine();
                                            System.out.println("Ingrese velocidad maxima en Km/h: ");
                                            velMaxima = sc.nextInt();
                                            System.out.println("Ingrese numero de puertas: ");
                                            int numPuertas = sc.nextInt();
                                            OpcionDeColores();
                                            garaje.AgregarCarro(referencia, velMaxima, numPuertas, color);
                                            break;
                                        case 4:
                                            salir_2 = false;
                                            break;
                                    }

                                }

                            } catch (InputMismatchException ex) {
                                sc.nextLine();
                                System.out.println("¡El dato ingresado es invalido!");
                            }

                        } while (salir_2);
                        break;
                    case 2:
                        garaje.ShowGarage();
                        break;
                    case 3:
                        salir = false;
                        System.out.println("´´´´´´´´´´´´´´´´´´´´´´¶¶¶¶¶¶¶¶¶\n" +
                                "´´´´´´´´´´´´´´´´´´´´¶¶´´´´´´´´´´¶¶\n" +
                                "´´´´´´¶¶¶¶¶´´´´´´´¶¶´´´´´´´´´´´´´´¶¶\n" +
                                "´´´´´¶´´´´´¶´´´´¶¶´´´´´¶¶´´´´¶¶´´´´´¶¶\n" +
                                "´´´´´¶´´´´´¶´´´¶¶´´´´´´¶¶´´´´¶¶´´´´´´´¶¶\n" +
                                "´´´´´¶´´´´¶´´¶¶´´´´´´´´¶¶´´´´¶¶´´´´´´´´¶¶\n" +
                                "´´´´´´¶´´´¶´´´¶´´´´´´´´´´´´´´´´´´´´´´´´´¶¶\n" +
                                "´´´´¶¶¶¶¶¶¶¶¶¶¶¶´´´´´´´´´´´´´´´´´´´´´´´´¶¶\n" +
                                "´´´¶´´´´´´´´´´´´¶´¶¶´´´´´´´´´´´´´¶¶´´´´´¶¶\n" +
                                "´´¶¶´´´´´´´´´´´´¶´´¶¶´´´´´´´´´´´´¶¶´´´´´¶¶\n" +
                                "´¶¶´´´¶¶¶¶¶¶¶¶¶¶¶´´´´¶¶´´´´´´´´¶¶´´´´´´´¶¶\n" +
                                "´¶´´´´´´´´´´´´´´´¶´´´´´¶¶¶¶¶¶¶´´´´´´´´´¶¶\n" +
                                "´¶¶´´´´´´´´´´´´´´¶´´´´´´´´´´´´´´´´´´´´¶¶\n" +
                                "´´¶´´´¶¶¶¶¶¶¶¶¶¶¶¶´´´´´´´´´´´´´´´´´´´¶¶\n" +
                                "´´¶¶´´´´´´´´´´´¶´´¶¶´´´´´´´´´´´´´´´´¶¶\n" +
                                "´´´¶¶¶¶¶¶¶¶¶¶¶¶´´´´´¶¶´´´´´´´´´´´´¶¶\n" +
                                "´´´´´´´´´´´´´´´´´´´´´´´¶¶¶¶¶¶¶¶¶¶¶\n");
                }

            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("¡El caracter ingresado no es valido!");

            }

        } while (salir);


    }

    public Color OpcionDeColores() {
        boolean salir = true;
        do {
            try {
                System.out.println("Seleccione el color: \n" +
                        "1) NEGRO\n" +
                        "2) BLANCO\n" +
                        "3) AZUL\n" +
                        "4) VERDE\n" +
                        "5) GRIS\n");
                int opcion3 = sc.nextInt();
                switch (opcion3) {
                    case 1:
                        color = Color.NEGRO;
                        break;
                    case 2:
                        color = Color.BLANCO;
                        break;
                    case 3:
                        color = Color.AZUL;
                        break;
                    case 4:
                        color = Color.VERDE;
                        break;
                    case 5:
                        color = Color.GRIS;
                        break;
                    default:
                        System.out.println("El dato ingresado no es valido");
                        break;
                }
                salir = false;
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("¡El caracter ingresado no es valido!");
            }
        } while (salir);
        return color;
    }

}
