import java.util.Scanner;



public class EjerciciosMios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //ver porque tengo que crear el objeto y que es un objeto


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
    }
}
