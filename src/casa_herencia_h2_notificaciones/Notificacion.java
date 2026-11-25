package casa_herencia_h2_notificaciones;

public class Notificacion {
    private String destinatario;
    private String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String generarMensaje() {
        return "Para " + destinatario + ": " + mensaje;
    }

    public String mostrarInformacion() {
        return generarMensaje();
    }
}
