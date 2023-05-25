
package com.mycompany.sistemameca;

public class Contabilidad {
    
    private int ingresos;
    private int egresos;
    private int ganancias;
    
    public Contabilidad(int ingresos, int egresos, int ganancias){
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.ganancias = ganancias;
    }
    
    public int getIngresos(){
        return ingresos;
    }
    
    public void setIngresos(int ingresos){
        this.ingresos = ingresos;
    }
    
    public int getEgresos(){
        return egresos;
    }
    
    public void setEgresos(int egresos){
        this.egresos = egresos;
    }
    
    public int getGanancias(){
        return ganancias;
    }
    
    public void setGanancias(int ganancias){
        this.ganancias = ganancias;
    }
}
