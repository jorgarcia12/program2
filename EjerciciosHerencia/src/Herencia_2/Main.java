package Herencia_2;

public class Main {
    public static void main(String[] args) {

        Perro p1 = new Perro("India",7,"femenino","labrador","pelo corto");
        Pajaro b1 = new Pajaro("Tweetie",2,"Masculino","Canario","Pequeño");
        Gato g1 =  new Gato("Maui",3,"Masculino","Gris y Blanco","Cariñoso");


        /*Mostramos la info del perro y sus metodos especificos*/
        p1.informacion();
        p1.hacerSonido();
        p1.jugar();
        System.out.println("----------------------");
        /*Mostramos la info del pajaro y sus metodos especificos*/
        b1.informacion();
        b1.hacerSonido();
        b1.volar();
        System.out.println("----------------------");
        /*Mostramos la info del gato y sus metodos especificos*/
        g1.informacion();
        g1.hacerSonido();
        g1.afilarUnias();
    }
}
