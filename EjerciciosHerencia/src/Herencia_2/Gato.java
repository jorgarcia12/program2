package Herencia_2;

public class Gato extends Animal {
    private String color_pelaje;
    private String personalidad;
    /*CONSTRUCTORES*/
    public Gato() {

    }

    public Gato(String nombre, int edad, String genero, String color_pelaje, String personalidad) {
        super(nombre, edad, genero);
        this.color_pelaje = color_pelaje;
        this.personalidad = personalidad;
    }
    /*GETTER Y SETTER*/
    public String getColor_pelaje() {
        return color_pelaje;
    }

    public void setColor_pelaje(String color_pelaje) {
        this.color_pelaje = color_pelaje;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }
    /*METODOS*/
    public void afilarUnias(){
        System.out.println("El gato esta afilando sus uñas con el sillon :/");
    }
    @Override
    public String hacerSonido() {
        return super.hacerSonido() + "MIAU MIAU";
    }
    public void informacion() {
        super.informacion();
        System.out.println(", Color del Pelaje: "+getColor_pelaje() +
                "Personalidad: "+getPersonalidad());
    }
}
