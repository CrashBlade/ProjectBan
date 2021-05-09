package dominio;

import java.util.Scanner;

public class Inventario {

    public Producto inventarioProductos[] = new Producto[5];
    private Scanner entrada;

    public void agregarProductoInventario(Producto producto){

        //Evalua que que no se haya superado el max de posiciones para almacenar PRODUCTOS.
        if(Producto.numeroDeProductos<=this.inventarioProductos.length) {
            int posicion = 0;

            //Recorre el arreglo en busqueda de una posicion disponible para almacenar el PRODUCTO
            for (Producto forProducto : this.inventarioProductos
            ) {
                if (forProducto == null)
                    this.inventarioProductos[posicion] = producto;
                else
                    ++posicion;
            }

            //Imprime el producto para verificar sus poscisiones.
            for (Producto forProducto : this.inventarioProductos
            ) {
                System.out.println(forProducto);
            }
        }
        else
            System.out.println("Supero el maximo de productos creados");
    }


    public void crearProducto(Producto producto) {
        this.entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Nombre: ");
        try {
            producto.setNombre(this.entrada.nextLine());
            System.out.println("PrecioCompra: ");
            producto.setPrecioCompra(this.entrada.nextDouble());
            producto.setEstado(true);

        } catch (Exception ex) {
            System.out.println("Fallo la creacion del producto");
        }

        agregarProductoInventario(producto);
    }
    public Producto buscarProducto() {
		String nombre;
		this.entrada = new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto a buscar ");
		try 
		{
			nombre = entrada.nextLine();
			for (int i = 0; i < this.inventarioProductos.length; i++) 
			{
				if (this.inventarioProductos[i].getNombre() != null) 
				{
					if (this.inventarioProductos[i].getNombre().equals(nombre)) {				
						System.out.println(this.inventarioProductos[i]);
						return this.inventarioProductos[i];
					}
				}
			}
			System.out.println("No se encontro el producto");
			return null;
			
		}
		catch(NullPointerException ex)
		{
			System.out.println("No existen productos en el inventario");
			return null;
		}
	}

}
