
import java.util.Scanner;
public class ConditionalExercises {

    public static void main(String[] args){

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var age = 18;

        if (age >= 18){
            System.out.println("Adelante, puedes votar.");
        }
        else {
            System.out.println("Aún no puedes votar, espera a cumplir 18 años.");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int a = 2;
        int b = 5;

        if (a > b){
            System.out.println(a + " es mayor que " + b);
        }
        else if (a < b){
            System.out.println(a + " es menor que " + b);
        }
        else{
            System.out.println(a + " es igual que " + b);
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int num = 7;

        if (num > 0){
            System.out.println(num + " es positivo");
        }
        else if (num < 0){
            System.out.println(num + " es negativo");
        }
        else {
            System.out.println(num + " es nulo");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int isPar = 7;

        if (isPar % 2 == 0){
            System.out.println(isPar + " es par");
        }
        else{
            System.out.println(isPar + " es inpar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int range = 38;

        if (range >= 1 && range <= 100){
            System.out.println(range + " está en el rango de 1 a 100");
        }
        else {
            System.out.println(range + " no está en el rango de 1 a 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var day = 6;

        switch (day){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miércoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sábado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("Error. Introduce un día correcto");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota =  86;

        if (nota >= 0 && nota < 50) {
            System.out.println("Suspenso");
        }
        else if (nota >= 50 && nota < 85) {
            System.out.println("Aprobado");
        }
        else if (nota >= 85 && nota <= 100) {
            System.out.println("Sobresaliente");
        }
        else{
            System.out.println("Error. Introduce nota entre 0 y 100");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int minAge = 15;
        boolean acompañante = false;

        if (minAge >= 15){
            System.out.println("Puedes entrar");
        }
        else if (minAge < 15 && acompañante == true){
            System.out.println("Puedes entrar");
        }
        else{
            System.out.println("NO puedes entrar");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una letra:");
        char character = Character.toLowerCase(scanner.next().charAt(0));

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            System.out.println("La letra: " + character + " es una vocal.");
        }
        else if (character >= 'a' && character <= 'z'){
            System.out.println("La letra: " + character + " es una consonante.");
        }
        else{
            System.out.println("Error. Introduce una letra");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int num1 = 4;
        int num2 = 2;
        int num3 = 5;

        if (num1 > num2 && num1 > num3){
            System.out.println("El numero " + num1 + " es el mayor de los tres (" + num1 + ", " + num2 + ", " + num3 + ").");
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("El numero " + num2 + " es el mayor de los tres (" + num1 + ", " + num2 + ", " + num3 + ").");
        }
        else{
            System.out.println("El numero " + num3 + " es el mayor de los tres (" + num1 + ", " + num2 + ", " + num3 + ").");
        }
    }
}
