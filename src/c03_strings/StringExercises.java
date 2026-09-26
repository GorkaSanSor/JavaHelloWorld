package c03_strings;

public class StringExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        System.out.println("Hola," + " Mundo!");

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(("Hola," + " Mundo!").length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(("Hola," + " Mundo!").charAt(0));
        var saludo = "Hola, Mundo!";
        System.out.println((saludo).charAt(saludo.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(saludo.toUpperCase().contains("HOLA"));
        System.out.println(saludo.toUpperCase().contains("hola"));
        System.out.println(saludo.contains("Hola"));

        // 6. Formatea un string con un entero.
        System.out.println(String.format("Mira como saludo: %s", saludo));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(("  Hola Mundo!  "));
        System.out.println(("  Hola Mundo!  ").trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println((saludo).replace(" ", ""));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(("Hola, Mundo!") == (saludo));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(("Hola Mundo!" + " ").length() == saludo.length());
    }
}
