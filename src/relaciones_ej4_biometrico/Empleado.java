package relaciones_ej4_biometrico;

import java.util.ArrayList;

public class Empleado {
    private String identificacion;
    private String nombre;
    // Agregación: Empleado agrupa métodos creados fuera
    private ArrayList<MetodoAutenticacion> metodos;

    public Empleado(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.metodos = new ArrayList<>();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMetodo(MetodoAutenticacion metodo) {
        if (metodo != null) {
            metodos.add(metodo);
        }
    }

    public boolean tieneMetodoSuperiorA(int umbral) {
        for (MetodoAutenticacion m : metodos) {
            if (m.getNivelSeguridad() > umbral) {
                return true;
            }
        }
        return false;
    }

    public String mostrarMetodos() {
        if (metodos.isEmpty()) {
            return "El empleado " + nombre + " no tiene métodos de autenticación asignados.";
        }
        StringBuilder sb = new StringBuilder("Métodos de " + nombre + " (" + identificacion + "):\n");
        for (MetodoAutenticacion m : metodos) {
            sb.append("- ").append(m.mostrarInformacion())
              .append(" -> ").append(m.autenticar()).append("\n");
        }
        return sb.toString().trim();
    }
}
