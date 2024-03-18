package Herencia_1;

public class Vehiculo {
    private String color;
    private int ruedas;

    /*CONSTRUCTORES*/
    public Vehiculo() {
    }

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    /*GETTER Y SETTER*/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }


}
