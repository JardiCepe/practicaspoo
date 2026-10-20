package ejercicio_SensorTemperatura;

public class Main {
    public static void main(String[] args) {
        // En el main, cree dos sensores y muestre sus lecturas
        SensorTemperatura s1 = new SensorTemperatura(1, 25.0, "°C");
        SensorTemperatura s2 = new SensorTemperatura(2, 77.0, "°F");

        s1.mostrarLectura();
        s2.mostrarLectura();
    }
}
