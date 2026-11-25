package casa_arraylist_l1_sprint;

import java.util.ArrayList;

public class Sprint {
    private String nombre;
    private ArrayList<Tarea> tareas;

    public Sprint(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    // Composición: el Sprint crea internamente las tareas
    // Desafío: impide códigos duplicados
    public boolean crearTarea(String codigo, String titulo, double horas) {
        if (codigo == null || buscarTarea(codigo) != null) {
            return false;
        }
        tareas.add(new Tarea(codigo, titulo, horas));
        return true;
    }

    public Tarea buscarTarea(String codigo) {
        if (codigo == null) {
            return null;
        }
        for (Tarea t : tareas) {
            if (codigo.equals(t.getCodigo())) {
                return t;
            }
        }
        return null;
    }

    public boolean completarTarea(String codigo) {
        Tarea encontrada = buscarTarea(codigo);
        if (encontrada != null) {
            encontrada.setCompletada(true);
            return true;
        }
        return false;
    }

    public int contarCompletadas() {
        int contador = 0;
        for (Tarea t : tareas) {
            if (t.isCompletada()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularHorasPendientes() {
        double total = 0.0;
        for (Tarea t : tareas) {
            if (!t.isCompletada()) {
                total += t.getHoras();
            }
        }
        return total;
    }

    public String mostrarTareas() {
        if (tareas.isEmpty()) {
            return "El sprint \"" + nombre + "\" no tiene tareas registradas.";
        }
        StringBuilder sb = new StringBuilder("Tareas del sprint \"" + nombre + "\":\n");
        for (Tarea t : tareas) {
            sb.append("- ").append(t.mostrarInformacion()).append("\n");
        }
        return sb.toString().trim();
    }
}
