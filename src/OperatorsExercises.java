public class OperatorsExercises {
    public static void main(String[] args){
        // CREA UNA VARIABLE CON EL RESULTADO DE CADA OPERACIÓN ARITMÉTICA.
        int a = 2;
        int b = 3;

        var sum = a + b;
        var rest = a - b;
        var mult = a * b;
        var div = a / b;
        var resto = a % b;

        System.out.println(sum);
        System.out.println(rest);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(resto);

        // CREA UNA VARIABLE PARA CADA TIPO DE OPERACIÓN DE ASIGNACIÓN.
        a = b;
        System.out.println(a);
        a += a;
        System.out.println(a);
        a *= a;
        System.out.println(a);
        a = a++;
        System.out.println(a);
        a = ++a;
        System.out.println(a);

        // IMPRIME 3 COMPARACIONES VERDADERAS CON DIFERENTES OPERADORES DE COMPARACIÓN.
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(!(a < b));

        // IMPRIME 3 COMPARACIONES FALSAS CON DIFERENTES OPERADORES DE COMPARACIÓN.
        System.out.println(a == b);
        System.out.println(a <= b);
        System.out.println(!(a > b));

        // UTILIZA EL OPERADOR LÓGICO AND.
        System.out.println(true && true);

        // UTILIZA EL OPERADOR LÓGICO OR.
        System.out.println(false || false);

        // COMBINA AMBOS OPERADORES LÓGICOS.
        System.out.println((true && true) || false);

        // AÑADE ALGUNA NEGACIÓN.
        System.out.println(!((true && true) || false));
        // IMPRIME 3 EJEMPLOS DE OPERADORES UNARIOS.
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(+b);

        // COMBINA OPERADORES ARITMÉTICOS, DE COMPARACIÓN Y LÓGICOS.
    }
}
