package model;

public class Avion extends Vehiculo {

    private final int altitud;

    public Avion(String referencia, int velocidadMaxima, int altitud, Color color) {
        super(referencia, velocidadMaxima, color);
        this.altitud = altitud;
    }


    public static class AvionBuilder extends Vehiculo {
        private int altitud;

        public AvionBuilder(String referencia, int velocidadMaxima, int altitud, Color color) {
            super(referencia, velocidadMaxima, color);
            this.altitud = altitud;
        }

        public AvionBuilder altitud(int altitud) {
            this.altitud = altitud;
            return this;
        }

        public Avion build() {

            return new Avion(super.getReferencia(), super.getVelocidadMaxima(), altitud, super.getColor());
        }

        @Override
        public String toString() {
            return "---------------------------------------------------\n" +
                    "Tipo de vehiculo: AVION\n" + super.toString() +
                    "Altitud: " + altitud + "\n" +
                    "---------------------------------------------------\n";
        }
    }



}
