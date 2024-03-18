package Herencia_1;

public class Coche extends Vehiculo {
    private int velocidad;
    private int cilindrada;

    /*CONSTRUCTORES*/
    public Coche() {

    }

    public Coche(String color, int ruedas, int velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    /*GETTER Y SETTER*/
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Coche: Color: " + getColor() +
                " | ruedas: " + getRuedas() +
                " | velocidadMaxima: " + velocidad +
                " | cilindrada: " + cilindrada;
    }
}
