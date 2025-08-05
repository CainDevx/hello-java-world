package c05.Structure;

import java.util.HashSet;   // Importa el HastSet

public class Sets {
    public static void main(String[] args) {


        /*
        * DIFERENCIA CON LOS LIST, NO PERMITE DUPLICADOS
        *
        * Y GUARDA LA INFORMACION DESORGANIZADAMENTE, NO TIENE UN ORDEN
        *
        * ES UN HASH, SEGUN MOUREDEV ES MUY RAPIDO
        */

        // Declaracion y creacion (Se crea igual que los "List' pero HastSet

        HashSet<String> names = new HashSet<>();
        HashSet<Integer> numbers = new HashSet<>();

        var nombres = new HashSet<String>();
        var numeros = new HashSet<Integer>();

        // Ver longitud System.out.println(nombres.size());

        // Agregar elementos

        nombres.add("Cero");
        nombres.add("Uno");
        nombres.add("Dos");
        nombres.add("Tres");
        nombres.add("Cuatro");
        nombres.add("Dos");  // El duplicado no lo carga y tira ERROR pero SI COMPILA
        System.out.println(nombres.size());
        System.out.println(nombres);

        // Modificar
        //NO SE PUEDE, PORQUE NO SABEMOS EN QUE ORDEN ESTA, PORQUE ES DESORDENADA
        // PERO PODREMOS BUSCAR EL CONTENIDO

        // Buscar un elemento
        System.out.println(nombres.contains("Dos")); // True OR False

        // Eliminar Elementos
           // A comparacion de List, podiamos usar "remove(index), pero aca no podemos usar el INDEX
        nombres.remove("Dos"); // Entonces busco x texto

        // Unir dos Set
        // nombres.addAll(apellidos); ❤️  Pero ambos tienen que tener el MISMO TIPO DE DATO








        // Trabajar con 2 SET

        // Ya tengo nombres y creamos otro
        HashSet<String> paises = new HashSet<>();
        paises.add("Argentina");
        paises.add("Brasil");
        paises.add("Mexico");
        paises.add("Bolivia");
        paises.add("Chile");

        System.out.println(paises);

        System.out.println("--------------------SEPARADOR-------------------------------");

        // Junto 2 Set
        nombres.addAll(paises);  //Es decir al Set "nombres", le agrego el Set "paises"
        System.out.println(nombres);

        System.out.println("--------------------SEPARADOR-------------------------------");
        // Borro un Set de otro Set
        nombres.removeAll(paises);
        System.out.println(nombres);

        //Tambien existe otro con RetainAll, pero no me acuerdo que hace


        //
        String papel = "Sucio";
        System.out.println(papel.hashCode()); // Me devolvio 80236295


        // Ejemplo si hay colision (en este caso no)
        System.out.println("Ana".hashCode()); // → 65972
        System.out.println("ANA".hashCode()); // → 64948



    }
}
