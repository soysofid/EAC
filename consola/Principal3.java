package consola;
import logica.*;
public class Principal3 {

	public static void main(String[] args) {
		Limpieza producto1 = new Limpieza(1, "Jabón", 5, 2025);
        Limpieza producto2 = new Limpieza(2, "Detergente", 10, 2024);

        
        System.out.println("Datos del producto 1:");
        System.out.println(producto1.toString());

        System.out.println("\nDatos del producto 2:");
        System.out.println(producto2.toString());
	}

}
