package casa_arreglos_a1_tareas;

public class Main {
    public static void main(String[] args) {
        Tarea[] tareas = new Tarea[6];
        tareas[0] = new Tarea("T01", "Diseñar base de datos", 6.5, true);
        tareas[1] = new Tarea("T02", "Crear API de usuarios", 8.0, false);
        tareas[2] = new Tarea("T03", "Implementar login JWT", 5.0, true);
        tareas[3] = new Tarea("T04", "Construir interfaz principal", 12.0, false);
        tareas[4] = new Tarea("T05", "Escribir pruebas unitarias", 4.5, false);
        tareas[5] = new Tarea("T06", "Configurar despliegue", 3.0, false);

        // Marcar una tarea adicional como completada mediante setter
        tareas[4].setCompletada(true);

        AnalizadorTareas analizador = new AnalizadorTareas(tareas);

        System.out.println("--- TAREAS DEL SPRINT ---");
        System.out.println(analizador.listarTareas());

        System.out.println("\n--- RESUMEN ---");
        System.out.println("Tareas completadas: " + analizador.contarCompletadas());
        System.out.println("Horas totales estimadas: " + analizador.calcularHorasTotales());
        System.out.println("Porcentaje completado (Desafío): " + analizador.calcularPorcentajeCompletadas() + "%");

        System.out.println("\n--- BÚSQUEDAS ---");
        Tarea tBuscada = analizador.buscarPorCodigo("T02");
        System.out.println("Buscar T02: " + (tBuscada != null ? tBuscada.mostrarInformacion() : "No encontrada"));
        Tarea tInexistente = analizador.buscarPorCodigo("T99");
        System.out.println("Buscar T99: " + (tInexistente != null ? tInexistente.mostrarInformacion() : "No encontrada"));

        System.out.println("\n--- TAREA DE MAYOR DURACIÓN ---");
        Tarea mayor = analizador.obtenerTareaMayorDuracion();
        System.out.println(mayor != null ? mayor.mostrarInformacion() : "No hay tareas");
    }
}
