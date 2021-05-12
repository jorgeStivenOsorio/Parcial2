import java.util.Scanner;

public class Garaje {
    Scanner sc = new Scanner(System.in);
    Vehiculo[] garaje = new Vehiculo[10];
    Datos datos = new Datos();


    public void ingresarVehiculoAlGaraje(int opcion) {

        Vehiculo vehiculo = datos.Datos(opcion);
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == null) {
                garaje[i] = vehiculo;
                System.out.println("¡Vehiculo agregado exitosamente!");
                break;
            }
        }

    }


    public void AgregarAvion() {

        ingresarVehiculoAlGaraje(1);

    }

    public void AgregarYate() {
        ingresarVehiculoAlGaraje(2);
    }

    public void AgregarCarro() {
        ingresarVehiculoAlGaraje(3);
    }


    public boolean EstadoDelGarage() {
        boolean estado = false;
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == null) {
                estado = true;
            } else if (i == (garaje.length - 1) && garaje[i] != null) {
                System.out.println("¡El garage esta lleno, no es posible agregar un vehiculo!");
                estado = false;
            }
        }
        return estado;
    }

    public void mostrarGaraje() {
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] != null) {
                System.out.println(garaje[i]);
            } else if (i == 0 & garaje[i] == null) {
                System.out.println("¡El garage esta vacio!");
                break;
            }
        }
    }


}
