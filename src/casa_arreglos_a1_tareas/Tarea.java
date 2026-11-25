package casa_arreglos_a1_tareas;

public class Tarea {
    private String codigo;
    private String titulo;
    private double horasEstimadas;
    private boolean completada;

    public Tarea(String codigo, String titulo, double horasEstimadas, boolean completada) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.completada = completada;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String mostrarInformacion() {
        String estado = completada ? "Completada" : "Pendiente";
        return codigo + " - " + titulo + " | Horas: " + horasEstimadas + " | Estado: " + estado;
    }
}
