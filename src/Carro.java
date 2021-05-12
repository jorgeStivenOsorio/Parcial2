public class Carro extends Vehiculo {

    private final int nuemeroDePuertas;

    public Carro(String referencia, int velocidadMaxima, int nuemeroDePuertas, Color color) {
        super(referencia, velocidadMaxima, color);
        this.nuemeroDePuertas = nuemeroDePuertas;
    }


    public static class CarroBuilder extends Vehiculo {

        private int nuemeroDePuertas;

        public CarroBuilder(String referencia, int velocidadMaxima, int nuemeroDePuertas, Color color) {
            super(referencia, velocidadMaxima, color);
            this.nuemeroDePuertas = nuemeroDePuertas;
        }

        public CarroBuilder nuemeroDePuertas(int nuemeroDePuertas) {
            this.nuemeroDePuertas = nuemeroDePuertas;
            return this;
        }

        public Carro build() {
            return new Carro(super.getReferencia(), super.getVelocidadMaxima(), nuemeroDePuertas, super.getColor());
        }

        @Override
        public String toString() {
            return "---------------------------------------------------\n" +
                    "Tipo de vehiculo: CARRO\n" + super.toString() +
                    "Nuemero de puertas: " + nuemeroDePuertas + "\n" +
                    "---------------------------------------------------\n";
        }
    }

}
