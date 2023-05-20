package biblioteca;

import java.util.ArrayList;
import java.util.List;
        
public class Lector {
  
    private String nombre;
    private String dni;
    public int diasRetraso;
    List<CopiaLibro> librosEnPrestamo;
    
    public Lector(String nombre, String dni, int diasRetraso) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasRetraso = 0;
        librosEnPrestamo = new ArrayList<>();
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
    
    public int getDiasRetraso() {
        return diasRetraso;
    }
    
    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }
    
    public List<CopiaLibro> getLibrosEnPrestamo() {
        return librosEnPrestamo;
    }
    
    public void devolverLibro(CopiaLibro copiaLibro) {
        librosEnPrestamo.remove(copiaLibro);
    }

}
