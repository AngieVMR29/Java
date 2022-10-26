package estaticas;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] vector1=new int [10];
        vector1 [0]=30;
        vector1 [1]=50;
        vector1 [2]=25;
        vector1 [3]=85;
        vector1 [4]=12;
        vector1 [5]=6;
        vector1 [6]=32;
        vector1 [7]=41;
        vector1 [8]=23;
        vector1 [9]=63;
    

       for (int i = 0; i < vector1.length; i++) {
        System.out.println("posicion "+i+" valor "+(vector1[i]));
        
       }
    
    leer.close();
    } 

}

    
    
    