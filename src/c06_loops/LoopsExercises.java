package c06_loops;

import java.util.HashSet;
import java.util.Scanner;

public class LoopsExercises {
    public static void main(String[] args){

        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        int index = 0;
        String [] numbers = {"uno", "dos", "tres", "cuatro"};

        do {
            System.out.println(numbers[index]);
            index++;
        } while (index < numbers.length);

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        System.out.println("Los múltiplos de 5 (1-50) son:");
        for (int num = 1; num <= 50; num++) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int [] numArray = {1, 2, 3, 4, 5};
        int sum = 0;

        System.out.print("La suma de {1, 2, 3, 4, 5} es: ");
        for (int num = 0; num < numArray.length; num++) {
            sum += numArray[num];
        }
        System.out.println(sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        System.out.print("El array contiene los siguientes números: ");
        for (int num = 0; num < numArray.length; num++) {
            System.out.print(numArray[num] + " ");
        }
        System.out.println();

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<Integer> myHashSet = new HashSet<>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(5);

        for (Integer number: myHashSet) {
            System.out.println(number);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int num = 10; num > 0; num--) {
            System.out.println(num);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        System.out.print("Los números del 1 al 20 (menos los múltiplos de 3) son: ");
        for (int num = 1; num <= 20; num++) {
            if (num % 3 == 0) {
                continue;
            }
            System.out.print(num + " ");
        }
        System.out.println();

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int [] witNegative = {2, 5, 7, -2, 8, 9};

        System.out.println("Los números del array son: {2, 5, 7, -2, 8, 9}");
        System.out.print("Los números hasta el encontrar el negativo son: ");
        for (int num = 0; num < witNegative.length; num++) {
            if (witNegative[num] > 0) {
                System.out.print(witNegative[num] + " ");
            }
            else {
                break;
            }
        }
        System.out.println();

        // 10. Crea un programa que calcule el factorial de un número dado.
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un número positivo: ");
        int numero = scan.nextInt();
        int factorial = 1;

        for (int cont = 1; cont <= numero; cont++) {
            factorial *= cont;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
