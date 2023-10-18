import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("PETKOVA");

        String nombre = "Manolo";
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre);
        System.out.println(nombre.isEmpty());
        System.out.println(nombre.indexOf("n"));
        System.out.println(nombre.indexOf("o"));
        System.out.println(nombre.lastIndexOf("o"));
        System.out.println(nombre.substring(4));
        System.out.println(nombre.substring(2, 4));
        System.out.println(nombre.length());

        //Dada la cuenta bancaria 1234567890123456789

        String cuenta = "1234567890123456789";

        //Se pide extraer los primeros dos digitos

        System.out.println(cuenta.substring(0, 2));

        //Se pide extraer los 10 ultimos

        System.out.println(cuenta.substring(9));

        //Se pide extraer de la posicion 4 a la 9

        System.out.println(cuenta.substring(4, 10));


        //Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”

        String texto = "Nunca mates una mosca sobre la cabeza de un tigre.";

        //        • Mostrar la cadena toda en mayúsculas

        System.out.println(texto.toUpperCase());


        //        • Mostrar la cadena en minúsculas

        System.out.println(texto.toLowerCase());

        //        • Mostrar solo la palabra Nunca

        System.out.println(texto.substring(0, 5));
        System.out.println("(" + texto.substring(0, 5) + ")");

        //        • Mostrar solo la palabra mosca

        System.out.println(texto.substring(16, 21));
        int posicionInicial = texto.indexOf("mosca");

        //        • Mostrar la palabra cabeza

        System.out.println(texto.substring(31, 37));
        System.out.println("(" + texto.substring(31, 37) + ")");

        //        • Mostrar la posición de la letra primera m

        System.out.println(texto.indexOf("m"));

        //        • Devolver la longitud de la cadena

        System.out.println("longitud=" + texto.length());

        //...........//
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Escriba un numero");
        numero = teclado.nextInt();
        System.out.println("numero leido" + numero);
        System.out.println("Escriba un numero");
        numero = teclado.nextInt();
        System.out.println("numero leido" + numero);
        System.out.println("Escriba un numero");
        numero = teclado.nextInt();
        System.out.println("numero leido" + numero);

//Equivalente en un bucle
        for (int contadorInteracciones = 0; contadorInteracciones < 3; contadorInteracciones++) {
            System.out.println("escriba un numero");
            numero = teclado.nextInt();
            System.out.println("numero leido" + numero);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
