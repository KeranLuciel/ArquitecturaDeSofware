package lab02;

public class Vuelos {
     
    private String origen;
    private String destino;
    private String fecha;
    private int asientosDisponibles;
    
    public Vuelos(String origen, String destino, String fecha, int asientosDisponibles) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.asientosDisponibles = asientosDisponibles;
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
    
    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }
    
    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
    
    public void mostrarVuelo(){
        System.out.println("-----------------------");
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Fecha: " + fecha);
        System.out.println("Asientos disponibles " + asientosDisponibles);
    }
}
