package relaciones_ej3_cursos;

public class Unidad {
    private int numero;
    private String titulo;
    private int duracionHoras;

    public Unidad(int numero, String titulo, int duracionHoras) {
        this.numero = numero;
        this.titulo = titulo;
        this.duracionHoras = duracionHoras;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public String mostrarInformacion() {
        return "Unidad " + numero + ": " + titulo + " (" + duracionHoras + " h)";
    }
}
