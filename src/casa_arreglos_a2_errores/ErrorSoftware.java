package casa_arreglos_a2_errores;

public class ErrorSoftware {
    private String codigo;
    private String descripcion;
    private String severidad;
    private boolean resuelto;

    public ErrorSoftware(String codigo, String descripcion, String severidad, boolean resuelto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.severidad = severidad;
        this.resuelto = resuelto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSeveridad() {
        return severidad;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    public String mostrarInformacion() {
        String estado = resuelto ? "Resuelto" : "Pendiente";
        return codigo + " [" + severidad + "] - " + descripcion + " (" + estado + ")";
    }
}
