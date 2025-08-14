package z01_primera;
import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Debe, calcular el costo de producción de un artículo,
        teniendo como datos la descripción y el número de unidades producidas.
        El costo se calcula multiplicando el nuero de unidades producidas por
        un factor de costo de materiales de $ 3.5 y sumándole al producto un costo
        fijo de 10.700 pesos.
        */

        // Calcular costo de produccion
        // Pregunto cantidad de unidades
        // costo = (numeros unidades * 3.5) + costo fijo

        System.out.println("Que cantidad quiere pedir?");
        int CantidadProducida = scan.nextInt();

        double CostoMaterial = CantidadProducida * 3.5;
        System.out.println(CostoMaterial);

        double CosteTotal = CostoMaterial + (CantidadProducida * 10700);
        System.out.println("Esta produccion tendra un coste total de: " + CosteTotal);
        // 100 Unidades = $ 1.070.350.0

        scan.close();

        //-------------------------------------


    }
}
