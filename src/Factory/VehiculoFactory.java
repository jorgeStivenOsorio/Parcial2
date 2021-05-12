package Factory;

import model.*;

public interface VehiculoFactory {

    Vehiculo crearVehiculo(String referencia, int velocidadMaxima, int extra, Color color);

}
