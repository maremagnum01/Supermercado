package Fruta;
import Producto.Producto;

public class Fruta extends Producto {
    private String unidad_Venta;

    public Fruta(String marca, float precio, String unidad_venta){
        super(marca,precio);
        this.unidad_Venta = unidad_venta;
    }

    //Getter
    public String getUnidadVenta(){
        return unidad_Venta;
    }

    //Setter
    public void setUnidadVenta(String unidad_venta){
        this.unidad_Venta = unidad_venta;
    }

    @Override
    public String toString(){
        return "Marca: " + marca + ", Unidad de venta: " + unidad_Venta + ", Precio: $" + precio;
    }
}
