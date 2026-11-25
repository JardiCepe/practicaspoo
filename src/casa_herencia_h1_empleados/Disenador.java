package casa_herencia_h1_empleados;

public class Disenador extends Empleado {
    private String especialidadUI;

    public Disenador(String identificacion, String nombre, double salarioBase, String especialidadUI) {
        super(identificacion, nombre, salarioBase);
        this.especialidadUI = especialidadUI;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.12;
    }

    @Override
    public String mostrarInformacion() {
        return "[Diseñador] " + super.mostrarInformacion() + " | Especialidad: " + especialidadUI;
    }
}
