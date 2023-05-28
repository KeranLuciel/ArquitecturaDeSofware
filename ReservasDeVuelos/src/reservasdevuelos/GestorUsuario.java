package reservasdevuelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorUsuario implements Principal{
    
    private List<Usuario> usuarios;
    
    public GestorUsuario(){
        usuarios = new ArrayList<>();
    }
    
    @Override
    public void registrar() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese un nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese una contraseña: ");
        String contraseña = scanner.nextLine();
        
        if (buscarUsuario(nombreUsuario) != null) {
            System.out.println("El nombre de usuario ya está en uso. Por favor, elija otro.");
            
        } else {
            
            Usuario nuevoUsuario = new Usuario(nombre, apellido, nombreUsuario, contraseña);
            usuarios.add(nuevoUsuario);
            System.out.println("Registro exitoso.");
            
        }
    }
    
    @Override
    public void iniciarSesion() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();
        
        Usuario usuarioEncontrado = buscarUsuario(nombreUsuario);
        
        if (usuarioEncontrado != null && usuarioEncontrado.getContraseña().equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso.");
            
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
            
        }
    }
    
    private Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreusuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }
}