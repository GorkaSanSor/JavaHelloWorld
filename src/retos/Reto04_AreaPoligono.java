package retos;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * El área de un triángulo se calcula multiplicando la base por la altura y dividiendo el resultado entre dos
 * El área de un cuadrado se calcula multiplicando la longitud de uno de sus lados por sí misma
 * El área de un rectángulo se calcula multiplicando su base por su altura
 */

import java.util.Scanner;

public class Reto04_AreaPoligono {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double area = 0;

        System.out.println("Que área quieres calcular:");
        System.out.println("Un Triángulo (1)");
        System.out.println("Un Cuadrado (2)");
        System.out.println("Un Rectángulo (3)");
        int esTriangulo = scanner.nextInt();

        System.out.println("Introduce el tamaño de la base:");
        double base = scanner.nextInt();

        System.out.println("Introduce el tamaño de la altura:");
        double altura = scanner.nextInt();

        if (esTriangulo == 1) {
            area = (base * altura) / 2;
        }
        else if (esTriangulo == 2 || esTriangulo == 3) {
            area = (base * altura) ;
        }

        System.out.println("El área es de: " + area);
    }
}