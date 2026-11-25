package relaciones_ej4_biometrico;

public class ReconocimientoFacial extends MetodoAutenticacion {
    private double precisionPorcentaje;

    public ReconocimientoFacial(int nivelSeguridad, double precisionPorcentaje) {
        super(nivelSeguridad);
        this.precisionPorcentaje = precisionPorcentaje;
    }

    @Override
    public String autenticar() {
        return "Autenticación facial completada con precisión del " + precisionPorcentaje + "%.";
    }

    @Override
    public String mostrarInformacion() {
        return "[Reconocimiento Facial] Precisión: " + precisionPorcentaje + "% | " + super.mostrarInformacion();
    }
}
