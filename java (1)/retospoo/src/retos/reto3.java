package retos;
import java.util.Scanner;

//Realizar una base que cambie grados F° a C°

public class reto3 {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int DadoA;
        DadoA = (int)(Math.random () * 6 +1);
        int DadoB;
        DadoB = (int)(Math.random () * 6 +1);

        System.out.println("Se lanzan los dados el primer dado cae en "+DadoA+" segundo dado cae en "+DadoB);

        if ( DadoA==1 && DadoB==1 || DadoA==6 && DadoB==6) {
            System.out.println("Salió un par de unos o de seis ¡ganaste!");
        }
        else if ( DadoA==1 && DadoB==2 || DadoA==2 && DadoB==1) {
            System.out.println("La suma de tus dados es 3 ¡ganaste!");
        }
        else if ( DadoA==6 && DadoB==5 || DadoA==5 && DadoB==6) {
            System.out.println("La suma de tus dados es 11 ¡ganaste!");
        }
        else if ( DadoA==4 && DadoB==3 || DadoA==3 && DadoB==4 || DadoA==6 && DadoB==1 || DadoA==1 && DadoB==6 || DadoA==5 && DadoB==2 || DadoA==2 && DadoB==5) {
            System.out.println("La suma de tus dados es 7 ¡ganaste!");
        }
        else {
            System.out.println("¡Perdiste!");
        }


    
        leer.close();
    }
}




