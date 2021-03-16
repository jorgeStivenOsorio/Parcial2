public class Carro extends Vehiculo {

    private final int nuemeroDePuertas;

    public Carro(String referencia, int velocidadMaxima, int nuemeroDePuertas, Color color) {
        super(referencia, velocidadMaxima, color);
        this.nuemeroDePuertas = nuemeroDePuertas;
    }

    public int getNuemeroDePuertas() {
        return nuemeroDePuertas;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------\n" +
                "Tipo de vehiculo: CARRO\n" + super.toString() +
                "Nuemero de puertas: " + nuemeroDePuertas + "\n" +
                "---------------------------------------------------\n";
    }
}
