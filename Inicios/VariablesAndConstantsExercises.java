public class VariablesAndConstantsExercises {
    public static void main(String[] args) {
        /*
        Variables y constantes
        1. Declara una variable de tipo String y asígnale tu nombre.
        2. Crea una variable de tipo int y asígnale tu edad.
        3. Crea una variable double con tu altura en metros.
        4. Declara una variable de tipo boolean que indique si te gusta
        programar.
        5. Declara una constante con tu email.
        6. Crea una variable de tipo char y guárdale tu inicial.
        7. Declara una variable de tipo String con tu localidad, y a
        continuación cambia su valor y vuelve a imprimirla.
        8. Crea una variable int llamada a, otra b, e imprime la suma de
        ambas.
        9. Imprime el tipo de dos variables creadas anteriormente.
        10. Intenta declarar una variable sin inicializarla y luego
        asígnale un valor antes de imprimirla.
         */

        String name = "Cain";
        int age = 33;

        double height = 1.77;

        boolean AreYouLikePrograming = true;

        String email = "mail@gmail.com";

        char initial = 'C'; //Comilla simples para Char

        String location = "Viedma";
        System.out.println(location);
        location = "Patagones";
        System.out.println(location);

        int a = 3;
        int b = 5;
        System.out.println(a+b);
        System.out.println(((Object)a).getClass().getSimpleName());
        System.out.println(((Object)b).getClass().getSimpleName());


        String city;
        city = "Rio Negro";
        System.out.println(city);
    }
}
