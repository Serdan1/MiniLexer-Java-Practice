/**
 * Determina el TipoToken al que pertenece un lexema dado, usando una lógica secuencial.
 *
 * @param lexema El texto (palabra o símbolo) a clasificar.
 * @return El TipoToken correspondiente al lexema.
 */
public static TipoToken clasificarToken(String lexema) {
    // 1. PALABRAS CLAVE: if o int
    if (lexema.equals("if") || lexema.equals("int")) {
        return TipoToken.PALABRA_CLAVE;
    }

    // 2. OPERADORES / DELIMITADORES:
    // Nota: Agrupamos operadores (==, =, +) y delimitadores (;, (, )) en un solo bloque
    // de verificación por simplicidad, tal como sugiere la práctica.
    if (lexema.equals("==") || lexema.equals("=") || lexema.equals("+")) {
        return TipoToken.OPERADOR;
    }
    if (lexema.equals(";") || lexema.equals("(") || lexema.equals(")")) {
        return TipoToken.DELIMITADOR;
    }

    // 3. LITERALES NUMÉRICOS: Usamos expresión regular para chequear si son solo dígitos.
    if (lexema.matches("[0-9]+")) {
        return TipoToken.LITERAL_NUMERICO;
    }

    // 4. IDENTIFICADORES: Si no coincide con nada de lo anterior, se asume que es un IDENTIFICADOR.
    else {
        return TipoToken.IDENTIFICADOR;
    }
}