/*
Autor: Juan David Sánchez Guzmán 
Aprendiz de Programación 
Algoritmo: Ingrese un numero y en base al numero se dice, si el numero es primo o no lo es...
Motivo: Reto de programacion en que se pide generar un listado de numeros primos 
Codigo Java hecho con la herramienta Netbeens 12 
version 0.1 construida en Febrero de 2021 
Por Mejorar: Legibilidad y Re-estructurar el codigo, tbn de hacerlo de forma decreciente, incluir al 2 y ver si hay otras formas de optimizar el proceso 
sobre la distribucion de los numeros primos, por ejemplo para numeros con muchos digitos 
*/

import java.util.Scanner;
public class EsPrimo{
    public static void main(String [] args) {
    Scanner toche = new Scanner(System.in);
    int ciclo = 1;
    int x = 0;
        while( ciclo != 0 ){
            System.out.print("Numero: ");
            int numero = toche.nextInt();
            if(numero != 0 ){
                for (int i = 1; i < numero+1; i++) {
                    System.out.println("");
                    for (int j = 1; j < numero+1; j++) {//\u25a6
                        //System.out.print("\u25a6 ");
                        if( numero%i ==0 ){
                            System.out.print("\u25a6 ");
                            x++;
                        }else{
                            if(j ==1 || j== numero){
                            System.out.print("\u25a6 ");
                            }else{
                            //System.out.print("\u25a6 ");
                            System.out.print("  ");
                            }
                        }
                    }
                }
                if( x == numero*2 ){
                    System.out.println("\n"+numero+" Es primo");
                }else{
                    System.out.println("\n"+numero+" No es primo");
                }
                numero = 0;
                x = 0;
                System.out.println("\n\n");
            }else{
                System.out.println("Ha Terminado");
                ciclo = 0;
            }
        }
    }
}
