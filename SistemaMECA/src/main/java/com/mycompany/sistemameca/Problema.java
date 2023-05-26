
package com.mycompany.sistemameca;

public class Problema {
    
    private String fecha;
    private String problema;
    
    public Problema(String fecha, String problema){
        this.fecha = fecha;
        this.problema = problema;
    }
    
    public String getFecha(){
        return fecha;
    } 
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public String getProblema(){
        return problema;
    } 
    
    public void setProblema(String problema){
        this.problema = problema;
    }
    
    @Override
    public String toString(){
        return "\nProblema: " + "\n- Fecha = " + fecha + "\n- Problema = " + problema;
    }
    
}
