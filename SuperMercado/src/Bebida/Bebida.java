package Bebida;
import Producto.Producto;

public class Bebida extends Producto{
    private double litro;

    public Bebida(String marca, float precio, double litro){
        super(marca, precio);
        this.litro = litro;
    }

    //Getter
    public double getLitro(){
        return litro;
    }
    
    //Setter
    public void setLitro(double litro){
        this.litro = litro;
    }

    @Override
    public String toString(){
        return "Marca: " + marca + ", Litros: " + litro + ", Precio: $" + precio;
    }
}
