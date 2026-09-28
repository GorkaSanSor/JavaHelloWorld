package c05_structures;

public class Arrays {
    public static void main(String[] args){

        // Declaración y creación
        int[] numbers = new int[3];

        String[] fullNames = {"Gorka", "Santillán", "Soriano"};

        // Acceso
        System.out.println(fullNames.length);
        System.out.println(fullNames[0] + " " + fullNames[1] + " " + fullNames[2]);

        // Modificación
        numbers[0] = 1;
        numbers[1] = 10;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(fullNames[0]);
        System.out.println(fullNames[1]);
        System.out.println(fullNames[2]);

        // Cambiar valor
        fullNames[2] = "crwgorka@gmail.com";
        System.out.println(fullNames[2]);

        // Eliminar valor
        fullNames[2] = null;
        System.out.println(fullNames[2]);

        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);
    }
}
