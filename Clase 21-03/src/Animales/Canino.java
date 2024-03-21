package Animales;

public abstract class Canino extends Animal{
    public Canino(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    @Override
    public String rugir(){
        return super.rugir()+"ROOAAAR";
    }
}
