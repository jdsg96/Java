
//package internet;

import java.util.Scanner;


public class SeparaDigitos {
    public static void main(String args[]) {
    Scanner cifra = new Scanner(System.in);
        int ciclo = 1;
        while( ciclo != 0 ){
            
        long number = 0;
        long divisor = 0;
        long control = -1;
        int count = 0;
        
        //System.out.print("Ingrese Numero: ");
        long numero = cifra.nextLong();
        long Numero = numero;
        
        if( numero != 0 ){
            for (long i = 1; numero >= i; i=i*10) {
                //Este for es para identificar el divisor que genere un residuo entre 1 y 9 sobre el numero ingresado
                //System.out.println(numero+" > "+i);
                //System.out.println("\t\t\t"+numero+" / "+i+" = "+(numero/i));
                divisor = i;
            }
/**/if( numero%10 != 0 ){
            for (int i = 0; i != control; divisor = divisor / 10) {
                //System.out.println("va: "+count);
                count = count + 1;
                long residuo = numero % divisor;
                if(residuo != number){
                    System.out.print((numero/divisor)+" : ");
                    numero = residuo;
                }else{
                    System.out.print((numero/divisor));
                    System.out.println("\n"+Numero+" tiene "+count+" digitos");
                    control = 0;
                }
            }
/**/}else{
    numero = numero + 1;
    for (int i = 0; i != control; divisor = divisor / 10) {
    count = count + 1;

    long residuo = numero % divisor;
    if(residuo != number){
    System.out.print((numero/divisor)+" : ");
    numero = residuo;
    }else{
    System.out.print( (numero/divisor) - 1);
    System.out.println("\n"+Numero+" tiene "+count+" digitos");
    control = 0;
    }
    }
/**/}
    System.out.println("");
        }else{
        System.out.println("Ha Terminado");
         ciclo = 0;
    }
    }
    }
    
}
