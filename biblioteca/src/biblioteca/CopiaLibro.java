package biblioteca;

public class CopiaLibro {

    private int identificador;
    private String estado;
    
    public CopiaLibro(int identificador, String estado){
        this.identificador = identificador;
        this.estado = estado;
    }
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
