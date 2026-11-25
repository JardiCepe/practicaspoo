package guiado_herencia_software;

public class Cliente extends Usuario {
    private String empresa;

    public Cliente(String username, String correo) {
        this(username, correo, "Particular");
    }

    public Cliente(String username, String correo, String empresa) {
        super(username, correo);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos de cliente: consultar avances y reportar solicitudes";
    }

    @Override
    public String mostrarInformacion() {
        return "[Cliente] " + super.mostrarInformacion() + " | Empresa: " + empresa;
    }
}
