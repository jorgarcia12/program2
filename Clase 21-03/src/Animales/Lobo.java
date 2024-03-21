package Animales;

public class Lobo extends Canino{
    public Lobo(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }
    @Override
    public String comer(){
        return super.comer()+"una oveja";
    }
    public String hacerRuido(){
        return super.hacerRuido()+ "ruge el lobo";
    }
}
