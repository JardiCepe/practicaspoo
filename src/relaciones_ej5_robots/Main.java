package relaciones_ej5_robots;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Robot r1 = new RobotVigilancia("RV-01", "Li-Ion", 120, "Almacén Norte");
        Robot r2 = new RobotMontacargas("RM-02", "LiFePO4", 350, 800.0);

        r1.agregarTarea("Patrullar pasillo A");
        r1.agregarTarea("Escanear códigos QR");

        r2.agregarTarea("Mover palets a zona de carga");
        r2.agregarTarea("Apilar contenedores en estante 4");

        ArrayList<Robot> robots = new ArrayList<>();
        robots.add(r1);
        robots.add(r2);

        System.out.println("--- ROBOTS REGISTRADOS ---");
        for (Robot r : robots) {
            System.out.println(r.mostrarInformacion());
            System.out.println(r.listarTareas());
            System.out.println("¿Puede completar tarea de costo 150 Wh?: " + r.puedeCompletarTarea(150));
            System.out.println("¿Puede completar tarea de costo 100 Wh?: " + r.puedeCompletarTarea(100));
            System.out.println();
        }
    }
}
