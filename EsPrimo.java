/*
Autor: Juan David Sánchez Guzmán 
Aprendiz de Programación 
Motivo: Dibujar un cuadrado con for...
Algoritmo: Ingrese un numero y en base al numero ingresado, se informa si el numero es primo o no lo es...
Codigo Java hecho con la herramienta Netbeens 12 
version 0.1 construida en Marzo de 2021 
¿Como Funciona?
Datos de entrada    permitidos: {0,1,2,3,4,5,6,7,8,9} y cualquier conbinacion con estos
Datos de entrada No permitidos: {los otros botones del teclado}, es decir datos tipo String, excepto: {0,1,2,3,4,5,6,7,8,9}

Procedimiento: Ver codigo...

Datos de salida: Es primo o no es primo + Dibujo de cuadro

Ejemplo:
Luego de ejecutar el codigo, copie lo que esta contenido en comillas...
Input: "1 2 3 4 5 6 7 8 9 10 0"

Luego de copiar, presione la tecla Enter...
el cero es la unica opcion valida para terminar el ciclo, si no quiere verlo terminar simplemente ingrese numeros que desee separados por espacio...

Mejor con valores menores o iguales a 1000...
"100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76 75 74 73 72 71 70 69 68 67 66 65 64 63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0"
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
