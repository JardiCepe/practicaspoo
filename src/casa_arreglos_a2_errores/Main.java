package casa_arreglos_a2_errores;

public class Main {
    public static void main(String[] args) {
        ErrorSoftware[] errores = new ErrorSoftware[7];
        errores[0] = new ErrorSoftware("E01", "Error de conexión a BD", "ALTA", true);
        errores[1] = new ErrorSoftware("E02", "NullPointer al guardar factura", "ALTA", false);
        errores[2] = new ErrorSoftware("E03", "Botón desalineado en móvil", "BAJA", false);
        errores[3] = new ErrorSoftware("E04", "Lentitud en reporte mensual", "MEDIA", false);
        errores[4] = new ErrorSoftware("E05", "Validación de correo incompleta", "MEDIA", true);
        errores[5] = new ErrorSoftware("E06", "Fuga de memoria en caché", "ALTA", false);
        errores[6] = new ErrorSoftware("E07", "Texto cortado en footer", "BAJA", true);

        AnalizadorErrores analizador = new AnalizadorErrores(errores);

        System.out.println("--- MÉTRICAS DE ERRORES ---");
        System.out.println("Errores pendientes: " + analizador.contarPendientes());
        System.out.println("Cantidad ALTA: " + analizador.contarPorSeveridad("ALTA"));
        System.out.println("Cantidad MEDIA: " + analizador.contarPorSeveridad("MEDIA"));
        System.out.println("Cantidad BAJA: " + analizador.contarPorSeveridad("BAJA"));

        System.out.println("\n--- LISTADO SEVERIDAD ALTA ---");
        System.out.println(analizador.listarPorSeveridad("ALTA"));

        System.out.println("\n--- LISTADO SEVERIDAD MEDIA ---");
        System.out.println(analizador.listarPorSeveridad("MEDIA"));

        System.out.println("\n--- BÚSQUEDAS ---");
        ErrorSoftware encontrado = analizador.buscarPorCodigo("E04");
        System.out.println("Buscar E04: " + (encontrado != null ? encontrado.mostrarInformacion() : "No encontrado"));
        ErrorSoftware noExiste = analizador.buscarPorCodigo("E99");
        System.out.println("Buscar E99: " + (noExiste != null ? noExiste.mostrarInformacion() : "No encontrado"));

        System.out.println("\n--- DESAFÍO: PRIMER PENDIENTE ALTA ---");
        ErrorSoftware pendienteAlta = analizador.obtenerPrimerPendienteAlta();
        System.out.println(pendienteAlta != null ? pendienteAlta.mostrarInformacion() : "No hay pendientes ALTA");
    }
}
