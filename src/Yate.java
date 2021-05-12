public class Yate extends Vehiculo {

    private final int pesoMaximo;

    public Yate(String referencia, int velocidadMaxima, int pesoMaximo, Color color) {
        super(referencia, velocidadMaxima, color);
        this.pesoMaximo = pesoMaximo;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }


    public static class YateBuilder extends Vehiculo {

        public YateBuilder(String referencia, int velocidadMaxima, int pesoMaximo, Color color) {
            super(referencia, velocidadMaxima, color);
            this.pesoMaximo = pesoMaximo;
        }

        private int pesoMaximo;


        public YateBuilder pesoMaximo(int pesoMaximo) {
            this.pesoMaximo = pesoMaximo;
            return this;
        }

        public Yate build() {
            return new Yate(super.getReferencia(), super.getVelocidadMaxima(), pesoMaximo, super.getColor());
        }

        @Override
        public String toString() {
            return "---------------------------------------------------\n" +
                    "Tipo de vehiculo: YATE\n" + super.toString() +
                    "Peso maximo: " + pesoMaximo + "\n" +
                    "---------------------------------------------------\n";
        }


    }
}