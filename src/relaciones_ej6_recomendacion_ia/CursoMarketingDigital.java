package relaciones_ej6_recomendacion_ia;

public class CursoMarketingDigital extends Curso {
    private String plataforma;

    public CursoMarketingDigital(String nombre, String dificultad, String plataforma) {
        super(nombre, dificultad);
        this.plataforma = plataforma;
    }

    @Override
    public String getArea() {
        return "Marketing Digital";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Plataforma: " + plataforma;
    }
}
