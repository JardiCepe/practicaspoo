package guiado_arraylist_software;

import java.util.ArrayList;

public class Proyecto {
    // Atributos
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    // Constructor: la variable declarada no crea la lista
    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }

    // Agregación: recibe un objeto que ya existe fuera del proyecto
    public void agregarDesarrollador(Desarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }

    public Desarrollador buscarDesarrollador(String identificacion) {
        for (Desarrollador d : desarrolladores) {
            if (d.getIdentificacion().equals(identificacion)) {
                return d;
            }
        }
        return null;
    }

    public boolean eliminarDesarrollador(String identificacion) {
        Desarrollador encontrado = buscarDesarrollador(identificacion);
        if (encontrado != null) {
            desarrolladores.remove(encontrado);
            return true;
        }
        return false;
    }

    public double calcularTotalHoras() {
        double total = 0;
        for (Desarrollador d : desarrolladores) {
            total += d.getHorasAsignadas();
        }
        return total;
    }

    public String mostrarEquipo() {
        if (desarrolladores.isEmpty()) {
            return "El proyecto \"" + nombre + "\" no tiene desarrolladores.";
        }
        StringBuilder resumen = new StringBuilder("Equipo del proyecto \"" + nombre + "\":\n");
        for (Desarrollador d : desarrolladores) {
            resumen.append("- ").append(d.mostrarInformacion()).append("\n");
        }
        resumen.append("Total de horas asignadas: ").append(calcularTotalHoras());
        return resumen.toString();
    }

    // Desafío adicional
    public Desarrollador obtenerMayorCarga() {
        Desarrollador mayor = null;
        for (Desarrollador d : desarrolladores) {
            if (mayor == null || d.getHorasAsignadas() > mayor.getHorasAsignadas()) {
                mayor = d;
            }
        }
        return mayor;
    }
}
