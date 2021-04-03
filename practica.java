
//package arreglos;
import java.util.Scanner;
/*
Autor: Juan David Sánchez Guzmán 
Aprendiz de Programación 
Motivo: Practicar
Algoritmo: lista de numeros primos hasta numero ingresado
    se hizo con condicionales y 2 for
Codigo Java hecho con la herramienta Netbeens 12
    luego de ejecutar el codigo, copie y pegue: 300000 0
    puede usar cualquier numero, excepto el cero pues con este termina el programa
    no tiene el control de excepcion en caso de que se teclee un boton del teclado distinto a las teclas que representan a los digitos...
03 de Abril de 2021
*/
public class practica {
    static void primo(){
    Scanner ok = new Scanner(System.in);
    int primo = 0;
    long hay = 0;
    
    while(true){
    System.out.print("Hasta: ");
    long num = ok.nextLong();
        
        if( num != 0 ){
            for (long i = 1; i < num + 1;) {
                for (long j = 1; j < i+1; j=j+2) {
////////////////////////////////////
                    if((i/2)+1 > j){
                    }else{ j = i; }
////////////////////////////////////
                    if(i%j==0){ primo++; }
                    else{ /*¿nada?*/ }
                }
                if(primo == 2 || i == 2 ){ hay++; System.out.println(i+" es el primo #"+hay); }
                else{ /*¿nada?*/ }
                
                primo = 0;
                
                if(i <= 2){ i++; }
                else{ i=i+2; }
            }
            hay = 0;
        }else{
            System.out.println("Ha Terminado");
            break;
        }
    }
    }
    public static void main(String[] args) {
    primo();
    }
}
//  299993 es el primo #25997  -->  i=i+2 y j++
//  299993 es el primo #25997  -->  i=i+2 y j=j+2
// con esto se infiere que es posible hallar los primos usando 'solamente' divisores impares
// no entiendo la criba de eratostenes, bueno no se como aplicarla o usarla... de momento

/*
999983 es el primo #78498
Hasta: Ha Terminado
BUILD SUCCESSFUL (total time: 7 minutes 45 seconds)

999983 es el primo #78498
Hasta: Ha Terminado
BUILD SUCCESSFUL (total time: 4 minutes 33 seconds)
*/
