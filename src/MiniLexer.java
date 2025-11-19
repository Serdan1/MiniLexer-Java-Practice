public class MiniLexer {

    // ESTA ES LA DEFINICIÓN QUE FALTABA (Fase 2)
    // Se define a nivel de clase, fuera de cualquier método.
    private static final String[] ENTRADA_TOKENS = {
            "int", "valor", "=", "3", ";",
            "if", "(", "valor", "==", "5", ")",
            "valor", "=", "0", ";"
    };

    /**
     * Determina el TipoToken al que pertenece un lexema dado (Fase 3).
     * @param lexema El texto (palabra o símbolo) a clasificar.
     * @return El TipoToken correspondiente al lexema.
     */
    public static TipoToken clasificarToken(String lexema) {
        // Lógica de clasificación implementada en Fase 3

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

        // 3. LITERALES NUMÉRICOS: Usamos expresión regular.
        if (lexema.matches("[0-9]+")) {
            return TipoToken.LITERAL_NUMERICO;
        }

        // 4. IDENTIFICADORES: Opción final.
        else {
            return TipoToken.IDENTIFICADOR;
        }
    }

    // MÉTODO MAIN ACTUALIZADO (Fase 4)
    public static void main(String[] args) {
        // Creamos un array del tamaño de la entrada para guardar los objetos Token generados.
        Token[] tokensGenerados = new Token[ENTRADA_TOKENS.length];
        int indice = 0;

        System.out.println("--- Mini Lexer - Resultado Final de la Clasificación ---");

        // Bucle de Procesamiento: Clasificación, Creación y Almacenamiento
        for (String lexema : ENTRADA_TOKENS) {
            // 1. Clasificación: Llama a la lógica de la Fase 3.
            TipoToken tipoClasificado = clasificarToken(lexema);

            // 2. Creación: Crea un objeto Token usando la clase de la Fase 1.
            Token nuevoToken = new Token(tipoClasificado, lexema);

            // 3. Almacenamiento: Guarda el objeto en el array.
            tokensGenerados[indice] = nuevoToken;

            // 4. Impresión: Usa el método toString() del objeto Token para imprimir.
            System.out.println(nuevoToken);

            indice++;
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Procesamiento finalizado. Se generaron " + tokensGenerados.length + " objetos Token.");
    }
}