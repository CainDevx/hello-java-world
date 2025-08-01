public class Strings {
    public static void main(String[] args) {

        String name = "Cain";
        String surname = "Caamina";

        //Operacion basica
        System.out.println(name + " " + surname);

        //Metodo Lenght

        System.out.println(name.length()); //Al ser un objeto le ponemos un '.' y nos da opciones

        //Obtener a un caracter

        System.out.println(name.charAt(0)); //Com CharAt nos trae que letra tiene en esa posicion.

        //Subcadena; Creo que es hacer un mini string del string original

        System.out.println(name.substring(1));
                     //o podemos indicarle donde empezar y terminar
        System.out.println(name.substring(1,3));

        //Todo a MAYUS O MINISCULA

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());


        //Comprobar si tengo coincidencia

        System.out.println("Hola Universo de Java!".contains("ava")); //Pregunto si contiene ese "ava"
        //Me devuelve TRUE o FALSE

        //Comparacion
        // No usar el ==, siempre equels()

        System.out.println(name.equals("cain"));  //Nos da TRUE o FALSE
        System.out.println(name.equalsIgnoreCase("CAIN")); //Ignora KeySensitive


        //Limpieza de Datos

        //Trim
        System.out.println("    Pruebo el trim que borra los espacios ".trim());  //Trim borra los espacios delante y detras
                            //Aqui deje espacios

        //Repleace
        System.out.println("    Soy replace y en este ejemplo caso los space ".replace(" ", ""));

        System.out.println("Ahora puedo hablar todo con la letra A".replace("a", "e"));
                //Recuerda el Key Sensitive


        // Format

        String user = "pulpo";
        int range = 3;

        System.out.println(String.format("Hola mi usuario es %s es y tengo el rango %d", user,range));
        //%s: es para texto
        //%d: es para numero entero
        //%f: es para decimales

        //Es como una forma de concatenar dinamicamente

        //Ejemplo interesante, si tengo una variable double
        double nota = 3.456;
        String NotaFinal = String.format("Nota final: %.1f", nota); //Puedo ajustar los decimales
















    }
}
