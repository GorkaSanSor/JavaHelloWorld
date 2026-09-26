package c01_beginner;

public class VariablesAndConstants {
    public static void main(String[] args){

        // Variables

        String name = "Gorka";
        System.out.println(name);

        int age = 39;
        System.out.println(age);

        // var detecta automáticamente si es int o String
        var year = 2026;
        System.out.println(year);

        // Constantes

        final String EMAIL = "crwgorka@gmail.com"; // Constantes siempre en mayúsculas
        // EMAIL = "gorka@gmail.com"; Da error porque no se puede cambiar una constante.
        System.out.println(EMAIL);
    }
}
