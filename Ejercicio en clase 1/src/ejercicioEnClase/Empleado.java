package ejercicioEnClase;

public class Empleado {
    private String nombre;

    public Empleado() {

    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void empleado() {
        System.out.println("Soy un empleado");
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre;
    }
}
