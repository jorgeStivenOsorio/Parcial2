import java.util.InputMismatchException;
import java.util.Scanner;

public class Datos extends Menu {
    Scanner sc = new Scanner(System.in);
    Color color;
    private int velMaxima;
    private int extra;
    private Vehiculo vehiculo;
    private VehiculoFactory Vf;


    public Garaje datosOpcionAgregar(Garaje garaje) {
        int opcion;
        boolean salir = true;
        do {
            try {
                boolean estado = garaje.EstadoDelGarage();
                if (estado == true) {
                    showMenuVehiculos();
                    opcion = sc.nextInt();
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            garaje.AgregarAvion();
                            break;
                        case 2:
                            garaje.AgregarYate();
                            break;
                        case 3:
                            garaje.AgregarCarro();
                            break;
                        case 4:
                            salir = false;
                            break;
                    }
                }
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("¡El dato ingresado es invalido!");
            }

        } while (salir);
        return garaje;
    }


    public Vehiculo Datos(int opcion) {
        String referencia = "";
        while (referencia == "") {
            System.out.println("Ingrese la referencia: ");
            referencia = sc.nextLine();
        }
        System.out.println("Ingrese velocidad maxima en Km/h: ");
        velMaxima = sc.nextInt();
        color = OpcionDeColores();
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
                System.out.println("Seleccione el color: \n" +
                        "1) NEGRO\n" +
                        "2) BLANCO\n" +
                        "3) AZUL\n" +
                        "4) VERDE\n" +
                        "5) GRIS\n");
                int opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1:
                        color = Color.NEGRO;
                        salir = false;
                        break;
                    case 2:
                        color = Color.BLANCO;
                        salir = false;
                        break;
                    case 3:
                        color = Color.AZUL;
                        salir = false;
                        break;
                    case 4:
                        color = Color.VERDE;
                        salir = false;
                        break;
                    case 5:
                        color = Color.GRIS;
                        salir = false;
                        break;
                    default:
                        System.out.println("El dato ingresado no es valido");
                        break;
                }

            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("¡El caracter ingresado no es valido!");
            }
        } while (salir);
        return color;
    }


}
