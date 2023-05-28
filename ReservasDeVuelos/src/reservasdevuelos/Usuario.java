package reservasdevuelos;

public class Usuario {
    
    private String nombre;
    private String apellido;
    private String nombreusuario;
    private String contraseña;
    
    public Usuario(String nombre, String apellido, String nombreusuario, String contraseña){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreusuario = nombreusuario;
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
    
    public String getNombreusuario() {
        return nombreusuario;
    }
    
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
