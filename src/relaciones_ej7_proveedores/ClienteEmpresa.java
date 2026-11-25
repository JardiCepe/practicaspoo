package relaciones_ej7_proveedores;

import java.util.ArrayList;

public class ClienteEmpresa {
    private String nombre;
    // Asociación: el cliente se asocia con proveedores existentes
    private ArrayList<Proveedor> proveedoresContratados;

    public ClienteEmpresa(String nombre) {
        this.nombre = nombre;
        this.proveedoresContratados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void contratarProveedor(Proveedor proveedor, double precio, int duracionMeses) {
        if (proveedor != null) {
            if (!proveedoresContratados.contains(proveedor)) {
                proveedoresContratados.add(proveedor);
            }
            proveedor.crearContrato(this.nombre, precio, duracionMeses);
        }
    }

    public boolean tieneProveedorDeTipo(Class<? extends Proveedor> tipo) {
        if (tipo == null) {
            return false;
        }
        for (Proveedor p : proveedoresContratados) {
            if (tipo.isInstance(p)) {
                return true;
            }
        }
        return false;
    }

    public String listarContratosActivos() {
        StringBuilder sb = new StringBuilder("Contratos activos de \"" + nombre + "\":\n");
        boolean hayActivos = false;
        for (Proveedor p : proveedoresContratados) {
            for (Contrato c : p.getContratos()) {
                if (c.isActivo() && this.nombre.equals(c.getNombreCliente())) {
                    sb.append("- ").append(p.mostrarInformacion())
                      .append(" -> ").append(c.mostrarInformacion()).append("\n");
                    hayActivos = true;
                }
            }
        }
        if (!hayActivos) {
            return "La empresa \"" + nombre + "\" no tiene contratos activos.";
        }
        return sb.toString().trim();
    }
}
