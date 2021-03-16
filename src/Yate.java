public class Yate extends Vehiculo {

    private final int pesoMaximo;

    public Yate(String referencia, int velocidadMaxima, int pesoMaximo, Color color) {
        super(referencia, velocidadMaxima, color);
        this.pesoMaximo = pesoMaximo;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------\n" +
                "Tipo de vehiculo: YATE\n" + super.toString() +
                "Peso maximo: " + pesoMaximo + "\n" +
                "---------------------------------------------------\n";
    }
}
