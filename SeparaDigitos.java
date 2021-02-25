/*
Autor: Juan David Sánchez Guzmán

Aprendiz de Programación
Algoritmo: Leer un numero y con este, separar y contar sus digitos
Motivo: Reto de programacion en que se pide hacer lo mencionado, con la condicion de emplear long o int para la hechura del algoritmo
Codigo Java hecho con la herramienta Netbeens 12
version 0.1 construida en Febrero de 2021
Por hacer: Re-hacer las instrucciones del algoritmo de otra forma o mejorar la legibilidad del presente codigo y de retirar variables.

Explicacion del codigo( 1ra Construccion): luego de leerse el numero, lo primero, es identificar un divisor al numero ingresado,
este divisor se identifica cuando el cociente del numero ingresado da como cociente el primer digito. Ejemplo
numero ingresado: 78945, este numero es el dividendo y el divisor es 'i' del for
78945 / 1 = 78945
78945 / 10 = 7894
78945 / 100 = 789
78945 / 1000 = 78
78945 / 10000 = 7

Luego se va al otro bloque donde empieza a mostrar en pantalla, desde el 1er digito de la izquierda hasta el ultimo digito.

hay otras condiciones mientras eso ocurre, ademas de variables que agregue para cumplir con el objetivo,
por ejemplo tuve problemas cuando la cifra ingredada es multiplo de 10, como: 10, 100, 500, 1566800000, es decir que termina en cero,
por lo que, con una condicion identifico y le adicion un 1 para que haga el cometido

tbn por el formato de mostrar, emplee condicion para que el ultimo digito a imprimir que corresponde a la unidad, no tengo el "print" de los
otros digitos del numero(por estetica), es decir: 123456 --> "1 : 2 : 3 : 4 : 5 : 6"
                                               previo a eso: "1 : 2 : 3 : 4 : 5 : 6 :" 
*/
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
