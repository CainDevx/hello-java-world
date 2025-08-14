package c06.Loops;

public class LoopExercises {
    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.

        int x = 1;

        while( x != 11){
            System.out.println(x);
            x++;
        };

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.



        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int y=5; y<=50; y++) {
            int resto = y % 5;
            if (resto == 0) {
                System.out.println("Este num es multiplo de 5: " + y);
            }
        };


        // 4. Recorre un Array de 5 números e imprime la suma total.

        Integer[] array = {5,10,15,20,25};

        int count = 0;

        for(int p=0; p < array.length; p++) {
            System.out.println("El numero es ahora: " + array[p]);
            count += array[p];
        };
        System.out.println("El total es ahora: " + count);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

            // Ya lo hice en el de arriba

        // 6. Usa for-each para recorrer un HashSet y un HashMap.



        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        // 10. Crea un programa que calcule el factorial de un número dado.


    }
}
