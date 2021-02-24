//planificar mejor el proceso por lotes del rango numerico para primos

/*
1 - 4339021
BUILD STOPPED (total time: 125 minutes 58 seconds)

4339021
Lista de numeros primos, segun rango numerico ingresado
Inicia en: Termina en: Ha Terminado
BUILD SUCCESSFUL (total time: 20 minutes 57 seconds)

Por motivo de: if(cuenta >=2 ){j=i-2;}else{}//con esta linea se descarta el numero, sin esperar a sacar todos los posibles divisores del numero 'i'
se puede mejorar, falta comprobar que revise toda la distribucion de primos, no se salte...
*/
package internet;
import java.util.Scanner;
public class RangoPrimos {//por mejorar... pasar al siguiente numero cuando hay mas de un divisor, pues se trata de primos nada mas... mas velocidad...
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
        if( a % 2 == 0 ){//aqui esta el problema, esta condicion excluye todos los pares... pero solo se necesita el unico par primo...
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
                    //No hacer nada, el siguiente else cuenta el total de divisores del numero 'i', mas divisores, no primo, ya casi
                }
                }else{
                    if(cuenta == 1){System.out.println(i);}else{/*nada*/}
                    //System.out.println(i+" - "+cuenta+" divisores");//cuenta 1: primos, cuenta other: no primos, e incluir 2 y 5, como hacerlo?
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
