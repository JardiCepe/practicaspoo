package casa_herencia_h1_empleados;

import java.util.ArrayList;

public class EmpresaSoftware {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public EmpresaSoftware(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null) {
            empleados.add(empleado);
        }
    }

    public Empleado buscarEmpleado(String identificacion) {
        if (identificacion == null) {
            return null;
        }
        for (Empleado e : empleados) {
            if (identificacion.equals(e.getIdentificacion())) {
                return e;
            }
        }
        return null;
    }

    public double calcularTotalBonos() {
        double total = 0.0;
        for (Empleado e : empleados) {
            total += e.calcularBono();
        }
        return total;
    }

    public String mostrarEmpleados() {
        if (empleados.isEmpty()) {
            return "La empresa \"" + nombre + "\" no tiene empleados registrados.";
        }
        StringBuilder sb = new StringBuilder("Empleados de \"" + nombre + "\":\n");
        for (Empleado e : empleados) {
            sb.append("- ").append(e.mostrarInformacion()).append("\n");
        }
        return sb.toString().trim();
    }
}
