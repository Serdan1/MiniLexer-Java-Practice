public class Lexer {

    // CAMBIO CLAVE: Declarar la constante como 'public' para acceso directo desde Main.java
    public static final String[] ENTRADA_TOKENS = {
            "int", "valor", "=", "3", ";",
            "if", "(", "valor", "==", "5", ")",
            "valor", "=", "0", ";"
    };

    // ELIMINADO: El método getEntradaTokens() ya no es necesario.

    /**
     * Determina el TipoToken al que pertenece un lexema dado (Lógica de Clasificación).
     * (Este método permanece sin cambios)
     */
    public static TipoToken clasificarToken(String lexema) {
        // ... (Lógica de clasificación) ...
        if (lexema.equals("if") || lexema.equals("int")) {
            return TipoToken.PALABRA_CLAVE;
        }
        // ... (Resto de la lógica) ...
        if (lexema.equals("==") || lexema.equals("=") || lexema.equals("+")) {
            return TipoToken.OPERADOR;
        }
        if (lexema.equals(";") || lexema.equals("(") || lexema.equals(")")) {
            return TipoToken.DELIMITADOR;
        }
        if (lexema.matches("[0-9]+")) {
            return TipoToken.LITERAL_NUMERICO;
        }
        else {
            return TipoToken.IDENTIFICADOR;
        }
    }
}