package clases;
/*TENEMOS UN ARRAY DE 35 ELEMENTOS. LLENARLO CON NUMEROS ENTEROS ALEATORIOS ENTRE -50 Y 50 AMBOS INCLUIDOS y MOSTRAR POR PANTALLA LA SIGUIENTE INFORMACIÓN:

 * 1.- EL ARRAY COMPLETO EN UNA LINEA SEPARQADOS POR ESPEACIO
 * 2.- LOS NUMEROS PARES DE LAS POSICIONES IMPARES
 * 3.- LA SUMA DE ESTOS
 * 4.- CUÁNTOS SON ESTOS

 * Ejemplo de salida por pantalla:
 * Contenido del array:
 * 21 35 6 -5 -45 41 21 32 0 -23 12 18 15 16 -16 -44 -22 22 28  .... 25
 * Los numeros pares de las posiciones impares son:
 * 6 0 12 -16 -22 28
 * La suma es: 8
 * En total son 5 numeros

 */

import java.util.Random;

public class Ejercicio_01_Arrays {
    public static void main(String[] args){
        int[] numbers = new int[35];
        Random random = new Random();

        // // 1. Llenar el array con enteros aleatorios entre -50 y 50 (ambos incluidos)
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(-50, 51);
        }

        // Mostrar el array completo en una línea separado por espacios
        System.out.println("Array de 35 números aleatorios entre -50 y 50:");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

        // 2.- LOS NUMEROS PARES DE LAS POSICIONES IMPARES
        int sumParPosImp = 0;
        int contParPosImp = 0;

        System.out.println("Los números pares en las posiciones impares son: ");
        for (int i = 1; i < numbers.length; i += 2){
            if (numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
                sumParPosImp += numbers[i];
                contParPosImp++;
            }
        }
        System.out.println();
        System.out.println();

        // 3.- LA SUMA DE ESTOS
        System.out.println("La suma de los números pares en posiciones impares del array es: " + sumParPosImp);
        System.out.println();

        // 4.- CUÁNTOS SON ESTOS
        System.out.println("Hay " + contParPosImp + " números pares en las posiciones impares");
    }
}
