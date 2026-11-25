package relaciones_ej6_recomendacion_ia;

public class CursoIA extends Curso {
    private String enfoque;

    public CursoIA(String nombre, String dificultad, String enfoque) {
        super(nombre, dificultad);
        this.enfoque = enfoque;
    }

    @Override
    public String getArea() {
        return "Inteligencia Artificial";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Enfoque: " + enfoque;
    }
}
