package c03.String;

public class StringsExercises {
    public static void main(String[] args) {

        String name = "Hachi";
        int age = 24;
        String raza = "Caniche";


                // 1. Concatena dos cadenas de texto.
        String presentation = String.format("Hola, me llamo %s, tengo %d meses y mi mama era una %s",name,age, raza);
        System.out.println(presentation);

                // 2. Muestra la longitud de una cadena de texto.
        System.out.println(raza.length());

                // 3. Muestra el primer y último carácter de un string.
        char first = raza.charAt(0);
        char last = raza.charAt(6);
        System.out.println("Primero: " + first + " Y el ultimo: " + last);

                // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(raza.toLowerCase());
        System.out.println(raza.toUpperCase());

                // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(raza.contains("che")); //tendria que darme true o false

                // 6. Formatea un string con un entero.
        String PointSix = String.format("Tengo %d huevos de gallina",age);
        System.out.println(PointSix);

                // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("       Hola, Tengo Que Borrar Los Space Adelante y Atras, Entonces Uso TRIM".trim());

                // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("       Hola, Tengo Que Sustituir los Space, Entonces Uso REPLACE".replace(" ", "-"));

                // 9. Comprueba si dos strings son iguales.
        System.out.println(raza.equals("CANICHE")); //FALSE pq no es mayuscula

                // 10. Comprueba si dos strings tienen la misma longitud.
        int longA = raza.length();
        int longB = raza.length();

        System.out.println(longA == longB); //True
        System.out.println((raza.length()) == (raza.length())); //Funciono tambien



    }
}
