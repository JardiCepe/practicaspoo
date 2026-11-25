package guiado_arreglos_software;

public class AnalizadorProyecto {
    private Modulo[] modulos;

    public AnalizadorProyecto(Modulo[] modulos) {
        this.modulos = modulos;
    }

    public String listarModulos() {
        if (modulos == null || modulos.length == 0) {
            return "No hay módulos registrados en el proyecto.";
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                resultado.append("- ").append(modulos[i].mostrarInformacion()).append("\n");
            }
        }
        if (resultado.length() == 0) {
            return "No hay módulos registrados en el proyecto.";
        }
        return resultado.toString().trim();
    }

    public int contarTerminados() {
        if (modulos == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null && modulos[i].isTerminado()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularProgresoPromedio() {
        if (modulos == null) {
            return 0.0;
        }
        int suma = 0;
        int cantidad = 0;
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                suma += modulos[i].getProgreso();
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0.0;
        }
        return (double) suma / cantidad;
    }

    public Modulo buscarModulo(String nombre) {
        if (modulos == null || nombre == null) {
            return null;
        }
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null && nombre.equals(modulos[i].getNombre())) {
                return modulos[i];
            }
        }
        return null;
    }

    // Desafío adicional
    public Modulo obtenerMenorProgreso() {
        if (modulos == null) {
            return null;
        }
        Modulo menor = null;
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                if (menor == null || modulos[i].getProgreso() < menor.getProgreso()) {
                    menor = modulos[i];
                }
            }
        }
        return menor;
    }
}
