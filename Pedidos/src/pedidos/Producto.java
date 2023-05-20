package pedidos;

public class Producto {
    
    private String nombre;
    private double precio;
    private int cantidad;
    private double impuestos;
    
    public Producto(String nombre, double precio, int cantidad, double impuestos) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.impuestos = impuestos;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getImpuestos() {
        return impuestos;
    }
    
    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
    
    public boolean verificarExistencias() {
        return cantidad > 0;
    }
    
    public int obtenerCantidadDisponible() {
        return cantidad;
    }
    
}
