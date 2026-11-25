package casa_herencia_h1_empleados;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Programador("EMP-01", "Carlos", 2000.0, "Java");
        Empleado e2 = new Tester("EMP-02", "Lucía", 1600.0, "Selenium");
        Empleado e3 = new Disenador("EMP-03", "Sofía", 1800.0, "UX/UI Móvil");
        // Desafío: ArquitectoSoftware
        Empleado e4 = new ArquitectoSoftware("EMP-04", "Andrés", 3000.0, 3);

        EmpresaSoftware empresa = new EmpresaSoftware("InnovaSoft");
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);

        System.out.println("--- BONOS INDIVIDUALES ---");
        System.out.println(e1.getNombre() + " (Programador): $" + e1.calcularBono());
        System.out.println(e2.getNombre() + " (Tester): $" + e2.calcularBono());
        System.out.println(e3.getNombre() + " (Diseñador): $" + e3.calcularBono());
        System.out.println(e4.getNombre() + " (Arquitecto): $" + e4.calcularBono());

        System.out.println("\n--- LISTADO POLIMÓRFICO ---");
        System.out.println(empresa.mostrarEmpleados());

        System.out.println("\n--- TOTAL DE BONOS ---");
        System.out.println("Total a pagar en bonos: $" + empresa.calcularTotalBonos());
    }
}
