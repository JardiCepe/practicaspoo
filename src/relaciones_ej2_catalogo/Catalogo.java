package relaciones_ej2_catalogo;

import java.util.ArrayList;

public class Catalogo {
    private String nombre;
    // Agregación: los productos se crean fuera y pueden existir sin el catálogo
    private ArrayList<Producto> productos;

    public Catalogo(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
        }
    }

    public String listarProductos() {
        if (productos.isEmpty()) {
            return "El catálogo \"" + nombre + "\" no tiene productos.";
        }
        StringBuilder sb = new StringBuilder("Catálogo \"" + nombre + "\":\n");
        for (Producto p : productos) {
            sb.append("- ").append(p.mostrarInformacion()).append("\n");
        }
        return sb.toString().trim();
    }
}
