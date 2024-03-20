package Herencia_2;

public class Perro extends Animal {
    private String raza;
    private String pelaje;

    /*CONSTRUCTORES*/
    public Perro() {
    }

    public Perro(String nombre, int edad, String genero, String raza, String pelaje) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.pelaje = pelaje;
    }
    /*GETTER Y SETTER*/
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    /*METODOS*/
    public void jugar(){
        System.out.println("El perro esta persiguiendo su cola!");
    }
    @Override
    public void hacerSonido() {
        System.out.println("GUAU GUAU");
    }
    public void informacion() {
        super.informacion();
        System.out.println("Raza: "+getRaza() +
                " Pelaje: "+getPelaje());
    }
}
