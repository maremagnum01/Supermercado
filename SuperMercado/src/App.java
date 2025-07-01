import Producto.Producto;
import Bebida.Bebida;
import Fruta.Fruta;
import Shampoo.Shampoo;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //Ejecutamos el metodo
        List<Producto> productos = guardarProductos();

        //Lo recorremos con el for
        for(Producto producto : productos){
            System.out.println(producto);
        }

        System.out.println("");

        //Buscamos el mas caro y barato y lo imprimimos
        Producto caro = productos.stream().max(Producto::compareTo).get();
        Producto barato = productos.stream().min(Producto::compareTo).get();
        System.out.println("El producto mas caro es: " + caro.getMarca());
        System.out.println("El producto mas barato es: " + barato.getMarca());
    }

    //Guardar los productos en un array
    public static List<Producto> guardarProductos(){
        //Creamos los productos 
        Bebida cocaColaZero = new Bebida("Coca Cola Zero", 18, 1.5);
        Bebida cocaCola = new Bebida("Cola Cola", 20, 1.5);
        Fruta frutilla = new Fruta("Frutilla", 64, "kilo");
        Shampoo shampoo_sedal = new Shampoo("Shampoo_Sedal", 19, "500ml");

        //Los devuelve
        return Arrays.asList(
            cocaCola,
            cocaColaZero,
            frutilla,
            shampoo_sedal
        );
    }
}
