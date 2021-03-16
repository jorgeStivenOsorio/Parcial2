public class Avion extends Vehiculo {

    private final int altitud;

    public Avion(String referencia, int velocidadMaxima, int altitud, Color color) {
        super(referencia, velocidadMaxima,color);
        this.altitud = altitud;
    }

    public int getAltitud() {
        return altitud;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------\n" +
                "Tipo de vehiculo: AVION\n" +super.toString() +
                "Altitud: " + altitud + "\n" +
                "---------------------------------------------------\n";
    }
}
