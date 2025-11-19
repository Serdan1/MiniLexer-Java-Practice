public class Lexer {
    // Constante de tokens de entrada
    private static final String[] ENTRADA_TOKENS = {
            "int", "valor", "=", "3", ";",
            "if", "(", "valor", "==", "5", ")",
            "valor", "=", "0", ";"
    };

    /**
     * Determina el TipoToken al que pertenece un lexema dado (Lógica de Clasificación).
     */
    public static TipoToken clasificarToken(String lexema) {
        // 1. PALABRAS CLAVE: if o int
        if (lexema.equals("if") || lexema.equals("int")) {
            return TipoToken.PALABRA_CLAVE;
        }

        // 2. OPERADORES / DELIMITADORES
        if (lexema.equals("==") || lexema.equals("=") || lexema.equals("+")) {
            return TipoToken.OPERADOR;
        }
        if (lexema.equals(";") || lexema.equals("(") || lexema.equals(")")) {
            return TipoToken.DELIMITADOR;
        }

        // 3. LITERALES NUMÉRICOS
        if (lexema.matches("[0-9]+")) {
            return TipoToken.LITERAL_NUMERICO;
        }

        // 4. IDENTIFICADORES
        else {
            return TipoToken.IDENTIFICADOR;
        }
    }

    /**
     * Permite acceder a la lista de tokens desde el exterior (Clase Main).
     */
    public static String[] getEntradaTokens() {
        return ENTRADA_TOKENS;
    }
}