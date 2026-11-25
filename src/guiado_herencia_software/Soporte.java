package guiado_herencia_software;

// Desafío adicional: agregar Soporte sin modificar SistemaUsuarios
public class Soporte extends Usuario {
    private String turno;

    public Soporte(String username, String correo) {
        this(username, correo, "Diurno");
    }

    public Soporte(String username, String correo, String turno) {
        super(username, correo);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos de soporte: atender tickets, revisar logs y reiniciar servicios";
    }

    @Override
    public String mostrarInformacion() {
        return "[Soporte] " + super.mostrarInformacion() + " | Turno: " + turno;
    }
}
