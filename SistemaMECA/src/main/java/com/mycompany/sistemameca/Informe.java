package com.mycompany.sistemameca;

public class Informe {
    
    private String fecha;
    private String estadovehiculo;
    
    public Informe (String fecha, String estadovehiculo){
        this.fecha = fecha;
        this.estadovehiculo = estadovehiculo;
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
}
