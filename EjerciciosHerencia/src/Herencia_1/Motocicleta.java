package Herencia_1;

public class Motocicleta extends Bicicleta {
    private int velocidad;
    private int cilindrada;

    /*CONSTRUCTORES*/
    public Motocicleta() {
    }

    public Motocicleta(String color, int ruedas, String tipo, int velocidad, int cilindrada) {
        super(color, ruedas, tipo);
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
        return "Motocicleta: Color: " + getColor() +
                " | ruedas: " + getRuedas() +
                " | tipo: " + getTipo() +
                " | velocidad: " + velocidad +
                " | cilindrada: " + cilindrada;
    }
}
