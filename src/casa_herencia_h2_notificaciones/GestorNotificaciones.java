package casa_herencia_h2_notificaciones;

import java.util.ArrayList;

public class GestorNotificaciones {
    private ArrayList<Notificacion> notificaciones;

    public GestorNotificaciones() {
        this.notificaciones = new ArrayList<>();
    }

    public void agregarNotificacion(Notificacion notificacion) {
        if (notificacion != null) {
            notificaciones.add(notificacion);
        }
    }

    public String listarNotificaciones() {
        if (notificaciones.isEmpty()) {
            return "No hay notificaciones registradas.";
        }
        StringBuilder sb = new StringBuilder();
        for (Notificacion n : notificaciones) {
            sb.append("- ").append(n.generarMensaje()).append("\n");
        }
        return sb.toString().trim();
    }
}
