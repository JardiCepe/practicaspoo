package relaciones_ej6_recomendacion_ia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario u1 = new Usuario("Elena Ríos");
        MotorRecomendacion motor = new MotorRecomendacion(u1);

        System.out.print("Ingrese su preferencia o palabra clave (ej: ia, seguridad, marketing): ");
        String preferencia = sc.nextLine();
        motor.recomendarPorPreferencia(preferencia);

        System.out.println("\n--- CURSOS RECOMENDADOS ---");
        System.out.println(u1.mostrarCursosRecomendados());

        System.out.print("\nIngrese el nombre exacto de un curso para buscarlo en sus recomendaciones: ");
        String nombreBuscar = sc.nextLine();
        Curso encontrado = u1.buscarCursoRecomendado(nombreBuscar);
        System.out.println(encontrado != null
                ? "Coincidencia encontrada: " + encontrado.mostrarInformacion()
                : "No se encontró ningún curso recomendado con ese nombre.");
    }
}
