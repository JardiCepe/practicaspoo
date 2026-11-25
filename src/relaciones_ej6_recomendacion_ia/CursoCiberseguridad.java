package relaciones_ej6_recomendacion_ia;

public class CursoCiberseguridad extends Curso {
    private String tipoLaboratorio;

    public CursoCiberseguridad(String nombre, String dificultad, String tipoLaboratorio) {
        super(nombre, dificultad);
        this.tipoLaboratorio = tipoLaboratorio;
    }

    @Override
    public String getArea() {
        return "Ciberseguridad";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Laboratorio: " + tipoLaboratorio;
    }
}
