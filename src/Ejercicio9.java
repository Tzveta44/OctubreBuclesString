import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        //Definicion de variables
        //Primitivas

        int numero = 5;

        //Instancia

        Scanner teclado = new Scanner(System.in);
        {


            //Mostrar por consola la tabla del 5

            for (int i = 1; i <= 50; i += 5) {
                System.out.println(i);
                numero *= 1;
                System.out.println("Producto->" + numero);
            }
        }
    }
}



