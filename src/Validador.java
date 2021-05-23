import java.util.InputMismatchException;
import java.util.Scanner;

public class Validador{
    private static Scanner scanner = new Scanner(System.in);

    public static int validarOpcion(){
        int opcion = 0;
        try {
            opcion = scanner.nextInt();
        } catch (InputMismatchException ex){
            opcion =  0;
        }
        scanner.nextLine();
        return opcion;
    }

    public static String recibidorString(String mensaje){
        System.out.println(mensaje);
        String dato=scanner.nextLine();
        return dato;
    }

    public static int validarInt(String mensaje){
        int numero = 0;
        do {
            System.out.println(mensaje);
            try {
                numero = scanner.nextInt();
            } catch (InputMismatchException ex) {
                numero = -1;
            }
            scanner.nextLine();
        }while (numero == -1);
        return numero;
    }




}
