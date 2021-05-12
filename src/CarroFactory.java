public class CarroFactory implements VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo(String referencia, int velocidadMaxima, int extra, Color color) {
        return  new Carro(referencia, velocidadMaxima, extra, color);
    }

}
