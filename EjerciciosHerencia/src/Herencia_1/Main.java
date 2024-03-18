package Herencia_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> carsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        /*OBJETOS*/
        Coche car = new Coche("Rojo", 4, 80, 2000);
        Camioneta truck = new Camioneta("Blanco", 4, 120, 2500, 1000);
        Bicicleta bike = new Bicicleta("Gris", 2, "Urbana");
        Motocicleta motorbike = new Motocicleta("Negro", 2, "Deportiva", 120, 1200);

        carsList.add(car);
        carsList.add(truck);
        carsList.add(bike);
        carsList.add(motorbike);

        catalogar(carsList);
        System.out.println("Ingrese la cantidad de ruedas del vehiculo para filtrar los resultados: ");
        int num_ruedas = sc.nextInt();
        filtarRuedas(num_ruedas, carsList);
    }

    private static void catalogar(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }

    public static void filtarRuedas (int num_ruedas, ArrayList<Vehiculo> carsList ){
        int contador = 0;
        for (Vehiculo vehiculo: carsList) {
            if (vehiculo.getRuedas()==num_ruedas){
                System.out.println(vehiculo.getClass().getSimpleName());
                contador++;
            }
        }
        System.out.println("Se encontraron "+contador+" vehiculos con "+ num_ruedas+ " ruedas");
    }

}


