# ⚙️ MiniLexer: Simulador de Nivel Léxico en Java

## 🎯 Objetivo del Proyecto

[cite_start]Este proyecto es la implementación de una práctica académica para simular el **Nivel Léxico** de un compilador[cite: 2]. [cite_start]El objetivo principal es leer una lista predefinida de palabras y símbolos (lexemas) y clasificarlos en su **Tipo de Token** correspondiente[cite: 5].

[cite_start]Se implementó una lógica de clasificación secuencial (`if/else if/else`) simple para este propósito, evitando la complejidad de las expresiones regulares complejas[cite: 3].

## 💻 Estructura Modular y Archivos

El proyecto sigue una estructura modular y profesional en Java, separando las entidades de datos, la lógica y la ejecución en archivos distintos dentro de la carpeta `src`.

| Archivo | Tipo | Descripción |
| :--- | :--- | :--- |
| **`TipoToken.java`** | `enum` | [cite_start]Define el conjunto fijo de constantes de clasificación: `PALABRA_CLAVE`, `IDENTIFICADOR`, `LITERAL_NUMERICO`, `OPERADOR`, `DELIMITADOR`[cite: 8]. |
| **`Token.java`** | `class` | [cite_start]Clase de entidad que almacena un token, compuesto por su `TipoToken` y el `lexema` (String)[cite: 9, 10]. [cite_start]Incluye un método `toString()` para la impresión formateada[cite: 32]. |
| **`Lexer.java`** | `class` | Contiene la lógica léxica (`clasificarToken`) y la lista constante de tokens de entrada (`ENTRADA_TOKENS`). |
| **`Main.java`** | `class` | Clase principal que contiene el método `main`. Es el punto de entrada que orquesta la lectura de tokens, la llamada al clasificador y la impresión del resultado final. |

## 🚀 Ejecución del Programa

### Requisitos

* JDK (Java Development Kit) 1.8 o superior.
* Un IDE como IntelliJ IDEA o Eclipse.

### Instrucciones de Compilación y Ejecución

1.  **Clonar el Repositorio:**
    ```bash
    git clone [https://github.com/Serdan1/MiniLexer-Java-Practice.git](https://github.com/Serdan1/MiniLexer-Java-Practice.git)
    ```
2.  **Abrir en IDE:** Importa la carpeta `MiniLexer-Java-Practice` como un proyecto Java en tu IDE.
3.  **Ejecutar:** Ejecuta la clase **`Main.java`** (método `main`).

## ⚙️ Salida Esperada

El programa procesará la siguiente secuencia de tokens predefinida:
`int`, `valor`, `=`, `3`, `;`, `if`, `(`, `valor`, `==`, `5`, `)`, `valor`, `=`, `0`, `;`

El resultado en consola mostrará la clasificación completa en el formato `Token: <TIPO, "lexema">`, similar a este ejemplo:

--- Mini Lexer - Resultado Final --- Token: <PALABRA_CLAVE, "int"> Token: <IDENTIFICADOR, "valor"> Token: <OPERADOR, "="> Token: <LITERAL_NUMERICO, "3"> ...

## 🔑 Lógica de Clasificación

El método clasificarToken() implementa la siguiente lógica secuencial:
- Palabras Clave: Chequea por "if" o "int".
- Operadores/Delimitadores: Chequea por símbolos como "=", "==", ";", "(", etc..
- Literal Numérico: Usa una expresión simple para verificar si son dígitos ([0-9]+).
- Identificador: Usa la cláusula else final, asumiendo que cualquier lexema que no cumpla con las reglas anteriores es un identificador.

##💡 Diagrama de Flujo del MiniLéxer (Mermaid Graph TD)
graph TD
    %% Estructuras
    subgraph Archivos_y_Estructuras [Estructuras de Datos]
        A[TipoToken.java (Enum)]
        B[Token.java (Clase)]
    end

    %% Proceso de Inicialización y Ejecución
    subgraph Proceso_Léxico [Flujo de Ejecución del Programa]
        C[Main.java (main)] -->|Llamada a método estático| D{Lexer.getEntradaTokens()}
        D -->|Tokens (String[])| E[Bucle: Procesar cada Lexema]
        
        E -->|Lexema (String)| F{Lexer.clasificarToken(lexema)}
        F -->|TipoToken Clasificado| G[Crear nuevo Objeto Token]
        G -->|Nuevo Token| H[Impresión por Consola (toString)]
        
        E --> I(Almacenamiento en Token[])
    end

    %% Relaciones de Dependencia
    D --> A
    F --> A : usa y retorna
    G --> B : crea instancia
    H --> B : usa método

    C --> I : Resultado final
