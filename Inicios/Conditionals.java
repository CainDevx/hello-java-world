public class Conditionals {
    public static void main(String[] args) {

        //Condicionales

        int age = 13;
        boolean licence = true;


        if (age >= 18) {
            System.out.println("Puede manejar un auto");
        } else {
            System.out.println("No puede manejar");
        }

        //If anidados
        int age2 = 18;

        if (age2 <= 13) {
            System.out.println("Anda a estudiar a la Primaria");
        } else if (age2 >= 14 && age2 <= 17) {
            System.out.println("Anda a la Secundaria");
        }else {
            System.out.println("Anda a Trabajar");
        }



        //Switch

        int day = 9;

        switch (day) {
            case 1:
                System.out.println("Es Lunes");
                break;    //Lo que hace el break es romper y salir una vez encuentre coincidencia
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domigo");
                break;
            default:
                System.out.println("Es Osbaldo");
                break;
        }

    }
}
