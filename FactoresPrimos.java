/*
Juan David Sanchez Guzman
Aprendiz de Programacion
15 de abril de 2021
Algoritmo para sacar los factores primos de un numero
se duplico el codigo, un metodo muestra el procedimiento y el otro lo muestra de forma expresada
Hecho en netbeens 12 en Ubuntu y probado en ubuntu
*/
//package internet;

import java.util.Scanner;
/*import java.io.*;*/

public class FactoresPrimos {
        static void FactoresPrimosa(long num) {
    long exp = 0;
            System.out.println("\nNumero\tBase\tExponente");
        for (long i = 2; i < num + 1;) {
            if( num%i==0 ){
                exp++;
                System.out.println(num+"\t"+i+"\t"+exp);
                num = num/i;
            }
            else{
                exp = 0;
                i++;
            }
        }
        System.out.println("");
        exp = 0;
    }
    static void FactoresPrimosb(long num) /*throws IOException*/ {
    /*FileWriter factor = new FileWriter("/home/juan/Desktop/factor");//Ubuntu, ponga la direccion donde quiere guardarlo y el formato *.txt*/
    long exp = 0;
        System.out.print(num+"  -->  ");
        for (long i = 2; i < num + 1;) {
            if( num%i==0 ){
                exp++;
                if(num==i){// esta inferencia es para mostrar el ultimo o unico exponente del ultimo numero primo
                    System.out.println(i+"^"+exp);
                    /*factor.write(i+"^"+exp);*/
                }else{
                }
                num = num/i;
            }
            else{
                if( (exp*i) != 0 ){// Esta inferencia es para mostrar el ultimo exponente del factor del primo dado
                System.out.print(i+"^"+exp+"  -  ");
                /*factor.write(i+"^"+exp+"  -  ");*/
                }else{
                }
                exp = 0;
                i++;
            }
        }
        System.out.println("---");
        exp = 0;
        /*factor.close();*/
    }
    public static void main(String[] args)/*throws IOException*/ {
        Scanner factor = new Scanner(System.in);
        
        while(true){//Solamente numeros de 18 cifras o menos, sale digitando 0;
            //System.out.print("Ingrese Numero: ");//Digitando cero o una tecla distinta de los digitos para salir... pendiente try, catch
            long num = factor.nextLong();
            
            if( num != 0 ){
                FactoresPrimosa(num);//muestra procedimiento
                FactoresPrimosb(num);//muestra de forma expresada en potencias
            }else{
                System.out.println("Ha Terminado");
                break;
            }
        }
    }
    
}
// 1999999999999999999 0
// BUILD SUCCESSFUL (total time: 1 minute 37 seconds)

//Luego de ejecutar el codigo puede copiar una lista de numeros, por ejemplo:

// 4 9 16 25 36 49 64 81 127 121 0
/*
4
9
16
25
36
49
64
81
127
121
0
*/
