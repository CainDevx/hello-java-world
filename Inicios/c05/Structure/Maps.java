package c05.Structure;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Declaracion y creacion

        HashMap<String, String> names = new HashMap<>();

        var numbers = new HashMap<Integer, String>();

        /*
            Los MAP pueden ser sin problemas:
            KEY   | VALUE
            ---------------
            String - String
            String - Integer
            Integer - String
            Integer - Integer
        */

        // Ver longitud System.out.println(nombres.size());

        // Agregar elementos

        names.put("carrasco@gmail.com", "Anita");
        names.put("cain@gmail.com", "Caincito");
        names.put("adrian@gmail.com", "Adriancito");

            // Otra forma:
             names.putIfAbsent("casita@gmail.com", "MiCasita"); // Solo lo añade si no existe

        System.out.println(names.size()); // Tiene 3 elementos
        System.out.println(names); //{cain@gmail.com=Caincito, carrasco@gmail.com=Anita, adrian@gmail.com=Adriancito}

        // Acceder al dato (solo x Key)

        System.out.println(names.get("cain@gmail.com"));

            // Y si no existe??
            System.out.println(names.get("vicenta@gmail.com")); // null

        // Verificar si existe el dato (solo x Key) Da True OR False

        System.out.println(names.containsKey("cain@gmail.com")); // True
        System.out.println(names.containsKey("false@gmail.com")); // False
        // Por Value
        System.out.println(names.containsValue("Caincito"));  // True


        // Eliminacion (Por KEY)

        System.out.println(names.remove("cain@gmail.com"));
        System.out.println(names);

        // Modificacion

        names.replace("adrian@gmail.com", "Padre"); // Reemplaza el valor si existe
        System.out.println(names);

        // Otras Operaciones

        System.out.println(names.isEmpty()); // Pregunta, esta vacio? False o True
        System.out.println(names.values());  // Me da solo los Value

        // Limpieza

        names.clear();
        System.out.println(names);



    }
}
