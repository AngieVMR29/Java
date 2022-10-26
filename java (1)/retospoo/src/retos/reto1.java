package retos;
import java.util.Scanner;
//Realizar una base que cambie grados F° a C°

public class reto1 {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int Gf;
        System.out.println("ingrese grados F°");
        Gf= leer.nextInt();
        
        Double GradosC;
        
        int VarX =32;
        double VarY =1.8;
        
        GradosC=(Gf-VarX)/VarY;

        System.out.println("Los grados centigrados que debe usar son "+GradosC);
        leer.close();
    }
}
