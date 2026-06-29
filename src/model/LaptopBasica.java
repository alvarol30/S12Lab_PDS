package model;

public class LaptopBasica extends Laptop{
    public LaptopBasica() {
        this.marca= "Dell";
        this.modelo= "Latitude";
        this.añoFabricacion= "2020";
        this.tipoProcesador= "intel core i7";
        this.tamaño= "14";
    }

    @Override
    public void ejecutarPrueba(){
        System.out.println("CORRIENDO PROGRAMAS EN UNA LAPTOP BASICA");
        System.out.println("Laptop Basica");
        System.out.println(this);
    }
}
