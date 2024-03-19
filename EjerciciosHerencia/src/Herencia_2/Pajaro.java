package Herencia_2;

public class Pajaro extends Animal {
    private String especie;
    private String tamanio;

    /*CONSTRUCTORES*/
    public Pajaro() {
    }

    public Pajaro(String nombre, int edad, String genero, String especie, String tamanio) {
        super(nombre, edad, genero);
        this.especie = especie;
        this.tamanio = tamanio;
    }
    /*GETTER Y SETTER*/
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /*METODOS*/
    public void volar(){
        System.out.println("El pajaro esta volando");
    }
    @Override
    public String hacerSonido() {
        return super.hacerSonido() + "PIO PIO";
    }
    public void informacion() {
        super.informacion();
        System.out.println(", Especie: "+getEspecie() +
                "Tamaño: "+getTamanio());
    }
}
