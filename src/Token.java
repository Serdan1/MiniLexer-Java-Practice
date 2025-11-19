public class Token {
    // 1. Atributos Privados (Encapsulamiento)
    private TipoToken tipo; // Usa el enum TipoToken
    private String lexema;  // Almacena la palabra o símbolo

    // Constructor: Inicializa los atributos
    public Token(TipoToken tipo, String lexema) {
        this.tipo = tipo;
        this.lexema = lexema;
    }

    // Método toString() (Práctica profesional recomendada para una salida legible)
    // Cumple el formato de salida esperado: Token: <TIPO, "lexema"> [cite: 33]
    @Override
    public String toString() {
        // Usamos el nombre del enum (PALABRA_CLAVE) y el lexema entre comillas
        return "Token: <" + tipo.name() + ", \"" + lexema + "\">";
    }

    // Opcional pero buena práctica: Getters
    public TipoToken getTipo() {
        return tipo;
    }

    public String getLexema() {
        return lexema;
    }
}