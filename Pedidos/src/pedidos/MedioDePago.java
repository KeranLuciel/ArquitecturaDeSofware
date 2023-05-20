
package pedidos;

public class MedioDePago {
    
    private String detalles;
    private String tipoCuotas;
    
    public MedioDePago(String detalles, String tipoCuotas) {
        this.detalles = detalles;
        this.tipoCuotas = tipoCuotas;
    }
    
    public String getDetalles() {
        return detalles;
    }
    
    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    public String getTipoCuotas() {
        return tipoCuotas;
    }
    
    public void setTipoCuotas(String tipoCuotas) {
        this.tipoCuotas = tipoCuotas;
    }
    
}
