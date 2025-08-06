package c05.Structure;

import  java.util.Arrays;
import  java.util.ArrayList;
import  java.util.HashSet;
import java.util.HashMap;
import java.util.List;


public class StructureExercises {
    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        String[] names = new String[5];

        names[0] = "Cain";
        names[1] = "Ana";
        names[2] = "Adrian";
        names[3] = "Nadia";
        names[4] = "Eric";

        System.out.println(Arrays.toString(names));

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        System.out.printf(names[0]);
        names[0] = "Osbaldito Wencheslao";
        System.out.printf(names[0]);

        // 3. Crea un ArrayList vacío.

        ArrayList<String> laptop = new ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

        laptop.add("HP");
        laptop.add("Epson");
        laptop.add("Acer");
        laptop.add("Lenovo");

        laptop.remove(3);

        System.out.println(laptop);



        // 5. Crea un HashSet con 2 valores diferentes.

        HashSet<String> cars = new HashSet<>();

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        cars.add("Toyota");
        cars.add("Chevrolet");
        cars.add("Ford");
        cars.add("Ford");// Me indica ERROR y no la guarda

        System.out.println("Ford".hashCode());  // El codigo Hash 2195675

        // 7. Elimina uno de los elementos del HashSet.

        cars.remove("Toyota");
        System.out.println(cars);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        HashMap<String, Integer> agenda = new HashMap<>();

        agenda.put("Cain", 2344);
        agenda.put("Anita", 1165);
        agenda.put("Adrian", 8821);

        System.out.println(agenda);

        // 9. Modifica uno de los contactos y elimina otro.

        agenda.replace("Adrian", 6666);  // Modificar
        System.out.println(agenda);

        agenda.remove("Cain");
        System.out.println(agenda);  // Borrar

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        String[] PointTen = new String[7];

        PointTen[0] = "Uno";
        PointTen[1] = "Dos";
        PointTen[2] = "Tres";
        PointTen[3] = "Cuatro";
        PointTen[4] = "Cinco";
        PointTen[5] = "Cinco";
        PointTen[6] = "Uno";

        System.out.println(Arrays.toString(PointTen));

         // Pasar de Array a List

        List<String> lista = new ArrayList<>(Arrays.asList(PointTen)); // Hay otro metodo pero mas limitado, este es el FULL

        System.out.println(lista);

         // Pasar de List a Set (Para eliminar duplicados de forma facil)

        HashSet<String> sinDuplicados = new HashSet<>(lista);

        System.out.println(sinDuplicados);


         // Pasar de Set a Map

        // para pasar de un Set a un Map vas a usar un bucle for-each. (todavia no lo se hacer)







    }
}
