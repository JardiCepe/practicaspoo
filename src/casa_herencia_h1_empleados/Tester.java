package casa_herencia_h1_empleados;

public class Tester extends Empleado {
    private String herramientaPruebas;

    public Tester(String identificacion, String nombre, double salarioBase, String herramientaPruebas) {
        super(identificacion, nombre, salarioBase);
        this.herramientaPruebas = herramientaPruebas;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.10;
    }

    @Override
    public String mostrarInformacion() {
        return "[Tester] " + super.mostrarInformacion() + " | Herramienta: " + herramientaPruebas;
    }
}
