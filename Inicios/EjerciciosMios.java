import java.util.Scanner;



public class EjerciciosMios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //ver porque tengo que crear el objeto y que es un objeto

/*
        //Cajero de banco

        System.out.println("Indique que operacion quiere realizar: 1) Retiro, 2) Depositar, 3) Consultar saldo");


        int TipoOpc = scanner.nextInt();

        int saldo = 5000;

        if (TipoOpc == 1 ){
            System.out.println("Que monto quiere retirar?");
            int retiro = scanner.nextInt();
            System.out.println("Retiro en proceso...");
            int OpcRetiro = saldo - retiro;
            saldo -= retiro;
            System.out.println("Tu saldo actual es: " + OpcRetiro);
        } else if (TipoOpc == 2) {
            System.out.println("Que monto quiere depositar?");
            int deposito = scanner.nextInt();
            System.out.println("Deposito en proceso...");
            int OpcDeposito = saldo + deposito;
            saldo += deposito;
            System.out.println("Tu saldo actual es: " + OpcDeposito);
        } else if (TipoOpc == 3) {
            System.out.println("Tu saldo actual es:" + saldo);
        }

         */


        // 1 repositor 15890 + bonus 10%
        // 2 cajero 25630,89 fijos
        // 3 supervisor 35860,20 -  11% x jubilacion

        System.out.println("Que tipo de empleado es: 1) Repositor, 2) Cajero, 3) Supervisor");
        int TipoEmpleado = scanner.nextInt();

        if (TipoEmpleado == 1) {
            System.out.println("Empleado Repositor:");
            double SueldoRepositor = 15890 + (15890 * 0.10);
            System.out.println(SueldoRepositor);
        } else if (TipoEmpleado == 2) {
            System.out.println("Empleado Cajero:");
            double SueldoCajero = 25630.89;
            System.out.println(SueldoCajero);
        } else if (TipoEmpleado == 3) {
            System.out.println("Empleado Supervisor:");
            double SueldoSupervisor = 35860.20 - (35860.20 * 0.11);
            System.out.printf("%.2f%n", SueldoSupervisor);
        } else {
            System.out.println("Error");
        }

//--------------------------------------------------------------------
    }
}
