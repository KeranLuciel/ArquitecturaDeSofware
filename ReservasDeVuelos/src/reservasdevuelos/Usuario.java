package reservasdevuelos;

public class Usuario {
    
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String contraseña;
    
    public Usuario(String nombre, String apellido, String nombreUsuario, String contraseña){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellido;
    }
    
    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
