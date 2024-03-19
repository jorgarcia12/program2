package ejercicioEnClase;

public class Main {
    public static void main(String[] args) {

        Oficial o1 = new Oficial("Raul", 10, "Mañana");
        Tecnico tec1 = new Tecnico("Juanse", 6, 4);
        Directivo direc1 = new Directivo("Genaro", "Contador");

        System.out.println("Buenas, "+ direc1.decirCargo());


    }
}
