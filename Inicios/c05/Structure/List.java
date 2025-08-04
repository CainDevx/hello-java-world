package c05.Structure;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        /*
        Segun entiendo son parecidas a las Arrays, pero pueden cambiar su longitud a gusto,
        pudiendo ser mas Largas o Cortas. Segun nuestra necesidad.
        */

        // Declaracion y creacion

        //De String
        ArrayList<String> names = new ArrayList<>(); // Funciona creando una "list" de String

        //De Integer
        ArrayList<Integer> numbers = new ArrayList<>();
            // Aclaracion: No puedo usar 'int' porque los List no admiten datos primitivos,
            //             tenemos que 'objetos', pero Java creo por cada dato primitivo un Objeto.


        // Nueva forma de crearlas con VAR (yo usaria la otra)
        var nombres = new ArrayList<String>();
        //o
        var numeros = new ArrayList<Integer>();


        // Analizar la longitud
        System.out.println("------Ver la longitud sin ningun elemento add-----------");
        System.out.println(nombres.size()); // Me da cero (0) porque no tiene ningun dato


        // Sumar elementos
        nombres.add("IndiceCero");
        nombres.add("IndiceUno");
        nombres.add("IndiceDos");
        System.out.println("------Ver la longitud con 2 add-----------");
        System.out.println(nombres.size());  //Ahora si tiene 3 elementos

        System.out.println("--------------------------------------------");

        // Acceder a los elementos
        System.out.println(nombres.getFirst());  //El primero

        System.out.println(nombres.get(1));  //Manualmente

        System.out.println(nombres.getLast());  //El ultimo

        System.out.println("--------------------------------------------");


        // Modificar valores (usamos SET())
        nombres.set(2, "IndiceDos@gmail.com");  //Le paso la posicion y que quiero.
        System.out.println(nombres.get(2));  //Manualmente

        System.out.println("--------------------------------------------");


        // Eliminar elemento
        nombres.remove(2);  // Le paso la ubicacion
        // System.out.println(nombres.get(2)); //Tira ERROR porque ya no existe

        System.out.println(nombres.size()); //Paso de 3 a 2 ahora.
        System.out.println("--------------------------------------------");

        // Buscar elementos
        System.out.println(nombres.contains("IndiceCero")); //Sera TRUE
        System.out.println(nombres.contains("Cain")); //Sera FALSE

        /*
        System.out.println(nombres.contains("Cero"));
        No funciona como los String, que podemos pasarle una parte, tiene que ser todo e igual.
        */
        System.out.println("--------------------------------------------");


        // Limpiar o borrar List
        nombres.clear();
        System.out.println(nombres.size()); // Me lo marca porque sabe que es 0, porque borre todo




        // MOUREDEV RECOMIENDA TRABAR SIEMPRE CON ARRAYLIST Y DEJAR LOS ARRAY NORMALES,
        // ENTONCES ESTUDIAR BIEN QUE METODOS PUEDO USAR Y DEJAR LOS ARRAY.
    }
}
