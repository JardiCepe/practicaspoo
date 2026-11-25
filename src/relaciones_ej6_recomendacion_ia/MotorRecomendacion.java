package relaciones_ej6_recomendacion_ia;

public class MotorRecomendacion {
    // Asociación fuerte: el motor recibe y trabaja directamente sobre un Usuario
    private Usuario usuario;

    public MotorRecomendacion(Usuario usuario) {
        this.usuario = usuario;
    }

    public void recomendarPorPreferencia(String palabraClave) {
        if (usuario == null || palabraClave == null) {
            return;
        }
        String clave = palabraClave.trim().toLowerCase();

        if (clave.contains("ia") || clave.contains("inteligencia") || clave.contains("datos")) {
            usuario.agregarCursoRecomendado(new CursoIA("Machine Learning Aplicado", "Intermedio", "Redes Neuronales"));
            usuario.agregarCursoRecomendado(new CursoIA("Introducción a IA Generativa", "Básico", "LLMs y Prompts"));
        } else if (clave.contains("ciber") || clave.contains("seguridad") || clave.contains("red")) {
            usuario.agregarCursoRecomendado(new CursoCiberseguridad("Hacking Ético", "Intermedio", "Pentesting Virtual"));
            usuario.agregarCursoRecomendado(new CursoCiberseguridad("Defensa de Redes", "Avanzado", "SOC Simulado"));
        } else if (clave.contains("marketing") || clave.contains("ventas") || clave.contains("seo")) {
            usuario.agregarCursoRecomendado(new CursoMarketingDigital("SEO y Analítica Web", "Básico", "Google Analytics"));
            usuario.agregarCursoRecomendado(new CursoMarketingDigital("Campañas en Redes", "Intermedio", "Meta Ads"));
        } else {
            // Recomendación general si la palabra clave no coincide con un área específica
            usuario.agregarCursoRecomendado(new CursoIA("Fundamentos de IA", "Básico", "Conceptos Generales"));
            usuario.agregarCursoRecomendado(new CursoCiberseguridad("Seguridad Digital Básica", "Básico", "Buenas Prácticas"));
        }
    }
}
