package guiado_herencia_software;

public class Desarrollador extends Usuario {
    private String lenguajePrincipal;

    public Desarrollador(String username, String correo) {
        this(username, correo, "Java");
    }

    public Desarrollador(String username, String correo, String lenguajePrincipal) {
        super(username, correo);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos de desarrollo: leer/escribir repositorios y desplegar en staging";
    }

    @Override
    public String mostrarInformacion() {
        return "[Desarrollador] " + super.mostrarInformacion() + " | Lenguaje: " + lenguajePrincipal;
    }
}
