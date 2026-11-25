package guiado_herencia_software;

public class Administrador extends Usuario {
    private int nivelAdministracion;

    public Administrador(String username, String correo) {
        this(username, correo, 1);
    }

    public Administrador(String username, String correo, int nivelAdministracion) {
        super(username, correo);
        this.nivelAdministracion = nivelAdministracion;
    }

    public int getNivelAdministracion() {
        return nivelAdministracion;
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos totales: gestionar usuarios, roles y configuración (Nivel " + nivelAdministracion + ")";
    }

    @Override
    public String mostrarInformacion() {
        return "[Administrador] " + super.mostrarInformacion() + " | Nivel: " + nivelAdministracion;
    }
}
