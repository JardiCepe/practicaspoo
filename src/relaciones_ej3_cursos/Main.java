package relaciones_ej3_cursos;

public class Main {
    public static void main(String[] args) {
        String[] titulosPoo = {
                "Fundamentos de Clases y Objetos",
                "Encapsulamiento y Constructores",
                "Relaciones entre Clases",
                "Herencia y Polimorfismo"
        };
        int[] horasPoo = {6, 8, 10, 12};

        Curso curso = new Curso("SW-201", "Programación Orientada a Objetos", titulosPoo, horasPoo);

        System.out.println("--- CURSO Y SUS UNIDADES (COMPOSICIÓN) ---");
        System.out.println(curso.mostrarInformacion());
    }
}
