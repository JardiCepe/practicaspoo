package practica2_modulo;

public class Main {
    public static void main(String[] args) {
        Modulo login = new Modulo();
        Modulo inventario = new Modulo();
        Modulo reportes = new Modulo();

        // Modificando mediante Setters
        login.setNombre("Login y Autenticación");
        login.setLenguaje("Java");
        login.setVersion("1.0.0");
        login.setTerminado(false);

        inventario.setNombre("Gestión de Inventario");
        inventario.setLenguaje("Java");
        inventario.setVersion("0.5.2");
        inventario.setTerminado(false);

        reportes.setNombre("Generación de Reportes PDF");
        reportes.setLenguaje("Python");
        reportes.setVersion("0.1.0");
        reportes.setTerminado(false);

        System.out.println("=== ESTADO INICIAL ===");
        login.mostrarEstado();
        inventario.mostrarEstado();

        System.out.println("\n=== FINALIZACIÓN DE MÓDULO ===");
        login.marcarTerminado();

        System.out.println("\n=== CONSULTANDO CON GETTERS ===");
        System.out.println("Módulo: " + login.getNombre() + " | Finalizado: " + login.isTerminado());
        System.out.println("Módulo: " + inventario.getNombre() + " | Finalizado: " + inventario.isTerminado());
    }
}