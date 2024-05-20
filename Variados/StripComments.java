package org.example;
/*
Complete la solución para que elimine todo el texto que sigue a cualquiera de un conjunto de marcadores de comentarios
                                pasados. También se debe eliminar cualquier espacio en blanco al final de la línea.
Ejemplo:

Dada una cadena de entrada de:

apples, pears # and bananas
grapes
bananas !apples

El resultado esperado sería:

apples, pears
grapes
bananas
 */
public class StripComments {

    // Método para eliminar comentarios de un texto dado una lista de símbolos de comentarios
    public static String stripComments(String text, String[] commentSymbols) {
        // Dividir el texto en líneas individuales
        String[] lines = text.split("\n");
        StringBuilder result = new StringBuilder();

        // Iterar sobre cada línea del texto
        for (String line : lines) {
            StringBuilder cleanLine = new StringBuilder();

            // Iterar sobre cada carácter de la línea
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                boolean isComment = false;

                // Verificar si el carácter actual marca el inicio de un comentario
                for (String symbol : commentSymbols) {
                    if (line.substring(i).startsWith(symbol)) {
                        isComment = true;
                        break;
                    }
                }

                // Si no es un comentario, agregar el carácter a la línea limpia
                if (!isComment) {
                    cleanLine.append(c);
                } else {
                    break; // Ignorar el resto de la línea si se encuentra un símbolo de comentario
                }
            }

            // Convertir la línea limpia a una cadena, eliminar los espacios en blanco al final
            String cleanedLine = cleanLine.toString().trim();

            // Agregar la línea limpia al resultado si no está vacía
            if (!cleanedLine.isEmpty()) {
                result.append(cleanedLine).append("\n");
            }
        }

        // Convertir el resultado a una cadena y eliminar los espacios en blanco al final
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Ejemplo de texto de entrada
        String text = "apples, pears # and bananas\ngrapes\nbananas !apples";

        // Símbolos de comentarios a eliminar
        String[] commentSymbols = {"#", "!"};

        // Llamar al método stripComments con el texto y los símbolos de comentarios
        String result = stripComments(text, commentSymbols);

        // Imprimir el resultado
        System.out.println(result);
    }
}
