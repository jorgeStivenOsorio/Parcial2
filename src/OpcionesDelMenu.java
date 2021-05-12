import java.util.InputMismatchException;
import java.util.Scanner;

public class OpcionesDelMenu extends Menu {
    Scanner sc = new Scanner(System.in);
    Garaje garaje = new Garaje();
    Datos datos = new Datos();
    private int opcion;
    private Garaje listTemp;

    public void Menu() {
        boolean salir = true;

        do {
            try {
                showMenuPrincipal();
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        listTemp = datos.datosOpcionAgregar(garaje);
                        ;
                        garaje = listTemp;
                        break;
                    case 2:
                        garaje.mostrarGaraje();
                        break;
                    case 3:
                        salir = false;
                }

            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("¡El caracter ingresado no es valido!");

            }

        } while (salir);


    }


}
