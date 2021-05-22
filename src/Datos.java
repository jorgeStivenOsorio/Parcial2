import model.*;

public class Datos extends Menu {
    Color color;

    public Garaje datosOpcionAgregar(Garaje garaje) {

            showMenuVehiculos();
            switch (Validador.validarOpcion()) {
                case 1 -> garaje.AgregarAvion();
                case 2 -> garaje.AgregarYate();
                case 3 -> garaje.AgregarCarro();
                case 4 -> {}
                case 5 -> System.out.println("El valor ingresado no es admitido.");
            }
        return garaje;
    }


    public Vehiculo RecolectorDeDatos(int opcion) {
        int extra;
        Vehiculo vehiculo;
        String referencia;
        referencia = Validador.recibidorString("Ingrese la referencia: ");
        int velMaxima = Validador.validarInt("Ingrese velocidad maxima en Km/h: ");
        color = OpcionDeColores();
        if (opcion == 1) {
            extra = Validador.validarInt("Ingrese altitud");
            vehiculo = new Avion.AvionBuilder(referencia, velMaxima, extra, color);
        } else if (opcion == 2) {
            extra = Validador.validarInt("Ingrese el peso maximo en Kg: ");
            vehiculo = new Yate.YateBuilder(referencia, velMaxima, extra, color);
        } else {
            extra = Validador.validarInt("Ingrese numero de puertas: ");
            vehiculo = new Carro.CarroBuilder(referencia, velMaxima, extra, color);
        }
        return (vehiculo);
    }

    public Color OpcionDeColores() {
        boolean salir = true;
        do {
                System.out.println("""
                        Seleccione el color:\s
                        1) NEGRO
                        2) BLANCO
                        3) AZUL
                        4) VERDE
                        5) GRIS
                        """);
                switch (Validador.validarOpcion()) {
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

        } while (salir);
        return color;
    }


}
