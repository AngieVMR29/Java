package retos;

import java.util.Scanner;

public class reto6 {
    public static void main(String[] args)throws Exception {
        
        Scanner leer= new Scanner (System.in);
        int precio,cantidad,referencias=0,subtotal,descuento,total=0;
        descuento= (int)(Math.random()*2 + 1);
        String repetir="S";

while(repetir.equalsIgnoreCase("S"))
{
    System.out.println("Digite el precio del producto");
    precio=leer.nextInt();

    System.out.println("Digite la cantidad del producto");
    cantidad=leer.nextInt();
    subtotal=precio*cantidad;
    referencias=referencias+1;
    System.out.println("La cantidad de compras realizadas son "+referencias+" el precio del producto es "+precio+" el total de los productos es "+subtotal);
    //Iniciar el contador de minutos de la compra
    
    //Iniciamos acumulador para el total de la compra
    total=total+subtotal;
    System.out.println("Desea continuar comprando S para Si N para No ");
    repetir=leer.next();
}
    if (descuento==1){
        double desctototal,totalfinal,cambio,vueltas;
        double bolitaA=0.25;
        desctototal=(total*bolitaA);
        totalfinal=total-desctototal;
        
        System.out.println("Su compra es por valor de "+total+" Usted fue beneficiario con un descuento de " +desctototal+"El total a pagar es"+totalfinal+"\n Ingrese el valor con el que va a pagar");
        cambio=leer.nextDouble();
        vueltas=cambio-totalfinal;
        System.out.println("Su cambio es "+vueltas);
        

    }
    else { 
        System.out.println("Usted no fue beneficiario de ningún descuento el valor total de su compra es "+total+"\n Ingrese el valor con el que va a pagar");
        double cambio,vueltas;
        cambio=leer.nextDouble();
        vueltas=cambio-total;
        System.out.println("Su cambio es "+vueltas);
    }
        
    



leer.close();
    }

}