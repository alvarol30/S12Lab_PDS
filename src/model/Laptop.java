package model;

public abstract class Laptop{
    protected String tamaño;
    protected String tipoProcesador;
    protected String añoFabricacion;
    protected String modelo;
    protected String marca;

    public abstract void ejecutarPrueba();

    @Override
    public String toString(){
        return "Marca y Modelo: " +marca+" "+modelo
                +"\nAño de Fabricacion: " +añoFabricacion
                +"\nProcesador: "+tipoProcesador
                +"\nTamaño de la Pantalla: "+tamaño;
    }
}
