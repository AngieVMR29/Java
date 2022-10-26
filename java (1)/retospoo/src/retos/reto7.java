package retos;

import java.util.Scanner;

public class reto7 {public static void main(String[] args)throws Exception
    {  Scanner leer= new Scanner (System.in);
    int valorglobal,valorapostado,eleccion,Caraysello;
    Caraysello= (int)(Math.random()*2 + 1);
    String repetir="S";
    valorglobal=500000;
    int vecesjugadas=0;

    

    while(repetir.equalsIgnoreCase("S")){

    System.out.println("Digite el valor a apostar");
    valorapostado=leer.nextInt();

    System.out.println("Tire la moneda escogiendo 1 para cara y 2 para sello");
    eleccion=leer.nextInt();
    vecesjugadas=vecesjugadas+1;

    if (Caraysello==1 && eleccion==1){
    valorglobal=valorglobal+(valorapostado*2);
    System.out.println("Usted escogio cara y salio cara Ganaste y el valor apostar ahora es "+valorglobal);
    System.out.println("Desea continuar jugando S para Si N para No ");
        repetir=leer.next();
}
    else if (Caraysello==2 && eleccion==1){
        valorglobal=valorglobal-valorapostado;
        System.out.println("Usted escogio cara y salio Sello Perdiste el valor actual para apostar es "+valorglobal);
        System.out.println("Desea continuar jugando S para Si N para No ");
        repetir=leer.next();
    }

    else if (Caraysello==2 && eleccion==2){
        valorglobal=valorglobal+(valorapostado*2);
        System.out.println("Usted escogio Sello y salio Sello Ganaste y el valor apostar ahora es "+valorglobal);
        System.out.println("Desea continuar jugando S para Si N para No ");
        repetir=leer.next();
}

    else if (Caraysello==1 && eleccion==2){
        valorglobal=valorglobal-valorapostado;
        System.out.println("Usted escogio Cara y salio Sello Perdiste el valor actual para apostar es "+valorglobal);
        System.out.println("Desea continuar jugando S para Si N para No ");
        repetir=leer.next();
}

    else {
    System.out.println("Los Datos ingresados son Incorrectos ");

}
     

    
}
        
      
 System.out.println("Usted finalizo el juego el valor que le queda es "+valorglobal+ " y las veces que jugo fueron "+vecesjugadas);
    
 
 leer.close();  
    
}
}