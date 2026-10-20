package ejercicio_LuzInteligente;

public class LuzInteligente {
    // Atributos privados requeridos
    private int idLuz;
    private int nivelBrillo;
    private boolean encendida;

    // Constructor: inicializa idLuz, y define un estado inicial coherente
    public LuzInteligente(int idLuz) {
        this.setIdLuz(idLuz);
        this.nivelBrillo = 0;       // Nace con brillo en 0
        this.encendida = false;     // Nace apagada
    }

    // Método para encender la luz
    public void encender() {
        this.encendida = true;
        // Si al encender el brillo estaba en 0, le asignamos un brillo por defecto (ej. 50)
        if (this.nivelBrillo == 0) {
            this.nivelBrillo = 50;
        }
        System.out.println("Luz [" + this.idLuz + "] encendida.");
    }

    // Método para apagar la luz
    public void apagar() {
        this.encendida = false;
        this.nivelBrillo = 0;
        System.out.println("Luz [" + this.idLuz + "] apagada. Brillo reiniciado a 0%.");
    }

    // Método para ajustar brillo con doble validación
    public void ajustarBrillo(int nuevoNivel) {
        // Regla 1: Solo debe funcionar si está encendida
        if (!this.encendida) {
            System.out.println("Error en Luz [" + this.idLuz + "]: No se puede ajustar el brillo porque la luz está apagada.");
            return;
        }

        // Regla 2: Restricción de rango 0 a 100
        if (nuevoNivel >= 0 && nuevoNivel <= 100) {
            this.nivelBrillo = nuevoNivel;
            System.out.println("Luz [" + this.idLuz + "]: Brillo ajustado al " + this.nivelBrillo + "%.");
        } else {
            System.out.println("Error en Luz [" + this.idLuz + "]: El brillo debe estar entre 0 y 100.");
        }
    }

    // Método utilitario para ver los datos en consola
    public void mostrarEstado() {
        String estadoTexto = this.encendida ? "Encendida" : "Apagada";
        System.out.println("ID: " + this.idLuz + " | Estado: " + estadoTexto + " | Brillo: " + this.nivelBrillo + "%");
    }

    // Getters de apoyo (buena práctica para consultar valores)
    public int getIdLuz() {
        return this.idLuz;
    }

    public void setIdLuz(int idLuz) {
        if (idLuz > 0) {
            this.idLuz = idLuz;
        } else {
            System.out.println("Error: El ID de la luz debe ser mayor que 0.");
        }
    }

    public int getNivelBrillo() {
        return this.nivelBrillo;
    }

    public boolean isEncendida() {
        return this.encendida;
    }
}
