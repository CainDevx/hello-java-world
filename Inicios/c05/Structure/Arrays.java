package c05.Structure;

public class Arrays {
    public static void main(String[] args) {

        // Declaracin y creacion
        int[] numbers = new int[3]; //asi creamos un array o en MaxiPrograma lo llama Vectores
        System.out.println(numbers[2]);

        // Crear una cadena de String y asignar
        String[] names = {"Cain", "Enano", "Ana", "Papa Leon", "Kilean"};

        // Acceso al Array
        System.out.println(names[2]);

        // Modificaciones
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;

        System.out.println("Vamos a ver los valores del array 'numbers': " + numbers[0] + ", " + numbers[1] + " y " + numbers[2]);


    }
}
