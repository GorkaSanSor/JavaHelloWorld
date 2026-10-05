package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Loops {
    public static void main(String[] args){

        // LOOPS

        // FOR controlado por controlador
        for (int index = 0; index < 5; index++){
            System.out.println("Hola, Gorka");
        }

        String[] names = {"Gorka", "Santillan", "GorkaSanSor"};

        for (int index = 0; index < names.length; index++){
            System.out.println(names[index]);
        }

        // FOR EACH
        for (String name: names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Gorka", "gorka@gmail.com");
        emails.put("Santillan", "Santillan@gmail.com");
        emails.put("GorkaSanSor", "gorkasansor@gmail.com");

        for (Map.Entry <String, String> email: emails.entrySet()){
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        // WHILE
        int index = 0;

        while (index < 5) {
            System.out.println("Hola, Gorka");
            index++;
        }

        index = 0;
        boolean find = false;

        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Santillan")) {
                find = true;
            }
            index++;
        }

        // DO WHILE (la primera vez se ejecuta siempre)
        index = 0;

        do {
            System.out.println("Hola, Gorka");
            index++;
        } while (index < 0);

        // CONTROL DE BUCLES

        // BREAK
        for (String name: names) {
            if (name.equals("Santillan")) {
                break;
            }
            System.out.println(name);
        }

        // CONTINUE
        for (int i = 0; i < 5; i++){
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
