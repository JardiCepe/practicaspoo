package guiado_herencia_software;

public class Usuario {
    private String username;
    private String correo;

    public Usuario(String username, String correo) {
        this.username = username;
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public String getCorreo() {
        return correo;
    }

    public String obtenerPermisos() {
        return "Permisos básicos de lectura";
    }

    public String mostrarInformacion() {
        return "Usuario: " + username + " | Correo: " + correo;
    }
}
