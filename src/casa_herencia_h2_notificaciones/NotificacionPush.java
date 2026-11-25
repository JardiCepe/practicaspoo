package casa_herencia_h2_notificaciones;

public class NotificacionPush extends Notificacion {
    private String tituloApp;

    public NotificacionPush(String destinatario, String tituloApp, String mensaje) {
        super(destinatario, mensaje);
        this.tituloApp = tituloApp;
    }

    public String getTituloApp() {
        return tituloApp;
    }

    @Override
    public String generarMensaje() {
        return "[PUSH - " + tituloApp + "] @" + getDestinatario() + ": " + getMensaje();
    }
}
