package relaciones_ej7_proveedores;

import java.util.ArrayList;

public abstract class Proveedor {
    private String nombre;
    private String pais;
    // Composición: los contratos pertenecen al ciclo de vida del proveedor
    private ArrayList<Contrato> contratos;

    public Proveedor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.contratos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public Contrato crearContrato(String nombreCliente, double precio, int duracionMeses) {
        Contrato contrato = new Contrato(nombreCliente, precio, duracionMeses);
        contratos.add(contrato);
        return contrato;
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public abstract String getTipoServicio();

    public String mostrarInformacion() {
        return "[" + getTipoServicio() + "] " + nombre + " (" + pais + ")";
    }
}
