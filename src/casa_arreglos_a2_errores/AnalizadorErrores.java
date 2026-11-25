package casa_arreglos_a2_errores;

public class AnalizadorErrores {
    private ErrorSoftware[] errores;

    public AnalizadorErrores(ErrorSoftware[] errores) {
        this.errores = errores;
    }

    public int contarPendientes() {
        if (errores == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && !errores[i].isResuelto()) {
                contador++;
            }
        }
        return contador;
    }

    public ErrorSoftware buscarPorCodigo(String codigo) {
        if (errores == null || codigo == null) {
            return null;
        }
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && codigo.equals(errores[i].getCodigo())) {
                return errores[i];
            }
        }
        return null;
    }

    public String listarPorSeveridad(String severidad) {
        if (errores == null || severidad == null) {
            return "No hay errores con severidad " + severidad + ".";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && severidad.equals(errores[i].getSeveridad())) {
                sb.append("- ").append(errores[i].mostrarInformacion()).append("\n");
            }
        }
        if (sb.length() == 0) {
            return "No hay errores con severidad " + severidad + ".";
        }
        return sb.toString().trim();
    }

    public int contarPorSeveridad(String severidad) {
        if (errores == null || severidad == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && severidad.equals(errores[i].getSeveridad())) {
                contador++;
            }
        }
        return contador;
    }

    // Desafío: primer error pendiente de severidad ALTA
    public ErrorSoftware obtenerPrimerPendienteAlta() {
        if (errores == null) {
            return null;
        }
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && !errores[i].isResuelto() && "ALTA".equals(errores[i].getSeveridad())) {
                return errores[i];
            }
        }
        return null;
    }
}
