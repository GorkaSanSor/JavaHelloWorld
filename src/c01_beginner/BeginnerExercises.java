package c01_beginner;

public class BeginnerExercises {
    public static void main(String[] args){

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String myString = "Gorka";
        System.out.println(myString);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myInt = 39;
        System.out.println(myInt);

        // 3. Crea una variable double con tu altura en metros.
        double myDouble = 1.76;
        System.out.println(myDouble);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean myBoolean = false;
        myBoolean = true;
        System.out.println("Me gusta programar? " + myBoolean);

        // 5. Declara una constante con tu email.
        final String EMAIL = "crwgorka@gmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myChar = 'G';
        System.out.println(myChar);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String myCity = "Guecho";
        System.out.println(myCity);
        myCity = "Getxo";
        System.out.println(myCity);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int myA = 'a';
        int myB = 'b';
        System.out.println(myA + myB);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(myString.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int myUninitiializedVar;
        myUninitiializedVar = 100;
        System.out.println(myUninitiializedVar);
    }
}
