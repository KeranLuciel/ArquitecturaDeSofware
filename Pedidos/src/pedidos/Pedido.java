package pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private List<Producto> productos;
    private String fecha;
    private double costoTotal;
    private String estado;
    
    public Pedido() {
        productos = new ArrayList<>();
        fecha = "";
        costoTotal = 0;
        estado = "pendiente";
    }
    
    public List<Producto> getProductos() {
        return productos;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public double getCostoTotal() {
        return costoTotal;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void calcularCostoTotal() {
        costoTotal = 0;
        for (Producto producto : productos) {
            costoTotal += (producto.getPrecio() + producto.getImpuestos()) * producto.getCantidad();
        }
    }
    
    public void cambiarEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }
    
    
}
