package Producto;
public abstract class Producto implements Comparable<Producto> {
    //Atributos privados para el encapsulamiento
    protected int id;
    protected String marca;
    protected double precio;

    //Constructor
    public Producto (String marca , double precio){
        this.marca = marca;
        this.precio = precio;
    }

    //Getters
    public String getMarca(){
        return marca;
    }

    public double getPrecio(){
        return precio;
    }

    //Setters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void info(){
        System.out.println("marca: " + getMarca());
        System.out.println("Precio: " + getPrecio());
    }

    //Interface comparable
    @Override
    public int compareTo(Producto otro_precio){
        return Double.compare(this.precio, otro_precio.precio);
    }

}
