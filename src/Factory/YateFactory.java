package Factory;

import model.*;

public class YateFactory implements VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo(String referencia, int velocidadMaxima, int extra, Color color) {
        return new Yate(referencia, velocidadMaxima, extra, color);

    }
}
