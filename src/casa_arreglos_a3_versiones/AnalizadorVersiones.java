package casa_arreglos_a3_versiones;

public class AnalizadorVersiones {
    private VersionSoftware[] versiones;

    public AnalizadorVersiones(VersionSoftware[] versiones) {
        this.versiones = versiones;
    }

    public int contarEstables() {
        if (versiones == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null && versiones[i].isEstable()) {
                contador++;
            }
        }
        return contador;
    }

    public VersionSoftware buscarVersion(String numero) {
        if (versiones == null || numero == null) {
            return null;
        }
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null && numero.equals(versiones[i].getNumero())) {
                return versiones[i];
            }
        }
        return null;
    }

    public VersionSoftware obtenerVersionMasCambios() {
        if (versiones == null) {
            return null;
        }
        VersionSoftware mayor = null;
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null) {
                if (mayor == null || versiones[i].getCantidadCambios() > mayor.getCantidadCambios()) {
                    mayor = versiones[i];
                }
            }
        }
        return mayor;
    }

    public int sumarCambios() {
        if (versiones == null) {
            return 0;
        }
        int total = 0;
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null) {
                total += versiones[i].getCantidadCambios();
            }
        }
        return total;
    }

    // Desafío: promedio de cambios por versión
    public double calcularPromedioCambios() {
        if (versiones == null) {
            return 0.0;
        }
        int suma = 0;
        int cantidad = 0;
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null) {
                suma += versiones[i].getCantidadCambios();
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0.0;
        }
        return (double) suma / cantidad;
    }
}
