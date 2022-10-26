package Ejercicios;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
     
        float Nota, Promedio;
        int NotaNum=0;
        float Notaf=0;
        Scanner leer =new Scanner(System.in);  
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Ingrese su nota");
            Nota= leer.nextFloat();
            Notaf= Notaf+ Nota;
            NotaNum= NotaNum+1;
            System.out.println("la nota que ingresaste es la numero "+NotaNum);
            
        }
            
    Promedio=Notaf/4;       
    if  ( 0<=Promedio && Promedio<=2.9 ){
        System.out.println("Tu nota es "+Promedio+ "reprobaste");
                
    }
    else if  (Promedio<=4.0){
        System.out.println("Tu nota es "+Promedio+ "pasaste raspando");
                
    }
    else if  (Promedio<=5.0){
        System.out.println("Tu nota es "+Promedio+ "pasaste con buenos resultados");
                
    }
    else {
        System.out.println("Algun dato esta incorrecto");
    }
            

            
        

        leer.close();    
}
            
}

