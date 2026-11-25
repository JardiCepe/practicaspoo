package relaciones_ej7_proveedores;

public class Contrato {
    private String nombreCliente;
    private double precio;
    private int duracionMeses;
    private boolean activo;

    public Contrato(String nombreCliente, double precio, int duracionMeses) {
        this.nombreCliente = nombreCliente;
        this.precio = precio;
        this.duracionMeses = duracionMeses;
        this.activo = true;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String mostrarInformacion() {
        String estado = activo ? "Activo" : "Finalizado";
        return "Contrato con " + nombreCliente + " | Precio: $" + precio
                + " | Duración: " + duracionMeses + " meses | Estado: " + estado;
    }
}
