package relaciones_ej5_robots;

import java.util.ArrayList;

public abstract class Robot {
    private String id;
    private ArrayList<String> tareas;
    // Composición: ModuloEnergia nace dentro del constructor y no existe sin el robot
    private ModuloEnergia moduloEnergia;

    public Robot(String id, String tipoBateria, int capacidadBateria) {
        this.id = id;
        this.tareas = new ArrayList<>();
        this.moduloEnergia = new ModuloEnergia(tipoBateria, capacidadBateria);
    }

    public String getId() {
        return id;
    }

    public ModuloEnergia getModuloEnergia() {
        return moduloEnergia;
    }

    public void agregarTarea(String tarea) {
        if (tarea != null && !tarea.trim().isEmpty()) {
            tareas.add(tarea);
        }
    }

    public boolean puedeCompletarTarea(int costoEnergetico) {
        return moduloEnergia.tieneCapacidadSuficiente(costoEnergetico);
    }

    public String listarTareas() {
        if (tareas.isEmpty()) {
            return "El robot " + id + " no tiene tareas pendientes.";
        }
        StringBuilder sb = new StringBuilder("Tareas pendientes de " + id + ":\n");
        for (String t : tareas) {
            sb.append("- ").append(t).append("\n");
        }
        return sb.toString().trim();
    }

    public abstract String obtenerTipo();

    public String mostrarInformacion() {
        return "[" + obtenerTipo() + "] ID: " + id + " | Energía: " + moduloEnergia.mostrarInformacion();
    }
}
