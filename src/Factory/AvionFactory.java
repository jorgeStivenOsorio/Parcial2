package Factory;

import model.*;

public class AvionFactory implements VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo(String referencia, int velocidadMaxima, int extra, Color color) {
        return new Avion(referencia, velocidadMaxima, extra, color);
    }
}
