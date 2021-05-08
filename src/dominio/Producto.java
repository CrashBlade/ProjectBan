package dominio;

public class Producto {

    private final int id;
    private static int numeroDeProductos;
    private String nombre;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private String unidadMedida;
    private boolean estado;

    
    public Producto(){
         this.id= ++Producto.numeroDeProductos;
    	 this.nombre = "";
         this.descripcion = "";
         this.precioCompra = 0;
         this.precioVenta =  0;
         this.unidadMedida = "";
         this.estado = false;
    }
    
/*
    public Producto(String nombre, String descripcion, double precioCompra,
    					double precioVenta, String unidadMedida, boolean estado){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta =  precioVenta;
        this.unidadMedida = unidadMedida;
        this.estado = estado;
}*/
    
    public String getNombre() {
    	return nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getID() {
        return id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", estado=" + estado +
                '}';
    }
}
