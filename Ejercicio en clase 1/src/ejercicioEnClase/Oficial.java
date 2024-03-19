package ejercicioEnClase;

public class Oficial extends Operario{
    private String turno;

    public Oficial(){
    }
    public Oficial(String nombre, int horas, String turno) {
        super(nombre, horas);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void chequearTurno (){
        System.out.println("Hoy toca turno "+turno);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
