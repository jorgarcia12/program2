package Herencia_1;

public class Camioneta extends Coche {
    private double carga;

    /*CONSTRUCTORES*/
    public Camioneta() {
    }

    public Camioneta(String color, int ruedas, int velocidad, int cilindrada, double carga) {
        super(color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }

    /*GETTER Y SETTER*/
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override

    public String toString() {
        return "Camioneta: Color: " + getColor() +
                " | ruedas: " + getRuedas() +
                " | velocidad: " + getVelocidad() +
                " | cilindrada: " + getCilindrada() +
                " | Carga: " + carga;
    }

}
