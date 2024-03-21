package Animales;

public class Perro extends Canino{
    public Perro(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }
    public void sacarPaseo(){
        System.out.println("El Perro esta paseando");
    }
    @Override
    public String comer(){
        return super.comer()+"alimento para perros";
    }
    public String hacerRuido(){
        return super.hacerRuido()+"GUAU GUAU";
    }
    public void vacunar(){
        System.out.println("vacunando");
    }
}
