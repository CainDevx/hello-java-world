package c01.Variables;

public class VariablasAndConstants {
    public static void main(String[] args) {

        //Variables ✅

        //Tipo de dato (SE LLAMA TIPAR) - nombre = valor de la variable

        String name = "Cain"; //String realmente es una class
        System.out.println(name);

        name = "Inca"; //Por si quiero cambiar el valor de una variable ya inicializada
        System.out.println(name);

        //Tambien estan los primitivos que van en minuscula
        int edad = 33;


        //Constantes (ya que no cambian o varian) ✅
        final String EMAIL = "no-cambio@gmail.com";
        System.out.println(EMAIL);

        //es buena practica escribir las contantes en MAYUSCULAS

        //VAR (es nuevo en Java, no requiere que le digas que tipo de dato tiene) ✅
        var age = 33;
        var name2 = "Cain";

        //ESTO SE LLAMA "INFERENCIA DE TIPO"

        //Pero no admite que le cambies el tipo de dato una vez creada


















    }
}
