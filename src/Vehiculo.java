public class Vehiculo {

    private final String referencia;
    private final int velocidadMaxima;
    Color color;

    public Vehiculo(String referencia, int velocidadMaxima, Color color) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\n" +
                "Referencia: " + referencia + "\n" +
                "Velocidad maxima: " + velocidadMaxima + "\n";
    }
}
