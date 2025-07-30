public class OperatorsExercises {
    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.

        int sum = 2 + 2;
        int subtraction = 3 - 2;
        int multiplication = 4 * 4;
        int division = 9 / 3;

        int resto = 7 % 2;

        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + subtraction);
        System.out.println("Multiplicacion: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Resto: " + resto);

        // 2. Crea una variable para cada tipo de operación de asignación.

        //Segun entiendo es el signo igual y ya esta en el anterior

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(5 == 5);
        System.out.println(8 >= 3);
        System.out.println(20 < 99);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(5 != 5);
        System.out.println(8 < 3);
        System.out.println(20 >= 99);

        // 5. Utiliza el operador lógico and.

        int and1 = 5;
        int and2 = 20;

        System.out.println(and1 == 5 && and2 < 10);

        // 6. Utiliza el operador lógico or.

        System.out.println(and1 == 5 || and2 < 10);

        // 7. Combina ambos operadores lógicos.

        System.out.println(and1 == 5 && and2 < 10 || 10 == 10);
        //                      false             or   true

        // 8. Añade alguna negación.

        System.out.println(and1 == 5 && and2 < 10 || !(10 == 10));
        //                      false             or  false

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        int m = 0;
        System.out.println(++m); //lo utilizaria como contador

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        System.out.println(and1 == 5+2 && and2 < 10/2 || !(10 == 10*2));
        //                     false  AND true        OR   true (porque es false invertido)








    }
}
