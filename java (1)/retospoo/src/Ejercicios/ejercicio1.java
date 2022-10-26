package Ejercicios;
import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) throws Exception {
    int Minutos=0;
    int ValorTotal=0;
    int Precio, Cantidad, SubTotal, ValorPago, Cambio, Eleccion;   
    
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Digite el precio del producto");
            Precio= leer.nextInt();
            System.out.println("Digite la cantidad de productos");
            Cantidad= leer.nextInt();
            SubTotal= Precio*Cantidad;
            
            System.out.println(Cantidad+" del producto es "+Precio+" es "+SubTotal);
            Minutos=Minutos+1;
            ValorTotal= ValorTotal+SubTotal;
 
           }
        
        System.out.println("El valor total de la compra es  "+ValorTotal);
        System.out.println("Ingrese el valor con el que va a pagar");
        ValorPago= leer.nextInt();
        Cambio=ValorPago-ValorTotal;
        System.out.println("Su cambio es "+Cambio);

        System.out.println("¿Cuenta con telefonia movi Exito? 1.SI 2.NO");
        Eleccion= leer.nextInt();

        if (Eleccion==1) {
            System.out.println("Los minutos obtenidos son "+Minutos);   
        }
        else if (Eleccion==2) {
            System.out.println("No pierdas más minutos y adquiere ya ti telefonia movil");  
        } 
        else {
            System.out.println("Datos incorrectos");  
        }


        






        

        
    
        
       
        
        leer.close();
    }
}
