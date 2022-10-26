package retos;
import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int PPT, Eleccion;
        PPT = (int)(Math.random () * 3 +1);

        System.out.println("Escoja 1.Para piedra, 2.Para papel y 3.Para tijera");
        Eleccion= leer.nextInt();
        System.out.println("¡CAYÓ!"+PPT);
        if (PPT==1 && Eleccion==1) {
            System.out.println("Salió piedra y usted escogió piedra ¡EMPATE!");
        }
        else if (PPT==1 && Eleccion==2) {
            System.out.println("Salió piedra y usted escogió papel ¡GANASTE!");
        }
        else if (PPT==1 && Eleccion==3) {
            System.out.println("Salió piedra y usted escogió tijera ¡PERDISTE!");
        }
        else if (PPT==2 && Eleccion==1) {
            System.out.println("Salió papel y usted escogió piedra ¡PERDISTE!");
        }
        else if (PPT==2 && Eleccion==2) {
            System.out.println("Salió papel y usted escogió papel ¡EMPATE!");
        }
        else if (PPT==2 && Eleccion==3) {
            System.out.println("Salió papel y usted escogió tijera ¡GANASTE!");
        }
        else if (PPT==3 && Eleccion==1) {
            System.out.println("Salió tijera y usted escogió piedra ¡GANASTE!");
        }
        else if (PPT==3 && Eleccion==2) {
            System.out.println("Salió tijera y usted escogió papel ¡PERDISTE!");
        }
        else if (PPT==3 && Eleccion==3) {
            System.out.println("Salió tijera y usted escogió tijera ¡EMPATE!");
        }
        else if (Eleccion!=1 || Eleccion!=2 || Eleccion!=3) {
            System.out.println("Digitaste una opción invalida");
        }
        else {
            System.out.println("Datos incorrectos");
        }

        
        leer.close();

    }
    
}





