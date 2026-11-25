package casa_herencia_h1_empleados;

public class Programador extends Empleado {
    private String lenguaje;

    public Programador(String identificacion, String nombre, double salarioBase, String lenguaje) {
        super(identificacion, nombre, salarioBase);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.15;
    }

    @Override
    public String mostrarInformacion() {
        return "[Programador] " + super.mostrarInformacion() + " | Lenguaje: " + lenguaje;
    }
}
