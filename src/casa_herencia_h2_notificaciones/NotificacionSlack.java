package casa_herencia_h2_notificaciones;

// Desafío: agregar NotificacionSlack
public class NotificacionSlack extends Notificacion {
    private String canal;

    public NotificacionSlack(String destinatario, String canal, String mensaje) {
        super(destinatario, mensaje);
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    @Override
    public String generarMensaje() {
        return "[SLACK #" + canal + "] @" + getDestinatario() + " -> " + getMensaje();
    }
}
