package casa_arreglos_a3_versiones;

public class Main {
    public static void main(String[] args) {
        VersionSoftware[] versiones = new VersionSoftware[5];
        versiones[0] = new VersionSoftware("1.0.0", "2026-09-01", true, 25);
        versiones[1] = new VersionSoftware("1.1.0-beta", "2026-09-15", false, 14);
        versiones[2] = new VersionSoftware("1.1.0", "2026-10-01", true, 18);
        versiones[3] = new VersionSoftware("2.0.0-rc1", "2026-10-20", false, 42);
        versiones[4] = new VersionSoftware("2.0.0", "2026-11-05", true, 31);

        AnalizadorVersiones analizador = new AnalizadorVersiones(versiones);

        System.out.println("--- RESUMEN DE VERSIONES ---");
        System.out.println("Versiones estables: " + analizador.contarEstables());
        System.out.println("Total de cambios: " + analizador.sumarCambios());
        System.out.println("Promedio de cambios (Desafío): " + analizador.calcularPromedioCambios());

        System.out.println("\n--- BÚSQUEDAS ---");
        VersionSoftware vBuscada = analizador.buscarVersion("1.1.0");
        System.out.println("Buscar 1.1.0: " + (vBuscada != null ? vBuscada.mostrarInformacion() : "No encontrada"));
        VersionSoftware vInexistente = analizador.buscarVersion("9.9.9");
        System.out.println("Buscar 9.9.9: " + (vInexistente != null ? vInexistente.mostrarInformacion() : "No encontrada"));

        System.out.println("\n--- VERSIÓN CON MÁS CAMBIOS ---");
        VersionSoftware masCambios = analizador.obtenerVersionMasCambios();
        System.out.println(masCambios != null ? masCambios.mostrarInformacion() : "Sin versiones");
    }
}
