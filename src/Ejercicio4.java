import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Definicion de variables
        //Primitivas

        int producto = 1;

        //Instancia

        Scanner teclado = new Scanner(System.in);



        //	Diseñar un programa que muestre el producto (multiplicacion) de los 10 primeros números impares

        for (int i=1; i<=19; i+=2){
            System.out.println(i);
            producto *= 1;
            System.out.println("Producto->"+producto);


        }

    }
}
