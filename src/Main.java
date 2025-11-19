public class Main {

    public static void main(String[] args) {

        // CAMBIO CLAVE: Acceso directo a la constante pública de la clase Lexer
        String[] entradaTokens = Lexer.ENTRADA_TOKENS;

        // Array para almacenar los objetos Token generados
        Token[] tokensGenerados = new Token[entradaTokens.length];
        int indice = 0;

        System.out.println("--- Mini Lexer - Resultado Final ---");

        // Bucle de Procesamiento
        for (String lexema : entradaTokens) {
            // Clasificación usando el método estático de la clase Lexer
            TipoToken tipoClasificado = Lexer.clasificarToken(lexema);

            // Creación del objeto Token
            Token nuevoToken = new Token(tipoClasificado, lexema);

            // Almacenamiento
            tokensGenerados[indice] = nuevoToken;

            // Impresión usando el toString() de la clase Token
            System.out.println(nuevoToken);

            indice++;
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Procesamiento finalizado. Se generaron " + tokensGenerados.length + " objetos Token.");
    }
}