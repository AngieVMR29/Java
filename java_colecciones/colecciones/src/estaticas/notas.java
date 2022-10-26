package estaticas;

import java.util.Scanner;

public class notas {
    
    public static void main(String[] args) throws Exception {
        double suma=0;
        double promedio;
        int n;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas a promediar");
        n=leer.nextInt();
        double [] vector1=new double [n];
        
        

    

        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese la nota número "+i);
            vector1[i]=leer.nextDouble();
            suma=suma+(vector1[i]);
}

promedio=suma/n;
 if (promedio<=0 || promedio<=2.9) {
    System.out.println("Reprobaste la materia tu promedio final fue "+promedio);
 }

else if (promedio<=3.9){
    System.out.println("Pasaste raspando la materia tu promedio final fue "+promedio);
}

else if (promedio<=5){
    System.out.println("Pasaste con buenas notas tu promedio final fue "+promedio);
}

else {
    System.out.println("Datos ingresados erroneos");
}


    
    leer.close();    
    }
    
}
