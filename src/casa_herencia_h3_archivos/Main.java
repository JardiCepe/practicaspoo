package casa_herencia_h3_archivos;

public class Main {
    public static void main(String[] args) {
        // Crear 2 archivos de cada subtipo
        Archivo t1 = new ArchivoTexto("README.md", 2.0, "UTF-8");
        Archivo t2 = new ArchivoTexto("config.json", 1.0, "UTF-8");

        Archivo i1 = new ArchivoImagen("logo.png", 5.0, "1920x1080");
        Archivo i2 = new ArchivoImagen("banner.jpg", 8.0, "3840x2160");

        Archivo v1 = new ArchivoVideo("demo.mp4", 100.0, 120);
        Archivo v2 = new ArchivoVideo("tutorial.mp4", 200.0, 300);

        // Desafío: ArchivoAudio
        Archivo a1 = new ArchivoAudio("intro.mp3", 10.0, 320);
        Archivo a2 = new ArchivoAudio("alerta.wav", 4.0, 1411);

        RepositorioArchivos repo = new RepositorioArchivos("Assets Proyecto");
        repo.agregarArchivo(t1);
        repo.agregarArchivo(t2);
        repo.agregarArchivo(i1);
        repo.agregarArchivo(i2);
        repo.agregarArchivo(v1);
        repo.agregarArchivo(v2);
        repo.agregarArchivo(a1);
        repo.agregarArchivo(a2);

        System.out.println("--- LISTADO POLIMÓRFICO DE ARCHIVOS ---");
        System.out.println(repo.listarArchivos());

        System.out.println("\n--- ESPACIO TOTAL PROCESADO ---");
        System.out.println("Total procesado: " + repo.calcularEspacioTotalProcesado() + " MB");
    }
}
