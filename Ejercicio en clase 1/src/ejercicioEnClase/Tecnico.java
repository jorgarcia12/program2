package ejercicioEnClase;

public class Tecnico extends Operario {
    private int cant_arreglos;

    public Tecnico() {
    }

    public Tecnico(String nombre, int horas, int cant_arreglos) {
        super(nombre, horas);
        this.cant_arreglos = cant_arreglos;
    }

    public int getCant_arreglos() {
        return cant_arreglos;
    }

    public void setCant_arreglos(int cant_arreglos) {
        this.cant_arreglos = cant_arreglos;
    }

    public void Arreglos() {
        System.out.println("En mi turno tuve que realizar " + cant_arreglos + " arreglos");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
