public class MiniLexer {

    private static final String[] ENTRADA_TOKENS = {
            "int", "valor", "=", "3", ";",
            "if", "(", "valor", "==", "5", ")",
            "valor", "=", "0", ";"
    };

    public static TipoToken clasificarToken(String lexema) {
        return TipoToken.IDENTIFICADOR;
    }

    public static void main(String[] args) {
        System.out.println("--- Mini Lexer - Clasificación de Tokens (Fase 2) ---");
        System.out.println("Lexema\t\tTipo (Temporal)");
        System.out.println("----------------------------------------");

        for (String lexema : ENTRADA_TOKENS) {
            TipoToken tipoTemporal = clasificarToken(lexema);
            System.out.printf("%-10s\t%s%n", lexema, tipoTemporal);
        }
        System.out.println("----------------------------------------");
    }
}