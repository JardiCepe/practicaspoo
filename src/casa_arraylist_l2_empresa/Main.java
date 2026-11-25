package casa_arraylist_l2_empresa;

public class Main {
    public static void main(String[] args) {
        // Los proyectos existen independientemente antes de la empresa (agregación)
        Proyecto p1 = new Proyecto("Portal Web", "Banco Norte", 15000.0);
        Proyecto p2 = new Proyecto("App Delivery", "FastFood", 24000.0);
        Proyecto p3 = new Proyecto("ERP Inventario", "Comercial Sur", 32000.0);
        Proyecto p4 = new Proyecto("Chatbot Soporte", "Telecom Plus", 12500.0);

        EmpresaSoftware empresa = new EmpresaSoftware("DevSolutions S.A.");
        empresa.agregarProyecto(p1);
        empresa.agregarProyecto(p2);
        empresa.agregarProyecto(p3);
        empresa.agregarProyecto(p4);

        System.out.println("--- PROYECTOS REGISTRADOS ---");
        System.out.println(empresa.mostrarProyectos());
        System.out.println("Presupuesto total: $" + empresa.calcularPresupuestoTotal());

        System.out.println("\n--- BÚSQUEDAS ---");
        Proyecto encontrado = empresa.buscarProyecto("App Delivery");
        System.out.println("Buscar App Delivery: "
                + (encontrado != null ? encontrado.mostrarInformacion() : "No encontrado"));
        System.out.println("Buscar Inexistente: "
                + (empresa.buscarProyecto("Inexistente") != null ? "Encontrado" : "No encontrado"));

        // Desafío
        System.out.println("\n--- DESAFÍO: MAYOR PRESUPUESTO ---");
        Proyecto mayor = empresa.obtenerProyectoMayorPresupuesto();
        System.out.println(mayor != null ? mayor.mostrarInformacion() : "Sin proyectos");

        System.out.println("\n--- ELIMINAR PROYECTO ---");
        System.out.println("Eliminar Portal Web: " + empresa.eliminarProyecto("Portal Web"));
        System.out.println("Eliminar Desconocido: " + empresa.eliminarProyecto("Desconocido"));

        System.out.println("\n--- PROYECTOS RESTANTES ---");
        System.out.println(empresa.mostrarProyectos());
        System.out.println("Nuevo presupuesto total: $" + empresa.calcularPresupuestoTotal());
        System.out.println("p1 sigue existiendo fuera de la empresa: " + p1.mostrarInformacion());
    }
}
