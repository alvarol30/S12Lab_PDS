package app;
import factory.*;

public class Main{
    public static void main(String[] args){

        System.out.println("******* BIENVENIDOS A LA FABRICA DE LAPTOPS *******\n");

        LaptopFactory factory;
        factory= new LaptopGamerFactory();
        factory.procesarLaptop();
        System.out.println();
        factory= new LaptopBasicaFactory();
        factory.procesarLaptop();
        System.out.println();
        factory= new LaptopProfesionalFactory();
        factory.procesarLaptop();
    }
}