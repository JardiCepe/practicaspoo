package s4_ejercicio3_software;

public class Main {
    public static void main(String[] args) {
        // 1. Antes de crear objetos: debe ser 0
        System.out.println("--- PRUEBA INICIAL ---");
        System.out.println("Total dispositivos creados: " + Dispositivo.getTotalCreados());

        // 2. Creando el primer objeto
        Dispositivo d1 = new Dispositivo("Teclado Mecánico", "Periférico");
        System.out.println("\nDespués de crear 1 objeto:");
        System.out.println("Total: " + Dispositivo.getTotalCreados());

        // 3. Creando los otros dos objetos (al menos 3 objetos en total)
        Dispositivo d2 = new Dispositivo("Router Wi-Fi 6", "Redes");
        Dispositivo d3 = new Dispositivo("Servidor Dell", "Infraestructura");

        System.out.println("\nDespués de crear 3 objetos:");
        System.out.println("Total dispositivos creados: " + Dispositivo.getTotalCreados());

        // 4. Comprobación: Cada objeto conserva sus propios datos (Desafío adicional incluido)
        System.out.println("\n--- LISTA DE DISPOSITIVOS ---");
        d1.mostrarInfo();
        d2.mostrarInfo();
        d3.mostrarInfo();
    }
}