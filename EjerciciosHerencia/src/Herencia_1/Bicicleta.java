package Herencia_1;

public class Bicicleta extends Vehiculo {
    private String tipo;

    /*CONSTRUCTORES*/
    public Bicicleta() {
    }

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    /*GETTER Y SETTER*/
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta: Color: " + getColor()
                + " | ruedas: " + getRuedas() +
                " | tipo: " + tipo;
    }
}
