package com.mycompany.sistemameca;

public class Vehiculo {
    
    private String modelo;
    private String marca;
    private String color;
    private String licencia;
    
    public Vehiculo(String modelo, String marca, String color, String licencia){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.licencia = licencia;
    }
    
    public String getModelo(){
        return modelo;
    } 
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    } 
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getColor(){
        return color;
    } 
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getLicencia(){
        return licencia;
    } 
    
    public void setLicencia(String licencia){
        this.licencia = licencia;
    }
    
    @Override
    public String toString(){
        return "\nVehiculo: " + "\n- Modelo = " + modelo + "\n- Marca = " + marca + 
                "\n- Color = " + color + "\n- Licencia = " + licencia;
    }
}
