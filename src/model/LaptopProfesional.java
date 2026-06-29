package model;

public class LaptopProfesional extends Laptop{
    public LaptopProfesional(){
        this.marca= "Macbook Pro";
        this.modelo= "";
        this.añoFabricacion= "2022";
        this.tipoProcesador= "Apple Silicon M2";
        this.tamaño= "16";
    }

    @Override
    public void ejecutarPrueba(){
        System.out.println("Corriendo programas en una Laptop Profesional");
        System.out.println("Laptop para Profesional");
        System.out.println(this);
    }
}
