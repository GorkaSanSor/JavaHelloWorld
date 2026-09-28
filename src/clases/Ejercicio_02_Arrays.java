package clases;
/*TENEMOS UN ARRAY DE 20 ELEMENTOS.

 * LLENARLO CON NUMEROS ALEATORIOS ENTRE 1 Y 100 AMBOS INCLUIDOS Y MOSTRARLO POR PANTALLA

 * BUSCAR EL MAYOR Y EL MENOR DENTRO DEL ARRAY.

 * MOSTRAR POR PANTALLA EL MÁXIMO Y EL MÍNIMO DEL ARRAY INDICANDO QUÉ POSICIONES OCUPAN

 */
import java.util.Random;

public class Ejercicio_02_Arrays {
    public static void main(String[] args){
        int[] numbers = new int[20];
        Random random = new Random();

        // 1. Rellenar y mostrar el array
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1, 101);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 2. Inicializamos max y min con el primer elemento del array
        int maxNum = numbers[0];
        int minNum = numbers[0];
        int posMax = 0;
        int posMin = 0;

        // 3. Buscamos el mayor y el menor en un solo bucle (empezamos desde i = 1)
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxNum){
                maxNum = numbers[i];
                posMax = i;
            }
            if (numbers[i] < minNum){
                minNum = numbers[i];
                posMin = i;
            }
        }

        // 4. Mostrar resultados
        System.out.println("El numero mas alto es: " + maxNum + " en la posición: " + posMax);
        System.out.println("El numero mas bajo es: " + minNum + " en la posición: " + posMin);
    }
}
