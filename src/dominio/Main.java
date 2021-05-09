package dominio;

import java.util.Scanner;

public class Main {

	//Arreglo de 5 poscisiones para los productos
	//static Producto[] productosInventario = new Producto[5];



	public static void main(String[] args) {

		menu();
	}

	public static void menu() {
		Scanner entrada;
		System.out.println("--- Elija una opcion ---");
		System.out.println("1. Crear Producto");
		System.out.println("2. Actualizar producto");
		System.out.println("3. Eliminar producto");
		System.out.println("4. Buscar producto");
		System.out.println("5. Listar todos los productos");
		System.out.println("6. Salir");
		System.out.print("Opcion:");
		entrada = new Scanner(System.in);
		int op = entrada.nextInt();
		switch (op) {
		case 1:
			Inventario inventario = new Inventario();
			Producto producto = new Producto();
			inventario.crearProducto(producto);
			System.out.println(producto.toString());
			System.out.println();
			menu();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
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

	}




	/*
	 * public Producto buscarProducto(String nombre, Producto[] arrProducto){ for
	 * (int i=0; i<arrProducto.length;i++) { if
	 * (arrProducto[i].nombre.equals(nombre)) { return arrProducto[i]; } } return
	 * null; }
	 * 
	 * public void actualizar(String nombre, String descripcion, double
	 * precioCompra, double precioVenta, String unidadMedida, boolean estado){
	 * 
	 * if (nombre!=null) {
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public String listar(){
	 * 
	 * return "Nombre producto: "+ producto.nombre + "\n" + "Descripcion : "+
	 * producto.descripcion + "\n" + "Precio de Compra: "+ producto.precioCompra +
	 * "\n" + "Precio de Venta: "+ producto.precioVenta + "\n" +
	 * "Unidad de medida: "+producto.unidadMedida + "\n" + "Estado"+
	 * producto.estado;
	 * 
	 * } // Listar por producto basado en nombre ( si el nombre es igual al que
	 * ingresa por // argumento entonces se imprime por pantalla todos los campos)
	 * public String listarPorProducto(String nombre){
	 * 
	 * if (nombre!=null) { } return nombre; }
	 * 
	 * public void eliminar(String ID, String nombre){}
	 * 
	 * public boolean existeProducto(){ return true; }
	 * 
	 * public String obtenerId(String nombre) { String id_Producto=""; return
	 * id_Producto; }
	 */

}
