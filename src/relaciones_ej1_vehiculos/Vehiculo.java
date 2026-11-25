package relaciones_ej1_vehiculos;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    // Asociación: Vehiculo tiene un Propietario independiente
    private Propietario propietario;

    public Vehiculo(String placa, String marca, String modelo, int anio, Propietario propietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String mostrarInformacion() {
        String infoProp = propietario != null ? propietario.mostrarInformacion() : "Sin propietario";
        return "Placa: " + placa + " | " + marca + " " + modelo + " (" + anio + ") | Propietario: " + infoProp;
    }
}
