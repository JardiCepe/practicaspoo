package relaciones_ej7_proveedores;

public class ProveedorCloud extends Proveedor {
    private String regionPrincipal;

    public ProveedorCloud(String nombre, String pais, String regionPrincipal) {
        super(nombre, pais);
        this.regionPrincipal = regionPrincipal;
    }

    @Override
    public String getTipoServicio() {
        return "Cloud";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Región: " + regionPrincipal;
    }
}
