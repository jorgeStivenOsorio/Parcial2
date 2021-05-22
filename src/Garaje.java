import model.Vehiculo;

import java.util.HashSet;
import java.util.Set;

public class Garaje {
    Set<Vehiculo>garaje = new HashSet<>();
    Datos datos = new Datos();

    public void ingresarVehiculoAlGaraje(int opcion) {
        Vehiculo vehiculo = datos.RecolectorDeDatos(opcion);
        garaje.add(vehiculo);
        System.out.println("¡Vehiculo agregado exitosamente!");
    }

    public void AgregarAvion() { ingresarVehiculoAlGaraje(1); }

    public void AgregarYate() { ingresarVehiculoAlGaraje(2); }

    public void AgregarCarro() { ingresarVehiculoAlGaraje(3); }

    public void mostrarGaraje() {
        if (garaje.isEmpty()){
            System.out.println("¡El garaje esta vacio!");
        }else {
            garaje.forEach(System.out::println);
        }
    }


}
