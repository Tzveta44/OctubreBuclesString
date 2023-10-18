import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Definicion de variables
        //Primitivas

        int numero = 0;
        int suma = 0;


        //Instancia

        Scanner teclado = new Scanner(System.in);


        //  Pedir 5 números y escribir la suma total

        for (int i = 1; i <= 5; i++) {
            System.out.println("Escriba el numero->");
            numero = teclado.nextInt();
            suma = suma + numero;
            System.out.println("Valor variable suma->" + suma);

        }

    }
}