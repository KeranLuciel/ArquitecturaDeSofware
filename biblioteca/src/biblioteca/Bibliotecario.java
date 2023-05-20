package biblioteca;


public class Bibliotecario {
    
    private String nombre;
    private String dni;
    private String username;
    private String password;
    
    public Bibliotecario(String nombre, String dni, String username, String password) {
        this.nombre = nombre;
        this.dni = dni;
        this.username = username;
        this.password = password;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword(){
        return username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void realizarPrestamo(Lector lector, CopiaLibro libro) {
        lector.librosEnPrestamo.add(libro);
    }
    
   public void aplicarMulta(Lector lector) {
        int diasRetraso = lector.getDiasRetraso();
        int multa = 0;

        if (diasRetraso > 30) {
            multa = (diasRetraso - 30) * 2;
        }

        System.out.println("Se ha aplicado una multa de " + multa + " días al lector " + lector.getNombre());
    }
    
}
