package casa_herencia_h2_notificaciones;

public class Main {
    public static void main(String[] args) {
        Notificacion n1 = new NotificacionEmail("ana@empresa.com", "Despliegue exitoso", "La versión 2.0 está en producción.");
        Notificacion n2 = new NotificacionSMS("Luis Pérez", "+593991234567", "Código de verificación: 482910");
        Notificacion n3 = new NotificacionPush("marta_dev", "DevTracker", "Se te asignó una nueva tarea.");
        // Desafío: NotificacionSlack
        Notificacion n4 = new NotificacionSlack("equipo-backend", "alertas-prod", "Uso de CPU superó el 85%.");

        GestorNotificaciones gestor = new GestorNotificaciones();
        gestor.agregarNotificacion(n1);
        gestor.agregarNotificacion(n2);
        gestor.agregarNotificacion(n3);
        gestor.agregarNotificacion(n4);

        System.out.println("--- MENSAJES GENERADOS INDIVIDUALMENTE ---");
        System.out.println(n1.generarMensaje());
        System.out.println(n2.generarMensaje());
        System.out.println(n3.generarMensaje());
        System.out.println(n4.generarMensaje());

        System.out.println("\n--- LISTADO DESDE GESTOR ---");
        System.out.println(gestor.listarNotificaciones());
    }
}
