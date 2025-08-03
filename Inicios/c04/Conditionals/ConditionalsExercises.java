package c04.Conditionals;

public class ConditionalsExercises {
    public static void main(String[] args) {


        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        int age = 33;

        if (age >= 18) {
            System.out.println("Tiene " + age + ", si puede votar");
        } else {
            System.out.println("Tiene " + age + ", es menor");
        }

        System.out.println("---------------------------------");
// 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        int num1 = 65;
        int num2 = 72;

        if (num1 > num2) {
            System.out.println(num1 + ", Es Mayor que: " + num2);
        } else {
            System.out.println(num2 + ", Es Mayor que: " + num1);
        }

        System.out.println("---------------------------------");
// 3. Dado un número, verifica si es positivo, negativo o cero.

        int PointTree = -5;

        if (PointTree == 0) {
            System.out.println("Es cero");
        } else if (PointTree >= 1) {
            System.out.println("Numero Positivo");
        } else {
            System.out.println("Numero Negativo");
        }

        System.out.println("---------------------------------");
// 4. Crea un programa que diga si un número es par o impar.

        int PointFour = 3;

        int resto = PointFour % 2;

        if (resto == 1) {
            System.out.println("Numero Impar");
        } else {
            System.out.println("Numero Par");
        }

        System.out.println("---------------------------------");
// 5. Verifica si un número está en el rango de 1 a 100.

        int PointFive = 54;

        if (PointFive >=1 && PointFive <= 100) {
            System.out.println("Estamos entre 1 y 100");
        }

        System.out.println("---------------------------------");
// 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        String day = "Jueves";

        switch (day) {
            case "Lunes":
                System.out.println("Con todo al energia");
                break;
            case "Martes":
                System.out.println("Ya me molesta todo");
                break;
            case "Miercoles":
                System.out.println("Ya estoy por la mitad");
                break;
            case "Jueves":
                System.out.println("Tragame tierra");
                break;
            case "Viernes":
                System.out.println("Es muy Viernes");
                break;
            case "Sabado":
                System.out.println("A descansar");
                break;
            default:
                System.out.println("Nooo Osbaldo");
        }

        System.out.println("---------------------------------");
// 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        int nota = 95;

        if (nota >= 60) {
            if (nota >= 90) {
                System.out.println("Sobresaliente");
            } else {
                System.out.println("Aprobado");
            }
        } else {
            System.out.println("Suspendiste la materia");
        }

        System.out.println("---------------------------------");
// 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        int AgeForCinema = 15;
        boolean IsAlone = false;

        if (AgeForCinema >= 15 || IsAlone == true) {
            System.out.println("Pasa a mirar la pelicula");
        } else {
            System.out.println("No tenes la edad, volve con alguien");
        }

        System.out.println("---------------------------------");
// 9. Crea un programa que diga si una letra es vocal o consonante.

        char letter = 'I';

        if (letter == 'A' ||letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Es una vocal: " + letter);
        } else {
            System.out.println("Es una conosolante: " + letter);
        }

        System.out.println("---------------------------------");
// 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        int A = 3;
        int B = 6;
        int C = 9;

        if (A > B) {
            if (A > C) {
                System.out.println("El mayor es A");
            } else {
                System.out.println("El mayor es C");
            }
        } else {
            if (B > C) {
                System.out.println("El mayor es B");
            } else {
                System.out.println("El mayor es C");
            }
        }





    }
}
