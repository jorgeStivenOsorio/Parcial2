package model;

import java.util.Objects;

public class Vehiculo {

    private final String referencia;
    private final int velocidadMaxima;
    private final Color color;

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
        return "Color: " + getColor() + "\n" +
                "Referencia: " + getReferencia() + "\n" +
                "Velocidad maxima: " + getVelocidadMaxima() + "\n";
    }

    public static class VehiculoBuilder {

        private String referencia;
        private int velocidadMaxima;
        private Color color;

        public VehiculoBuilder referencia(String referencia) {
            this.referencia = referencia;
            return this;
        }

        public VehiculoBuilder velocidadMaxima(int velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima;
            return this;

        }

        public VehiculoBuilder color(Color color) {
            this.color = color;
            return this;
        }

        public Vehiculo build() {
            return new Vehiculo(referencia, velocidadMaxima, color);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (null == o)
            return false;
        if (!(o instanceof Vehiculo))
            return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return this.referencia.equals(vehiculo.referencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.referencia);
    }
}
