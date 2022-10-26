package retos;
//Realizar una base para identificar número de dosis
import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int MesesBebe;
        Double PesoBebe;

        System.out.println("ingrese el peso del bebé");
        PesoBebe= leer.nextDouble();

        System.out.println("ingrese número de meses que tiene el bebé");
        MesesBebe= leer.nextInt();

        int X=10;
        int Y=8;
        Double DosisVacuna;
        
        DosisVacuna=((PesoBebe+X)/((MesesBebe*X))*(Y));

        System.out.println("Las dosis que debe aplicar son "+DosisVacuna);

        leer.close();
    }
}

