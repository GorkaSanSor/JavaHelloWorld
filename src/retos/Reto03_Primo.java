package retos;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Reto03_Primo {

    public static void main(String[] args) {

        System.out.println("Números primos entre 1 y 100:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            /*
             * isPrime = true  / ASIGNACIÓN
             * isPrime == true / COMPARACIÓN
             */
            if (isPrime == true) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}