package guiado;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        // Asignación usando Setters
        dispositivo1.setNombre("Laptop Lenovo");
        dispositivo1.setTipo("Computadora portátil");
        dispositivo1.setActivo(false);

        dispositivo2.setNombre("Servidor Web");
        dispositivo2.setTipo("Servidor local");
        dispositivo2.setActivo(true);

        System.out.println("=== DATOS INICIALES (CONSULTA CON GETTERS) ===");
        System.out.println("Dispositivo 1: " + dispositivo1.getNombre() + " (" + dispositivo1.getTipo() + ")");
        dispositivo1.mostrarInformacion();

        System.out.println("Dispositivo 2: " + dispositivo2.getNombre() + " (" + dispositivo2.getTipo() + ")");
        dispositivo2.mostrarInformacion();

        System.out.println("\n=== MODIFICACIÓN MEDIANTE ACCIÓN ===");
        dispositivo1.activar();
        dispositivo1.mostrarEstado();

        System.out.println("\n=== COMPROBACIÓN DISPOSITIVO 2 ===");
        dispositivo2.mostrarEstado();
    }
}