package casa_arraylist_l1_sprint;

public class Main {
    public static void main(String[] args) {
        Sprint sprint = new Sprint("Sprint 1 - Módulo Seguridad");

        System.out.println("--- CREACIÓN DE TAREAS (COMPOSICIÓN) ---");
        System.out.println("Crear TAR-01: " + sprint.crearTarea("TAR-01", "Diseñar login", 4.0));
        System.out.println("Crear TAR-02: " + sprint.crearTarea("TAR-02", "Validar tokens JWT", 6.0));
        System.out.println("Crear TAR-03: " + sprint.crearTarea("TAR-03", "Encriptar contraseñas", 3.5));
        System.out.println("Crear TAR-04: " + sprint.crearTarea("TAR-04", "Recuperación de clave", 5.0));
        System.out.println("Crear TAR-05: " + sprint.crearTarea("TAR-05", "Pruebas de seguridad", 4.5));

        // Desafío: intentar registrar código duplicado
        System.out.println("Crear duplicada TAR-02: " + sprint.crearTarea("TAR-02", "Duplicada", 2.0));

        System.out.println("\n--- COMPLETAR TAREAS ---");
        System.out.println("Completar TAR-01: " + sprint.completarTarea("TAR-01"));
        System.out.println("Completar TAR-03: " + sprint.completarTarea("TAR-03"));
        System.out.println("Completar TAR-99: " + sprint.completarTarea("TAR-99"));

        System.out.println("\n--- BÚSQUEDAS ---");
        Tarea buscada = sprint.buscarTarea("TAR-02");
        System.out.println("Buscar TAR-02: " + (buscada != null ? buscada.mostrarInformacion() : "No encontrada"));
        System.out.println("Buscar TAR-99: " + (sprint.buscarTarea("TAR-99") != null ? "Encontrada" : "No encontrada"));

        System.out.println("\n--- MÉTRICAS DEL SPRINT ---");
        System.out.println("Tareas completadas: " + sprint.contarCompletadas());
        System.out.println("Horas pendientes: " + sprint.calcularHorasPendientes());

        System.out.println("\n--- LISTADO DE TAREAS ---");
        System.out.println(sprint.mostrarTareas());
    }
}
