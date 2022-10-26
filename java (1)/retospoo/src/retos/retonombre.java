package retos;

import java.util.Scanner;

public class retonombre {public static void main(String[] args)throws Exception{  
    Scanner leer= new Scanner (System.in);

        String Nombre, Apellido;

        System.out.println("Digite su nombre");
        Nombre=leer.nextLine();

        System.out.println("Digite su apellido");
        Apellido=leer.nextLine();

        System.out.println(Nombre.toUpperCase());
     
        System.out.println(Apellido.toLowerCase());


  
        System.out.println("Su nombre tiene "+Nombre.length()+" caracteres ");

        System.out.println("Su apellido tiene " +Apellido.length()+ " caracteres");

        System.out.println("Su nombre completo es " +Nombre+" "+Apellido);

        System.out.println((Nombre.substring(0, 2))+Apellido);    
      
 
    leer.close();
    
}
}

    