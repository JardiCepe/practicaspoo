package guiado_arreglos_software;

public class Main {
    public static void main(String[] args) {
        // Paso 1: Crear 5 módulos independientes del analizador
        Modulo[] modulos = new Modulo[5];
        modulos[0] = new Modulo("Autenticación", "Java", 100, true);
        modulos[1] = new Modulo("Inventario", "Java", 75, false);
        modulos[2] = new Modulo("Facturación", "Java", 100, true);
        modulos[3] = new Modulo("Reportes", "SQL", 40, false);
        modulos[4] = new Modulo("Notificaciones", "Java", 20, false);

        // Paso 2: Asociación con AnalizadorProyecto
        AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);

        System.out.println("--- LISTA DE MÓDULOS ---");
        System.out.println(analizador.listarModulos());

        System.out.println("\n--- MÉTRICAS DEL PROYECTO ---");
        System.out.println("Módulos terminados: " + analizador.contarTerminados());
        System.out.println("Progreso promedio: " + analizador.calcularProgresoPromedio() + "%");

        System.out.println("\n--- BÚSQUEDAS ---");
        Modulo encontrado = analizador.buscarModulo("Autenticación");
        System.out.println("Buscar Autenticación: "
                + (encontrado != null ? encontrado.mostrarInformacion() : "No encontrado"));

        Modulo inexistente = analizador.buscarModulo("Pagos");
        System.out.println("Buscar Pagos: "
                + (inexistente != null ? inexistente.mostrarInformacion() : "No encontrado"));

        // Desafío adicional
        Modulo menor = analizador.obtenerMenorProgreso();
        System.out.println("\n--- DESAFÍO: MENOR PROGRESO ---");
        System.out.println(menor != null ? menor.mostrarInformacion() : "Sin módulos");
    }
}
