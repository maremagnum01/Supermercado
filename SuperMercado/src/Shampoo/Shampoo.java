package Shampoo;
import Producto.Producto;

public class Shampoo extends Producto {
    private String contenido;

    public Shampoo(String marca, float precio, String contenido){
        super(marca,precio);
        this.contenido = contenido;
    }

    //Getter 
    public String getContenido(){
        return contenido;
    }

    //Setter
    public void setContido(String contenido){
        this.contenido = contenido;
    }

    @Override
    public String toString(){
        return "Marca: " + marca + ", Contenido: " + contenido + ", Precio: $" + precio;
    }
}
