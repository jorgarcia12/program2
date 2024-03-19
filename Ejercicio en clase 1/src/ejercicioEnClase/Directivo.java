package ejercicioEnClase;

public class Directivo extends Empleado {

    private String cargo;

    public Directivo() {

    }

    public Directivo(String nombre, String cargo) {
        super(nombre);
        this.cargo = cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public String decirCargo(){
        return "Mi nombre es "+getNombre()+" y mi puesto es el de "+ cargo;
    }
    @Override
    public String toString() {
        return getNombre()+" "+cargo;
    }
}
