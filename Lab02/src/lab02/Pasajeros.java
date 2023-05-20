package lab02;

public class Pasajeros {
    
    private String nombre;
    private String direccion;
    private String numeroPasaporte;
    
//    public Pasajeros(){
//    }
    
    public Pasajeros(String nombre, String direccion, String numeroPasaporte) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }
    
    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }
    
    public void registrarPasajero(String nombre, String direccion, String numeroPasaporte) {
        
        if (nombre != null && !nombre.isEmpty() && direccion != null && !direccion.isEmpty() && numeroPasaporte != null && !numeroPasaporte.isEmpty()) {
            
            this.nombre = nombre;
            this.direccion = direccion;
            this.numeroPasaporte = numeroPasaporte;
            System.out.println("\nPasajero registrado correctamente");
            System.out.println("----------------------------------");
        } else {
            System.out.println("\nError: Falta información para registrar el pasajero");
            System.out.println("----------------------------------------------------");
        }
    }

}
