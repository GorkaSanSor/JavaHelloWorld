package retos;
/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Reto01_Anagrama {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        // ESCANEAR 2 PALABRAS
        System.out.println("Escribe la primera palabra:");
        String word1 = scan.nextLine();

        System.out.println("Escribe la segunda palabra:");
        String word2 = scan.nextLine();

        boolean esAnagrama = esAnagrama(word1, word2);
        System.out.println("Es un anagrama?: " + esAnagrama);

        scan.close();
    }

    public static boolean esAnagrama(String word1, String word2){
        // Normalizar a minúsculas para ignorar diferencias de caja
        String w1 = word1.toLowerCase();
        String w2 = word2.toLowerCase();

        // 1. Dos palabras idénticas NO son un anagrama según el enunciado
        if (w1.equals(w2)){
            return false;
        }

        // 2. Si tienen distinta longitud, no pueden ser anagramas
        if (w1.length() != w2.length()){
            return false;
        }

        // 3. Convertir a arrays de caracteres y ordenar
        char[] array1 = w1.toCharArray();
        char[] array2 = w2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        // 4. Comparar si los arrays ordenados son iguales
        return Arrays.equals(array1, array2);
    }
}
