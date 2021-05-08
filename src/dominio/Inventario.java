package dominio;

import java.util.Scanner;

public class Inventario {

    public Producto inventarioProductos[] = new Producto[5];
    private Scanner entrada;

    public void agregarProductoInventario(Producto producto){

        //Evalua que que no se haya superado el max de posiciones para almacenar PRODUCTOS.
        if(Producto.numeroDeProductos<=this.inventarioProductos.length) {
            int poscision = 0;

            //Recorre el arreglo en busqueda de una posicion disponible para almacenar el PRODUCTO
            for (Producto forProducto : this.inventarioProductos
            ) {
                if (forProducto == null)
                    this.inventarioProductos[poscision] = producto;
                else
                    ++poscision;
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

}
