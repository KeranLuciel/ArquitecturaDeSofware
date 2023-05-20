package pedidos;

public class Cliente {
    
    private String nombre;
    private String email;
    private MedioDePago medioDePago;
    
    public Cliente(String nombre, String email, MedioDePago medioDePago) {
        this.nombre = nombre;
        this.email = email;
        this.medioDePago = medioDePago;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public MedioDePago getMetodoDePago() {
        return medioDePago;
    }
    
    public void setMedioDePago(MedioDePago medioDePago) {
        this.medioDePago = medioDePago;
    }
    
}
