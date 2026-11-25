package casa_herencia_h1_empleados;

// Desafío: agregar ArquitectoSoftware
public class ArquitectoSoftware extends Empleado {
    private int proyectosDirigidos;

    public ArquitectoSoftware(String identificacion, String nombre, double salarioBase, int proyectosDirigidos) {
        super(identificacion, nombre, salarioBase);
        this.proyectosDirigidos = proyectosDirigidos;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.20 + (proyectosDirigidos * 100.0);
    }

    @Override
    public String mostrarInformacion() {
        return "[Arquitecto de Software] " + super.mostrarInformacion()
                + " | Proyectos dirigidos: " + proyectosDirigidos;
    }
}
