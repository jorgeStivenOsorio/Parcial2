import model.Color;
import model.Vehiculo;
import java.util.*;

public class Garaje {
    Set<Vehiculo>garaje = new HashSet<>();
    Datos datos = new Datos();

    public void ingresarVehiculoAlGaraje(int opcion) {
        Vehiculo vehiculo = datos.recolectorDeDatos(opcion);
        garaje.add(vehiculo);
        System.out.println("¡Vehiculo agregado exitosamente!");
    }

    public void agregarAvion() { ingresarVehiculoAlGaraje(1); }

    public void agregarYate() { ingresarVehiculoAlGaraje(2); }

    public void agregarCarro() { ingresarVehiculoAlGaraje(3); }

    public void mostrarGaraje() {
        if (garaje.isEmpty()){
            System.out.println("¡El garaje esta vacio!");
        }else {
            garaje.forEach(System.out::println);
        }
    }

    public void vehiculoMasRapido(){garaje.stream().max(Comparator.comparing(Vehiculo::getVelocidadMaxima)).stream().forEach(System.out::println);}
    public void vehiculoMasLento(){garaje.stream().min(Comparator.comparing(Vehiculo::getVelocidadMaxima)).stream().forEach(System.out::println);}
    public void ordenarVehiculos(){garaje.stream().sorted((p1, p2) -> p2.getVelocidadMaxima() - p1.getVelocidadMaxima()).forEach(System.out::println);}
    public void vehiculosNegrosAzules(){ garaje.stream().filter(c -> c.getColor() == Color.NEGRO || c.getColor() == Color.AZUL).forEach(System.out::println); }
    public void referenciaConcatenada(){
        String list = garaje.stream().filter(c -> c.getColor() == Color.BLANCO || c.getColor() == Color.VERDE).map(p -> p.getReferencia()).reduce("",(acc, num) -> acc + num);
        System.out.println(list);
    }



}
