package casa_arraylist_l1_sprint;

public class Tarea {
    private String codigo;
    private String titulo;
    private double horas;
    private boolean completada;

    public Tarea(String codigo, String titulo, double horas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horas = horas;
        this.completada = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getHoras() {
        return horas;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String mostrarInformacion() {
        String estado = completada ? "Completada" : "Pendiente";
        return codigo + " - " + titulo + " | Horas: " + horas + " | Estado: " + estado;
    }
}
