package consola;
import logica.*;
public class Principal4 {

	public static void main(String[] args) {
		ListaProducto listado= new ListaProducto();
		
		 listado.insertarProducto("Producto 1");
	        listado.insertarProducto("Producto 2");
	        
	        int cantidad = listado.cantidadProductos();
	        System.out.println("Cantidad de productos: " + cantidad);
	    }
	
}
