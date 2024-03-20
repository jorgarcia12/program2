package Herencia_2;


public class Animal {
    private String nombre;
    private int edad;
    private String genero;

    /*CONSTRUCTORES*/
    public Animal() {
    }

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    /*GETTER Y SETTER*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /*METODOS*/
    public void hacerSonido() {
        System.out.println("El animal hace un sonido generico");
    }

    public void informacion() {
        System.out.println("Nombre: " + getNombre() +
                ", Edad: " + getEdad() + " años " +
                ", Genero: " + getGenero());
    }
}

