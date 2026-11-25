package relaciones_ej2_catalogo;

public class Main {
    public static void main(String[] args) {
        // Los productos existen independientemente antes de crear el catálogo (agregación)
        Producto p1 = new Producto("PR-01", "Teclado Mecánico", 65.0);
        Producto p2 = new Producto("PR-02", "Mouse Inalámbrico", 29.5);
        Producto p3 = new Producto("PR-03", "Monitor 24 pulgadas", 185.0);

        Catalogo catalogo = new Catalogo("Tecnología 2026");
        catalogo.agregarProducto(p1);
        catalogo.agregarProducto(p2);
        catalogo.agregarProducto(p3);

        System.out.println("--- LISTADO DEL CATÁLOGO ---");
        System.out.println(catalogo.listarProductos());

        // Demostración de agregación: los productos siguen existiendo por separado
        catalogo = null;
        System.out.println("\nProducto p1 fuera del catálogo: " + p1.mostrarInformacion());
    }
}
