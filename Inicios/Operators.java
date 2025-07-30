import org.w3c.dom.ls.LSOutput;

public class Operators {
    public static void main(String[] args) {

        //Operadores


        //Operadores Aritmeticos (suma, resta, multiplicacion y division)

        int a = 10;
        int b = 5;

        int addition = a + b;
        int substraction = a - b;
        int multiplication = a * b;
        int division = a / b;  //Si la division no da entero marca error, ejemplo 1/2 es 0.5 seria float.

        System.out.println(addition);
        System.out.println(substraction);
        System.out.println(multiplication);
        System.out.println(division);


        //Resto

        int ParImpar = 7;
        int Resto = ParImpar % 2;

        System.out.println("El resto es: " + Resto);

        /*
        ///////////////////////////////////////////////////////////////////////
        */

        //Operadores de Asignacion  (es el signo de igual)

        a = b; //Osea ahora A vale lo mismo que B

        a += 1; //significa que ahora A mas 1

         //Tambien existe los:

        a -=1;  //resta
        a *=2;  //multiplicacion
        a /=2;  //division

        /*
        ///////////////////////////////////////////////////////////////////////
        */

        //Operadores de Compraracion o relacionales

        int z = 10;
        int x = 5;

        System.out.println(z == x);
        System.out.println(z != x);
        System.out.println(z <= x); //menor o igual
        System.out.println(z >= x); //mayor o igual


        /*
        ///////////////////////////////////////////////////////////////////////
        */

        //Operadores Logicos

        //AND  - Y (Tambien llamada "Conjuncion Logica)
           //Ambos valores tienen que ser VERDADEROS
        //OR - O (Tambien llamado "Diyuncion logica)
           //Devuelve verdadero si al menos 1 es VERDADERO
        //NOT - NO (Tambien llamada "Negacion logica")
           //Devuelve TRUE si la entra es FALSE o devuelve FALSE si la entrada es TRUE

// Ejercicios
// ¿Cuál es el resultado de esta expresión combinada?
        /*
        (false or true) and (not true or false)
        true and false = false //resultado final FALSE

        not (true and (false or not false)) or (true and false)
        false or false = false //resultado final FALSE
        */

        System.out.println(2 >= 5 && 10 < 1 );
        System.out.println(2 >= 5 && 10 == 2 );
        System.out.println(20 >= 5 && 10 == 10 );


        //Operadores Unarios

        System.out.println(-z); //vuelvo negativo al valor de Z
        System.out.println(++z); //Esto lo que hace es aumentarlo y despues Print
        System.out.println(z++); //Esto hace Print y luego lo aumenta.

        //Funciona con el ++ o --, yo lo uso delante B++

























    }
}
