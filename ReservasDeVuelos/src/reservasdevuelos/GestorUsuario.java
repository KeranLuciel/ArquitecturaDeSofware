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
        // Solicitar información del nuevo usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese un nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese una contraseña: ");
        String contraseña = scanner.nextLine();

        // Verificar si el nombre de usuario ya existe
        if (buscarUsuario(nombreUsuario) != null) {
            System.out.println("El nombre de usuario ya está en uso. Por favor, elija otro.");
            // Manejar el caso de nombre de usuario duplicado, como mostrar un mensaje de error o permitir al usuario intentarlo nuevamente
        } else {
            // Crear el nuevo usuario y agregarlo a la lista de usuarios
            Usuario nuevoUsuario = new Usuario(nombre, apellido, nombreUsuario, contraseña);
            usuarios.add(nuevoUsuario);
            System.out.println("Registro exitoso.");
            // Realizar acciones adicionales después de registrar, si es necesario
        }
    }
    
    @Override
    public void iniciarSesion() {
        // Solicitar credenciales al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        // Buscar el usuario en la lista de usuarios
        Usuario usuarioEncontrado = buscarUsuario(nombreUsuario);

        // Verificar si se encontró el usuario y si la contraseña es correcta
        if (usuarioEncontrado != null && usuarioEncontrado.getContraseña().equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso.");
            // Realizar acciones adicionales después de iniciar sesión, si es necesario
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
            // Manejar el caso de inicio de sesión fallido, como mostrar un mensaje de error o permitir al usuario intentarlo nuevamente
        }
    }
    
    private Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreusuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;// Si no se encuentra el usuario, se retorna null
    }
}