package relaciones_ej6_recomendacion_ia;

public abstract class Curso {
    private String nombre;
    private String dificultad;

    public Curso(String nombre, String dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public abstract String getArea();

    public String mostrarInformacion() {
        return "[" + getArea() + "] " + nombre + " (Dificultad: " + dificultad + ")";
    }
}
