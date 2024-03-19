package ejercicioEnClase;

public class Operario extends Empleado{
    private int horas;

    public Operario() {
    }

    public Operario(String nombre, int horas) {
        super(nombre);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void horas(){
        System.out.println("Hoy trabaje "+horas+" horas");
    }
    @Override
    public String toString() {
        return "Soy un operario, trabajo "+horas+" horas por dia";
    }
}
