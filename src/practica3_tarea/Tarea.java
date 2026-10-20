package practica3_tarea;

public class Tarea {
    // 1. Atributos en private
    private String titulo;
    private String responsable;
    private double horasEstimadas;
    private boolean completada;

    // Getters y Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResponsable() {
        return this.responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public double getHorasEstimadas() {
        return this.horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public boolean isCompletada() {
        return this.completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Tarea: " + this.titulo);
        System.out.println("Responsable: " + this.responsable);
        System.out.println("Horas estimadas: " + this.horasEstimadas);
        System.out.println("Completada: " + this.completada);
        System.out.println("---------------------------------");
    }

    public void completar() {
        this.completada = true;
        System.out.println("Tarea '" + this.titulo + "' marcada como completada.");
    }

    void mostrarResponsable() {
        System.out.println("Responsable asignado: " + this.responsable);
    }

    void mostrarEstado() {
        System.out.println("¿La tarea '" + this.titulo + "' está completada? " + this.completada);
    }
}