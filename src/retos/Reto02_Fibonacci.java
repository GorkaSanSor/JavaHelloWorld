package retos;

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Fecha publicación resolución: 17/01/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Reto02_Fibonacci {
    public static void main(String[] args){

        long[] fibonacci = new long[50];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.print(fibonacci[0] + ", ");
        System.out.print(fibonacci[1] + ", ");
        for (int i = 2; i < 50; i++){
            fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]);
            System.out.print(fibonacci[i] + ", ");
        }
        System.out.println();
    }
}
