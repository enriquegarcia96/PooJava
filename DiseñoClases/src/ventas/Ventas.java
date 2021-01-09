package ventas;
import com.garcia.ventas.*;

public class Ventas {

    public static void main(String[] args) {
        //Creamos varios objetos de tipo Producto
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("pantalon", 100);

        //creamos un objeto de tipo orden
        Orden orden1 = new Orden();

        //agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        //imprimir la orden
        orden1.mostrarOrden();
    }


}
