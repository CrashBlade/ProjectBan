package dominio;

import java.util.Scanner;

public class Main {


	// Arreglo de 5 poscisiones para los productos
	//static Producto[] productosInventario = new Producto[5];
	static Inventario inventario = new Inventario();
	static Scanner entrada;
	
	public static void main(String[] args) {

		menu();
	}

	public static void menu() {

		System.out.println("--- Elija una opcion ---");
		System.out.println("1. Crear Producto");
		System.out.println("2. Actualizar producto");
		System.out.println("3. Eliminar producto");
		System.out.println("4. Buscar producto");
		System.out.println("5. Listar todos los productos");
		System.out.println("6. Salir");
		System.out.print("Opcion:");
		entrada = new Scanner(System.in);		

		try {
			int op = entrada.nextInt();
			switch (op) {
			case 1:
				Producto producto = new Producto();
				inventario.crearProducto(producto);
				System.out.println();
				menu();
				break;
			case 2:
				System.out.println();
				inventario.actualizarProducto();
				menu();
				break;
			case 3:
				break;
			case 4:
				inventario.buscarProducto();
				menu();
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("Ingrese una opcion entre 1 y 6");
				menu();
				break;
			}
		} catch (Exception ex) {
			menu();
		}

	}


}
