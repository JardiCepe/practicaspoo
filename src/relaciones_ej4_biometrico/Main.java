package relaciones_ej4_biometrico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MetodoAutenticacion huella = new HuellaDigital(7, "Índice derecho");
        MetodoAutenticacion facial = new ReconocimientoFacial(9, 99.2);
        MetodoAutenticacion token = new TokenSeguridad(8, "TK-9042");
        MetodoAutenticacion huellaBasica = new HuellaDigital(5, "Pulgar");

        Empleado e1 = new Empleado("EMP-01", "Ana Torres");
        e1.agregarMetodo(huella);
        e1.agregarMetodo(facial);

        Empleado e2 = new Empleado("EMP-02", "Luis Vega");
        e2.agregarMetodo(huellaBasica);
        e2.agregarMetodo(token);

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);

        int umbral = 8;
        System.out.println("--- MÉTODOS DE AUTENTICACIÓN POR EMPLEADO ---");
        for (Empleado e : empleados) {
            System.out.println(e.mostrarMetodos());
            System.out.println("¿Supera umbral de seguridad " + umbral + "?: " + e.tieneMetodoSuperiorA(umbral));
            System.out.println();
        }
    }
}
