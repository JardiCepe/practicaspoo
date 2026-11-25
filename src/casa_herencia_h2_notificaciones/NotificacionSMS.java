package casa_herencia_h2_notificaciones;

public class NotificacionSMS extends Notificacion {
    private String numeroTelefono;

    public NotificacionSMS(String destinatario, String numeroTelefono, String mensaje) {
        super(destinatario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public String generarMensaje() {
        return "[SMS] Tel: " + numeroTelefono + " (" + getDestinatario() + ") -> " + getMensaje();
    }
}
