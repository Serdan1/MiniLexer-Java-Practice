public class Token {
    // Atributos privados para asegurar el encapsulamiento.
    private TipoToken tipo; // Usa el TipoToken creado
    private String lexema;  // Almacena la palabra o símbolo [cite: 10]

    /**
     * Constructor para inicializar un Token.
     * @param tipo El TipoToken clasificado.
     * @param lexema La cadena de texto original (el lexema).
     */
    public Token(TipoToken tipo, String lexema) {
        this.tipo = tipo;
        this.lexema = lexema;
    }

    /**
     * Sobrescribe el método toString para generar la salida solicitada en la práctica:
     * Token: <TIPO, "lexema">
     */
    @Override
    public String toString() {
        return "Token: <" + tipo.name() + ", \"" + lexema + "\">";
    }

    // Getters para acceder a los atributos, manteniendo el encapsulamiento.
    public TipoToken getTipo() {
        return tipo;
    }

    public String getLexema() {
        return lexema;
    }
}