package Animales;

import java.security.PublicKey;

public class Leon extends Felino{
    public Leon(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }
    @Override
    public String comer(){
        return super.comer()+ "El Leon come un pedazo de carne";
    }
    public String hacerRuido(){
        return super.hacerRuido()+" *ruido de leon*";
    }
}
