package com.mycompany.sistemameca;

public class Informe {
    
    private String fecha;
    private String estadovehiculo;
    private Vehiculo vehiculo;
    private Pedido pedido;
    
    public Informe(String fecha, String estadovehiculo, Vehiculo vehiculo, Pedido pedido){
        this.fecha = fecha;
        this.estadovehiculo = estadovehiculo;
        this.vehiculo = vehiculo;
        this.pedido = pedido;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public String getEstadovehiculo(){
        return estadovehiculo;
    }
    
    public void setEstadovehiculo(String estadovehiculo){
        this.estadovehiculo = estadovehiculo;
    }
    
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    public Pedido getPedido(){
        return pedido;
    }
    
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }
    
    @Override
    public String toString(){
        return "\nInforme: " + "\n- Fecha = " + fecha + "\n- Estado del vehículo = " + estadovehiculo +
                "\n- Vehículo = " + vehiculo.toString() + "\n- Pedido = " + pedido.toString();
    }
}