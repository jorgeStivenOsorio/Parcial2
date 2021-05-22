import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Datos extends Menu {
    Scanner sc = new Scanner(System.in);
    Color color;


    public Garaje datosOpcionAgregar(Garaje garaje) {
        int opcion;
        boolean salir = true;
        do {
            try {
                showMenuVehiculos();
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1 -> garaje.AgregarAvion();
                    case 2 -> garaje.AgregarYate();
                    case 3 -> garaje.AgregarCarro();
                    case 4 -> salir = false;
                }
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("¡El dato ingresado es invalido!");
            }

        } while (salir);
        return garaje;
    }


    public Vehiculo RecolectorDeDatos(int opcion) {
        int extra;
        String referencia = "";
        while (referencia.equals("")) {
            System.out.println("Ingrese la referencia: ");
            referencia = sc.nextLine();
        }
        System.out.println("Ingrese velocidad maxima en Km/h: ");
        int velMaxima = sc.nextInt();
        color = OpcionDeColores();
        Vehiculo vehiculo;
        if (opcion == 1) {
            System.out.println("Ingrese altitud");
            extra = sc.nextInt();
            vehiculo = new Avion.AvionBuilder(referencia, velMaxima, extra, color);
        } else if (opcion == 2) {
            System.out.println("Ingrese el peso maximo en Kg: ");
            extra = sc.nextInt();
            vehiculo = new Yate.YateBuilder(referencia, velMaxima, extra, color);
        } else {
            System.out.println("Ingrese numero de puertas: ");
            extra = sc.nextInt();
            vehiculo = new Carro.CarroBuilder(referencia, velMaxima, extra, color);
        }
        sc.nextLine();
        return (vehiculo);
    }

    public Color OpcionDeColores() {
        boolean salir = true;
        do {
            try {
                System.out.println("""
                        Seleccione el color:\s
                        1) NEGRO
                        2) BLANCO
                        3) AZUL
                        4) VERDE
                        5) GRIS
                        """);
                int opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1 -> {
                        color = Color.NEGRO;
                        salir = false;
                    }
                    case 2 -> {
                        color = Color.BLANCO;
                        salir = false;
                    }
                    case 3 -> {
                        color = Color.AZUL;
                        salir = false;
                    }
                    case 4 -> {
                        color = Color.VERDE;
                        salir = false;
                    }
                    case 5 -> {
                        color = Color.GRIS;
                        salir = false;
                    }
                    default -> System.out.println("El dato ingresado no es valido");
                }

            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("¡El caracter ingresado no es valido!");
            }
        } while (salir);
        return color;
    }


}
