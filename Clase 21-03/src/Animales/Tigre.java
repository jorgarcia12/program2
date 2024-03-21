package Animales;

public class Tigre extends Felino{
    public Tigre(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    @Override
    public String comer(){
        return super.comer()+"come un pedazo de hueso";
    }
    public String hacerRuido(){
        return super.hacerRuido()+"ruido de tigre";
    }
}
