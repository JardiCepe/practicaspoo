package relaciones_ej7_proveedores;

public class ProveedorPasarelasPago extends Proveedor {
    private double comisionPorcentaje;

    public ProveedorPasarelasPago(String nombre, String pais, double comisionPorcentaje) {
        super(nombre, pais);
        this.comisionPorcentaje = comisionPorcentaje;
    }

    @Override
    public String getTipoServicio() {
        return "Pasarela de Pago";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Comisión: " + comisionPorcentaje + "%";
    }
}
