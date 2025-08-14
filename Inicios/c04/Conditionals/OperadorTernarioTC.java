package c04.Conditionals;

import java.util.Scanner;

public class OperadorTernarioTC {
    public static void main(String[] args) {

        // Operador Ternario (TodoCode Academy)

        double promedio;
        String CondicionFinal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el promedio general del estudiante:");
        promedio = teclado.nextDouble();

        CondicionFinal = promedio >=6 ? "Aprobado" : "Desaprobado";
        System.out.println(CondicionFinal);


    }
}
