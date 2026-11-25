package casa_arraylist_l2_empresa;

import java.util.ArrayList;

public class EmpresaSoftware {
    private String nombre;
    private ArrayList<Proyecto> proyectos;

    public EmpresaSoftware(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    // Agregación: recibe un Proyecto creado externamente
    public void agregarProyecto(Proyecto proyecto) {
        if (proyecto != null) {
            proyectos.add(proyecto);
        }
    }

    public Proyecto buscarProyecto(String nombreProyecto) {
        if (nombreProyecto == null) {
            return null;
        }
        for (Proyecto p : proyectos) {
            if (nombreProyecto.equals(p.getNombre())) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProyecto(String nombreProyecto) {
        Proyecto encontrado = buscarProyecto(nombreProyecto);
        if (encontrado != null) {
            proyectos.remove(encontrado);
            return true;
        }
        return false;
    }

    public double calcularPresupuestoTotal() {
        double total = 0.0;
        for (Proyecto p : proyectos) {
            total += p.getPresupuesto();
        }
        return total;
    }

    public String mostrarProyectos() {
        if (proyectos.isEmpty()) {
            return "La empresa \"" + nombre + "\" no tiene proyectos asignados.";
        }
        StringBuilder sb = new StringBuilder("Proyectos de \"" + nombre + "\":\n");
        for (Proyecto p : proyectos) {
            sb.append("- ").append(p.mostrarInformacion()).append("\n");
        }
        return sb.toString().trim();
    }

    // Desafío: proyecto de mayor presupuesto
    public Proyecto obtenerProyectoMayorPresupuesto() {
        Proyecto mayor = null;
        for (Proyecto p : proyectos) {
            if (mayor == null || p.getPresupuesto() > mayor.getPresupuesto()) {
                mayor = p;
            }
        }
        return mayor;
    }
}
