public class Garaje {
    Vehiculo[] garaje = new Vehiculo[10];

    public void AgregarAvion(String referencia, int velocidadMaxima, int altitud, Color color) {
        Avion avion = new Avion(referencia, velocidadMaxima, altitud, color);
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == null) {
                garaje[i] = avion;
                System.out.println("¡Vehiculo agregado exitosamente!");
                break;
            }
        }
    }

    public void AgregarYate(String referencia, int velocidadMaxima, int pesoMaximo, Color color) {
        Yate yate = new Yate(referencia, velocidadMaxima, pesoMaximo, color);
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == null) {
                garaje[i] = yate;
                System.out.println("¡Vehiculo agregado exitosamente!");
                break;
            }
        }
    }

    public void AgregarCarro(String referencia, int velocidadMaxima, int nuemeroDePuertas, Color color) {
        Carro carro = new Carro(referencia, velocidadMaxima, nuemeroDePuertas, color);
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == null) {
                garaje[i] = carro;
                System.out.println("¡Vehiculo agregado exitosamente!");
                break;
            }

        }
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

    public void ShowGarage() {
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
