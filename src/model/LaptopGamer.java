package model;

public class LaptopGamer extends Laptop{
    public LaptopGamer(){
        this.marca= "Macbook air";
        this.modelo= "";
        this.añoFabricacion= "2017";
        this.tipoProcesador= "Silicon M1";
        this.tamaño= "13";
    }
    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop para Gamer");
        System.out.println("Laptop para Gamer");
        System.out.println(this);
    }
}
