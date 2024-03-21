package Animales;

public class Gato extends Felino{
    public Gato(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    public void vacunar(){
        System.out.println("vacunando");
    }

    @Override
    public String comer(){
        return super.comer()+"comida de gato";
    }
    public String hacerRuido(){
        return super.hacerRuido()+"miau";
    }
}
