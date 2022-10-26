package retos;
import java.util.Scanner;
public class reto5 {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int Descuento, Precio, Cantidad, PreciodeCompra,  ValorPago;
        float total,desc, Cambio;
        Descuento = (int)(Math.random () * 4 +1);

        System.out.println("Digite el precio del producto");
        Precio= leer.nextInt();
        System.out.println("Digite la cantidad de productos");
        Cantidad= leer.nextInt();
        PreciodeCompra=Precio*Cantidad;
        System.out.println("el valor de la compra actual es"+PreciodeCompra);

        if (Descuento==1 && PreciodeCompra>50000) {
        Double BolitaA=0.10;
        desc= (float) (PreciodeCompra * BolitaA);
        total=PreciodeCompra-desc;
        System.out.println("El valor de la compra es "+PreciodeCompra+" usted fue beneficiario de descuento de la bolita roja, su nuevo valor de la compra es "+total);
        System.out.println("ingrese valor con el que va a pagar");
        ValorPago=leer.nextInt();
        Cambio=ValorPago-total;
        System.out.println("Sun cambio es "+Cambio);
            
        }
        else if (Descuento==2 && PreciodeCompra>50000) {
            Double BolitaA=0.30;
            desc= (float) (PreciodeCompra * BolitaA);
            total=PreciodeCompra-desc;
            System.out.println("El valor de la compra es "+PreciodeCompra+" usted fue beneficiario de descuento de la bolita azul, su nuevo valor de la compra es "+total);
            System.out.println("ingrese valor con el que va a pagar");
            ValorPago=leer.nextInt();
            Cambio=ValorPago-total;
            System.out.println("Sun cambio es "+Cambio);
        }
        else if (Descuento==3 && PreciodeCompra>50000) {
            Double BolitaA=0.50;
            desc= (float) (PreciodeCompra * BolitaA);
            total=PreciodeCompra-desc;
            System.out.println("El valor de la compra es "+PreciodeCompra+" usted fue beneficiario de descuento de la bolita amarilla, su nuevo valor de la compra es "+total);
            System.out.println("ingrese valor con el que va a pagar");
            ValorPago=leer.nextInt();
            Cambio=ValorPago-total;
            System.out.println("Sun cambio es "+Cambio);
        }

        else if (Descuento==4 && PreciodeCompra>50000) {
            System.out.println("Usted saco la bolita blanca, su compra es gratis");
        }
        else {
            System.out.println("Usted no fue beneficiario del descuento, el valor de su compra es "+PreciodeCompra);
            System.out.println("ingrese valor con el que va a pagar");
            ValorPago=leer.nextInt();
            Cambio=ValorPago-PreciodeCompra;
            System.out.println("Sun cambio es "+Cambio);
        }

    
        leer.close();
    }
}

