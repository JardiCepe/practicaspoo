package casa_herencia_h2_notificaciones;

public class NotificacionEmail extends Notificacion {
    private String asunto;

    public NotificacionEmail(String destinatario, String asunto, String mensaje) {
        super(destinatario, mensaje);
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }

    @Override
    public String generarMensaje() {
        return "[EMAIL] Para: " + getDestinatario() + " | Asunto: " + asunto + " | Cuerpo: " + getMensaje();
    }
}
