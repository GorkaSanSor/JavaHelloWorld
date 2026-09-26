package c03_strings;

public class Strings {
    public static void main(String[] args){

        // CADENAS DE TEXTO

        String name = "Gorka";
        var surname = new String("Santillán");

        // OPERACIONES BÁSICAS

        // Concatenacion
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener carácter
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena

        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 4));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Comprobar si contiene
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparación
        System.out.println(name.equals("Gorka"));
        System.out.println(name.equals("gorka"));
        System.out.println(name.equalsIgnoreCase("gorka"));

        // == vs. equals

        var a = "Gorka";
        var b = "Gorka";
        var c = new String("Gorka");

        System.out.println(a == b);         // True
        System.out.println(a == c);         // False
        System.out.println(a.equals(c));    // True

        // Trim
        System.out.println(" Hola, me llamo Gorka ");
        System.out.println(" Hola, me llamo Gorka ".trim());

        // Replace
        System.out.println(" Hola, me llamo Gorka ".replace(" ", ""));

        // Format
        var age = 39;
        System.out.println(String.format("Hola, %s, tengo %d años", name, age));
    }
}
