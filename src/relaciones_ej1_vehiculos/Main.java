package relaciones_ej1_vehiculos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Propietario p1 = new Propietario("Carlos Méndez", "1712345678");
        Propietario p2 = new Propietario("María López", "1798765432");

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Automovil("PBA-1024", "Toyota", "Corolla", 2023, p1, 4));
        vehiculos.add(new Motocicleta("HL-458A", "Yamaha", "MT-03", 2024, p2, 321));
        vehiculos.add(new Automovil("PBC-8812", "Kia", "Sportage", 2022, p2, 5));

        System.out.println("--- REGISTRO DE VEHÍCULOS ---");
        for (Vehiculo v : vehiculos) {
            System.out.println("- " + v.mostrarInformacion());
        }
    }
}
