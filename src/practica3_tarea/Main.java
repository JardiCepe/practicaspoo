package practica3_tarea;

public class Main {
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        // Asignación con Setters
        tarea1.setTitulo("Configurar base de datos PostgreSQL");
        tarea1.setResponsable("Carlos");
        tarea1.setHorasEstimadas(4.5);
        tarea1.setCompletada(false);

        tarea2.setTitulo("Diseñar interfaces de usuario (UI)");
        tarea2.setResponsable("Ana");
        tarea2.setHorasEstimadas(8.0);
        tarea2.setCompletada(false);

        tarea3.setTitulo("Pruebas unitarias de controladores");
        tarea3.setResponsable("Mateo");
        tarea3.setHorasEstimadas(3.0);
        tarea3.setCompletada(false);

        System.out.println("=== TAREAS ASIGNADAS ===");
        tarea1.mostrarInformacion();
        tarea2.mostrarInformacion();
        tarea3.mostrarInformacion();

        System.out.println("\n=== COMPLETANDO TAREA 1 ===");
        tarea1.completar();

        System.out.println("\n=== CONSULTAS ESPECÍFICAS CON GETTERS ===");
        System.out.println("Tarea: " + tarea1.getTitulo() + " | Estado completada: " + tarea1.isCompletada());
        System.out.println("Tarea: " + tarea2.getTitulo() + " | Responsable: " + tarea2.getResponsable() + " (" + tarea2.getHorasEstimadas() + "h)");
    }
}