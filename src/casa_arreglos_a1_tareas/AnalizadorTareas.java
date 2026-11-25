package casa_arreglos_a1_tareas;

public class AnalizadorTareas {
    private Tarea[] tareas;

    public AnalizadorTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    public String listarTareas() {
        if (tareas == null || tareas.length == 0) {
            return "No hay tareas registradas.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                sb.append("- ").append(tareas[i].mostrarInformacion()).append("\n");
            }
        }
        return sb.length() == 0 ? "No hay tareas registradas." : sb.toString().trim();
    }

    public int contarCompletadas() {
        if (tareas == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null && tareas[i].isCompletada()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularHorasTotales() {
        if (tareas == null) {
            return 0.0;
        }
        double total = 0.0;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                total += tareas[i].getHorasEstimadas();
            }
        }
        return total;
    }

    public Tarea buscarPorCodigo(String codigo) {
        if (tareas == null || codigo == null) {
            return null;
        }
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null && codigo.equals(tareas[i].getCodigo())) {
                return tareas[i];
            }
        }
        return null;
    }

    public Tarea obtenerTareaMayorDuracion() {
        if (tareas == null) {
            return null;
        }
        Tarea mayor = null;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                if (mayor == null || tareas[i].getHorasEstimadas() > mayor.getHorasEstimadas()) {
                    mayor = tareas[i];
                }
            }
        }
        return mayor;
    }

    // Desafío: porcentaje de tareas completadas
    public double calcularPorcentajeCompletadas() {
        if (tareas == null) {
            return 0.0;
        }
        int totalValidas = 0;
        int completadas = 0;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                totalValidas++;
                if (tareas[i].isCompletada()) {
                    completadas++;
                }
            }
        }
        if (totalValidas == 0) {
            return 0.0;
        }
        return (completadas * 100.0) / totalValidas;
    }
}
