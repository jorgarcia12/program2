package Animales;

public abstract class Felino  extends Animal{

    public Felino(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }


    @Override
    public String rugir(){
        return super.rugir()+" MIAAAU";
    }
}
