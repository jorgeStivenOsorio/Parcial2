import java.util.InputMismatchException;
import java.util.Scanner;

public class Validador{
    private static final Scanner scanner = new Scanner(System.in);

    public static int validarOpcion(){
        int opcion;
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
        return scanner.nextLine();
    }

    public static int validarInt(String mensaje){
        int numero;
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
