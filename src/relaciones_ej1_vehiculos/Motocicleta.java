package relaciones_ej1_vehiculos;

public class Motocicleta extends Vehiculo {
    private int cilindrajeCc;

    public Motocicleta(String placa, String marca, String modelo, int anio, Propietario propietario, int cilindrajeCc) {
        super(placa, marca, modelo, anio, propietario);
        this.cilindrajeCc = cilindrajeCc;
    }

    public int getCilindrajeCc() {
        return cilindrajeCc;
    }

    @Override
    public String mostrarInformacion() {
        return "[Motocicleta] " + super.mostrarInformacion() + " | Cilindraje: " + cilindrajeCc + " cc";
    }
}
