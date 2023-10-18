import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //  Pedir un numero N y mostrar todo los numeros del 1 al N



        //  Declaracion de variable
        //Primitivas
        int numero=0;
        //  Instancia
        Scanner teclado=new Scanner(System.in);
        //  Pedir el nuevo y leerlo
        System.out.println("escribir un numero->");
        numero=teclado.nextInt();



        for(int i=1; i<=numero; i++){
            System.out.println(i);

        }


        }



    }

