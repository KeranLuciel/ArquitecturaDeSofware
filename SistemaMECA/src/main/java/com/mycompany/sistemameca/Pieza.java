package com.mycompany.sistemameca;

public class Pieza {
    
    private String nombre;
    private int numeropieza;
    private String fabricante;
    private int cantidad;
    
    public Pieza(String nombre, int numeropieza, String fabricante, int cantidad){
        this.nombre = nombre;
        this.numeropieza = numeropieza;
        this.fabricante = fabricante;
        this.cantidad = cantidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getNumeropieza(){
        return numeropieza;
    }
    
    public void setNumeropieza(int numeropieza){
        this.numeropieza = numeropieza;
    }
    
    public String getFabricante(){
        return fabricante;
    }
    
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}
