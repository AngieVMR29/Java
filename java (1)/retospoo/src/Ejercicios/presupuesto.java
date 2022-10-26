package Ejercicios;

import java.util.Scanner;

public class presupuesto {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);  
        String repetir= "s";
        int presupuesto=100000;
        int g=0;
        int gasto;
        while (repetir.equals("S") || repetir.equals("s")) {
            System.out.println("Ingrese el valor del gasto");
            gasto= leer.nextInt();
            presupuesto=presupuesto-gasto;
            g=g+1;
            System.out.println("Este es el gasto numero "+g);
            
            if (presupuesto>0 && g<=3) {
                System.out.println("El presupuesto que le queda es "+presupuesto);
                System.out.println("Va a seguir gastando ingrese s para seguir o n para terminar");
                repetir= leer.next();
                
            }
            else if (presupuesto<0 && g<=3) {
                System.out.println("Su presupuesto es insufuciente para más gastos");
                break;

            }
            else{
                break;
            }
                
        System.out.println("Sus gastos han terminado, el presupuesto que le queda es "+presupuesto );
            
        }
    leer.close();

    }
    
}




    
