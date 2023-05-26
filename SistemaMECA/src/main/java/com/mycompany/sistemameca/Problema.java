package com.mycompany.sistemameca;

public class Problema {
    
    private String fecha;
    private String descripcionproblema;
    
    public Problema(String fecha, String descripcionproblema){
        this.fecha = fecha;
        this.descripcionproblema = descripcionproblema;
    }
    
    public String getFecha(){
        return fecha;
    } 
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public String getProblema(){
        return descripcionproblema;
    } 
    
    public void setProblema(String problema){
        this.descripcionproblema = problema;
    }
    
    @Override
    public String toString(){
        return "\nProblema: " + "\n- Fecha = " + fecha + "\n- Problema = " + descripcionproblema;
    }
    
}
