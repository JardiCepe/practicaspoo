package ejercicio_LuzInteligente;

public class Main {
    public static void main(String[] args) {
        // Crear dos objetos LuzInteligente usando el constructor
        LuzInteligente luzSala = new LuzInteligente(1);
        LuzInteligente luzDormitorio = new LuzInteligente(2);

        System.out.println("=== ESTADO INICIAL ===");
        luzSala.mostrarEstado();
        luzDormitorio.mostrarEstado();

        System.out.println("\n=== SIMULACIÓN: ENCENDER UNA Y APAGAR OTRA ===");
        // Encendemos la primera luz
        luzSala.encender();
        // La segunda la dejamos apagada (o invocamos apagar explícitamente)
        luzDormitorio.apagar();

        System.out.println("\n=== PRUEBAS DE AJUSTE DE BRILLO ===");
        // Intento 1: Ajustar brillo a la luz que está encendida (válido)
        luzSala.ajustarBrillo(80);

        // Intento 2: Ajustar brillo con valor fuera de rango (inválido)
        luzSala.ajustarBrillo(150);

        // Intento 3: Ajustar brillo a la luz que está apagada (debe rechazarlo)
        luzDormitorio.ajustarBrillo(60);

        System.out.println("\n=== APAGAR REINICIA EL BRILLO ===");
        luzSala.apagar();
        luzSala.mostrarEstado();

        System.out.println("\n=== VALIDACIÓN DE setIdLuz ===");
        luzSala.setIdLuz(0);   // inválido: se rechaza
        luzSala.setIdLuz(-3);  // inválido: se rechaza
        luzSala.setIdLuz(10);  // válido
        System.out.println("ID actual de la sala: " + luzSala.getIdLuz());

        System.out.println("\n=== ESTADO FINAL ===");
        luzSala.mostrarEstado();
        luzDormitorio.mostrarEstado();
    }
}
