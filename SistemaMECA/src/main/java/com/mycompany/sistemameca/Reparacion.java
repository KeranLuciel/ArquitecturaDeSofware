package com.mycompany.sistemameca;

public class Reparacion {
    
    private String fecha;
    private String descripcion;
    private Cliente cliente;
    
    public Reparacion(String fecha, String descripcion, Cliente cliente){
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cliente = cliente;
    }
    
    public String getFecha(){
        return fecha;
    } 
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public String getDescripción(){
        return descripcion;
    } 
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    @Override
    public String toString(){
        return "\nReparación: " + "\n- Fecha = " + fecha + "\n- Descripción = " + descripcion +
                "\n- Cliente = " + cliente.toString();
    }
}
