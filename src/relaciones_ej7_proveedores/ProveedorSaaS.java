package relaciones_ej7_proveedores;

public class ProveedorSaaS extends Proveedor {
    private String productoPrincipal;

    public ProveedorSaaS(String nombre, String pais, String productoPrincipal) {
        super(nombre, pais);
        this.productoPrincipal = productoPrincipal;
    }

    @Override
    public String getTipoServicio() {
        return "SaaS";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Producto: " + productoPrincipal;
    }
}
