package logica;
import java.util.ArrayList;
public class ListaProducto {
	
	  private ArrayList<String> productos;

	    public ListaProducto() {
	        productos = new ArrayList<>();
	    }

	    public void insertarProducto(String producto) {
	        productos.add(producto);
	    }

	    public int cantidadProductos() {
	        return productos.size();
	    }
	}