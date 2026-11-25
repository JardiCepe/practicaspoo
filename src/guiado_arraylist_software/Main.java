package guiado_arraylist_software;

public class Main {
    public static void main(String[] args) {
        // Paso 1: los desarrolladores se crean antes del proyecto (agregación)
        Desarrollador d1 = new Desarrollador("D01", "Ana", "Backend", 20);
        Desarrollador d2 = new Desarrollador("D02", "Luis", "Frontend", 15);
        Desarrollador d3 = new Desarrollador("D03", "Marta", "Base de datos", 30);

        // Prueba 1: proyecto vacío
        Proyecto proyecto = new Proyecto("Sistema de ventas");
        System.out.println("--- PROYECTO VACÍO ---");
        System.out.println(proyecto.mostrarEquipo());
        System.out.println("Total de horas: " + proyecto.calcularTotalHoras());

        // Prueba 2: agregar los tres desarrolladores existentes
        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);

        System.out.println("\n--- EQUIPO AGREGADO ---");
        System.out.println(proyecto.mostrarEquipo());

        // Prueba 3: buscar existente y no existente
        System.out.println("\n--- BÚSQUEDAS ---");
        Desarrollador encontrado = proyecto.buscarDesarrollador("D02");
        System.out.println("Buscar D02: " + (encontrado != null ? encontrado.mostrarInformacion() : "no encontrado"));
        System.out.println("Buscar D99: " + (proyecto.buscarDesarrollador("D99") != null ? "encontrado" : "no encontrado"));

        // Prueba 4: calcular horas totales (20 + 15 + 30 = 65)
        System.out.println("\nTotal de horas: " + proyecto.calcularTotalHoras());

        // Desafío adicional: mayor carga (Marta, 30)
        Desarrollador mayor = proyecto.obtenerMayorCarga();
        System.out.println("Mayor carga: " + (mayor != null ? mayor.mostrarInformacion() : "sin desarrolladores"));

        // Prueba 5: eliminar existente y no existente
        System.out.println("\n--- ELIMINACIONES ---");
        System.out.println("Eliminar D02: " + proyecto.eliminarDesarrollador("D02"));
        System.out.println("Eliminar D99: " + proyecto.eliminarDesarrollador("D99"));

        System.out.println("\n--- EQUIPO FINAL ---");
        System.out.println(proyecto.mostrarEquipo());

        // El objeto d2 sigue existiendo aunque ya no esté en el proyecto
        System.out.println("\nd2 sigue existiendo fuera del proyecto: " + d2.mostrarInformacion());
    }
}
