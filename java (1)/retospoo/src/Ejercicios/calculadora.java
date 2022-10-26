package Ejercicios;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int op, num1, num2; 
        System.out.println("Menú opciones\n 1. Suma \n 2. Resta   \n 3. Multiplicación \n 4. División \n 5. Potenciación \n 6. Raíz cuadrada \n Ingrese el número de la opción que desea realizar");
        op=leer.nextInt();

        System.out.println("Ingrese el número 1");
        num1=leer.nextInt();

        System.out.println("Ingrese el número 2");
        num2=leer.nextInt();

        switch (op) {
                case 1: 
                    int suma=num1+num2;
                    System.out.println("La suma de  los números es "+suma);
                break;

                case 2: 
                    int resta=num1-num2;
                    System.out.println("La resta de  los números es "+resta);
                break;
            
                case 3: 
                    int mult=num1*num2;
                    System.out.println("La multiplicación entre los números es "+mult);
                break;
           
                case 4: 
                    int div=num1/num2;
                    System.out.println("La división entre los números es "+div);
                break;

                case 5: 
                    double Pot1 = Math.pow(num1, num2);
                    System.out.println("La potencia del "+num1+" elevado al "+num2+" es "+Pot1);        
                break;
            
                case 6: 
                    double RaizC1 = Math.sqrt(num1);
                    double RaizC2 = Math.sqrt(num2);
                    System.out.println("La raíz del "+num1+" es "+RaizC1+" y la de "+num2+" es "+RaizC2); 
                break;
        }

    
        leer.close();
    }
}
