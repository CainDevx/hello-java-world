package c06.Loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // 04:24:22 | 45 - Bucles
        // 04:26:43 | 46 - for
        // 04:37:26 | 47 - forEach
        // 04:46:39 | 48 - while / do while
        // 04:54:48 | 49 - Control de bucles
        // 04:59:53 | 50 - Ejercicios: Bucles

        // Loops

        // - for
        for (int x=0; x<5; x++) {
            System.out.println(x);
            System.out.println("Hola Java!");
        };

        // Ejemplo Array-For

        String[] escuelas = {"California SA", "School Jupiter", "Mansory", "Python School Jr"};

        for (int index=0 ; index<4 ; index++) {
            System.out.println(index);
            System.out.println(escuelas[index]);
        };

        // For-Array DINAMICO
        // PARA NO CONTAR Y HACER EL INDEX<4, PODEMOS HACER EL ARRAY.LENGHT
        for (int index=0 ; index<escuelas.length ; index++) {
            System.out.println(index);
            System.out.println(escuelas[index]);
        };

        //---------------------------------------------------------------------------
        System.out.println("------------------------------------------------------");

        //For-Each (ideal para recorrer Array, Listas, Set y Maps

        for (String escuela: escuelas) {
            System.out.println(escuela);
        };

            // Explicacion: Crea una variable que va recorriendo la Estructura y la va mostrando,
                       //   el valor de esa Varible va cambiando mientras recorre.

        // Ahora con List:
        ArrayList<String> names = new ArrayList<>();
        names.add("Marta");
        names.add("Mauro");
        names.add("Mirtha");
        names.add("Monica");
        names.add("Mauricio");

        for (String name: names) {
            System.out.println(name);
        };

        // Ahora con Sets
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(33);
        numbers.add(35);
        numbers.add(43);
        numbers.add(65);
        numbers.add(68);

        for (Integer number: numbers) {
            System.out.println(number);
        };

        // Ahora con Maps
        HashMap<Integer,String> CodigosPostales = new HashMap<>();
        CodigosPostales.put(8500, "Viedma");
        CodigosPostales.put(8400, "Carmen de Patagones");
        CodigosPostales.put(1000, "Loberia");
        CodigosPostales.put(3750, "Cagliero");

        for (Map.Entry<Integer,String> cp: CodigosPostales.entrySet()) {
            System.out.println(cp);
            System.out.println(cp.getKey()); // Para solo tener la Key
            System.out.println(cp.getValue()); // Para tener el Value
        };

        //---------------------------------------------------------------------------
        System.out.println("------------------------------------------------------");

        // While (Repite hasta que pase algo)

        // while (condición) {
            // Código que se ejecuta mientras la condición sea verdadera }

        /*
          Cuando usar un While?
            - No se exactamente la cantidad de vueltas.
            - Depende que algo cambie adentro.
            - Que el usuario escriba "salir" por ejemplo
            - O alguna Bandera se active.
        */

        // Lógica de programación	|          Java
        // while (x != "salir")	    | while (!x.equals("salir"))

        Scanner scanner = new Scanner(System.in);
        String entrada = "";  // Podria ponerle " = scanner.nextLine();" pero pediria info ante del aviso

        while (!entrada.equals("salir")) {  //Mientras lo que escriba NO sea igual a 'salir', seguí pidiendo datos.
            System.out.print("Escribí algo (o 'salir'): ");
            entrada = scanner.nextLine();
        }

        //---------------------------------------------------------------------------
        System.out.println("------------------------------------------------------");

        // Do-while

        Scanner ScanPass = new Scanner(System.in);
        String password;

        do {
            System.out.println("Ingresa la password (123456): ");
            password = scanner.nextLine();
        } while (!password.equals("123456"));  // Aca pongo la password correcta
            System.out.println("Acceso Permitido!");

        //---------------------------------------------------------------------------
        System.out.println("------------------------------------------------------");

        // Control de Bucles (break y continue)

         // - break
        // String[] escuelas = {"California SA", "School Jupiter", "Mansory", "Python School Jr"};

        for (String escuela: escuelas) {
            System.out.println(escuela);
            if (escuela.equals("Mansory")) {
                System.out.println("Lo encontre y salgo");
                break;
            }
        };



        // - continue (es un salto, salto lo que no me interesa)

        for (String escuela: escuelas) {
            if (escuela.equals("Mansory")) {
                System.out.println("Encontre a Mansory y lo salto");
                continue;
            }
            System.out.println(escuela);
        };





















    }
}
