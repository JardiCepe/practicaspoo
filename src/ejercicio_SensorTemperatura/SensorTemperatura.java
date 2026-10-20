package ejercicio_SensorTemperatura;

public class SensorTemperatura {
    // Atributos privados
    private int idSensor;
    private double valorActual;
    private String unidad;

    // Constructor para inicializar los atributos
    public SensorTemperatura(int idSensor, double valorActual, String unidad) {
        this.idSensor = idSensor;
        this.valorActual = valorActual;
        this.unidad = unidad;
    }

    // Métodos get() y set() para valorActual
    public double getValorActual() {
        return this.valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    // Métodos get() y set() para unidad
    public String getUnidad() {
        return this.unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    // Getter para idSensor (buena práctica de lectura)
    public int getIdSensor() {
        return this.idSensor;
    }

    // Metodo utilitario mostrarLectura()
    public void mostrarLectura() {
        System.out.println("Identificador: " + this.idSensor + " | Lectura: " + this.valorActual + " " + this.unidad);
    }
}
