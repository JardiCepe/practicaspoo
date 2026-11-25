package relaciones_ej1_vehiculos;

public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String placa, String marca, String modelo, int anio, Propietario propietario, int numeroPuertas) {
        super(placa, marca, modelo, anio, propietario);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String mostrarInformacion() {
        return "[Automóvil] " + super.mostrarInformacion() + " | Puertas: " + numeroPuertas;
    }
}
