package dominio;

import java.util.Scanner;

public class Main {

	private static Producto producto, producto1;
	private static Scanner entrada;

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
		entrada = new Scanner(System.in);
		int op = entrada.nextInt();
		switch (op) {
		case 1:
			producto = new Producto();
			crearProducto(producto);
			producto1 = new Producto();
			crearProducto(producto1);
			System.out.println(producto.toString());
			System.out.println(producto1.toString());
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

	public static void crearProducto(Producto producto) {
		entrada = new Scanner(System.in);
		System.out.println("Nombre: ");
		try {
			producto.setNombre(entrada.nextLine());
			System.out.println("PrecioCompra: ");
			producto.setPrecioCompra(entrada.nextDouble());
			producto.setEstado(true);
			
		} catch (Exception ex) {
			System.out.println("Fallo la creacion del producto");
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
