/*
Autor: Juan David Sánchez Guzmán

Aprendiz de Programación
Algoritmo: Lee 2 numeros que corresponde a donde inicia hasta donde termina (rango numerico)
Motivo: Reto de programacion en que se pide generar un listado de numeros primos
Codigo Java hecho con la herramienta Netbeens 12
version 0.1 construida en Febrero de 2021
Por Mejorar: Legibilidad y Re-estructurar el codigo, tbn de hacerlo de forma decreciente, incluir al 2 y ver si hay otras formas de optimizar el proceso
sobre la distribucion de los numeros primos, por ejemplo para numeros con muchos digitos
*/


/*
1 - 4339021
BUILD STOPPED (total time: 125 minutes 58 seconds)

1 - 4339021
Lista de numeros primos, segun rango numerico ingresado
Inicia en: Termina en: Ha Terminado
BUILD SUCCESSFUL (total time: 20 minutes 57 seconds)
*/
package internet;
import java.util.Scanner;
public class RangoPrimos {
    public static void rangoPrimos() {
    Scanner rango = new Scanner(System.in);
    int ciclo = 1;
    int cuenta = 0;
    //1 4339021 0 0
    while( ciclo != 0 ){
        System.out.println("Lista de numeros primos, segun rango numerico ingresado");//falta incluir el 2 como primo...
        System.out.print("Inicia en: ");
    int a = rango.nextInt();
        if( a < 0 ){
            a = (a*-1);
        }else{
            //nada
        }
        if( a % 2 == 0 ){
            a = a+1;
        }else{
            //nada
        }
        System.out.print("Termina en: ");
    int b = rango.nextInt();
        if( b < 0 ){
            b = b*-1;
        }else{
            //nada
        }
    
    if( a != 1 || b != 0 ){//0 0 | 1 0 para salir
        
        for (int i = a; i < b+1; i=i+2) {
        if( i % 5 == 0 && i!= 5 ){
            //¿mostrar multiplos de 5?
        }else{// 1 3 7 9
            for (int j = 1; j <= i; j=j+2) {
                if( i > j ){
                if(i%j==0){
                    cuenta++;
                    if(cuenta >=2 ){j=i-2;}else{}//ULTIMA- REVISAR...
                    //System.out.println(i+" - "+j+" --> "+cuenta+" divisores");
                }else{
                    //No hacer nada, el siguiente else cuenta el total de divisores del numero 'i', mas divisores = no primo.
                }
                }else{
                    if(cuenta == 1){
                        System.out.println(i);//mostrar solamente los numeros primos
                    }else{
                        /*nada*/
                    }
                    //System.out.println(i+" - "+cuenta+" divisores");
                    cuenta = 0;
                }
            }
        }
        }
        
    }else{
        System.out.println("Ha Terminado");
        ciclo = 0;
    }
    }
    }
    public static void main(String[] args) {
        rangoPrimos();
    }
    
}
