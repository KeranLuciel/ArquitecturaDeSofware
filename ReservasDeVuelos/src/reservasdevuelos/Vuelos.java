
package reservasdevuelos;

public class Vuelos {
    
    private String origen;
    private String destino;
    private String fecha;
    private int numeropasajeros;
    
    public Vuelos(String origen, String destino, String fecha, int numeropasajeros) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.numeropasajeros = numeropasajeros;
    }
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public int getNumeroPasajeros() {
        return numeropasajeros;
    }
    
    public void setNumeroPasajeros(int numeropasajeros) {
        this.numeropasajeros = numeropasajeros;
    }
    
}
