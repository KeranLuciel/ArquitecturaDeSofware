package biblioteca;

public class Libro {

    private String titulo;
    private String tipo;
    private String editorial;
    private int año;
    private Autor autor;
    
    public Libro(String titulo, String tipo, String editorial, int año, Autor autor){
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.año = año;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public int getAño() {
        return año;
    }

    public void setAnio(int año) {
        this.año = año;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
