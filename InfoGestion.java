
//package infogestion;
import java.util.Scanner;
/*

Autor: Juan David Sánchez Guzmán 
Aprendiz de Programación 
Motivo: Practicar
Algoritmo: calendario gregoriano
Codigo Java hecho con la herramienta Netbeens 12 
version 0.1 construida en Marzo de 2021

por mejorar en el reto: relacionar los dias de la semana
https://es.wikipedia.org/wiki/Calendario_gregoriano
https://docs.microsoft.com/es-es/office/troubleshoot/excel/determine-a-leap-year
https://es.wikipedia.org/wiki/Anexo:A%C3%B1os_bisiestos_en_los_siglos_XX,_XXI_y_XXII

    1. Si el año es divisible por 4, vaya al paso 2. De lo contrario, vaya al paso 5.
    2. Si el año es divisible por 100, vaya al paso 3. De lo contrario, vaya al paso 4.
    3. Si el año es divisible por 400, vaya al paso 4. De lo contrario, vaya al paso 5.
    4. El año es un año bisiesto (tiene 366 días).
    5. El año no es un año bisiesto (tiene 365 días).

*/
public class InfoGestion {
    static void gregorian1() {
    Scanner toche = new Scanner(System.in);
    
    while(true){
        System.out.print("Ingrese año ");
        int num = toche.nextInt();
        if( num != 0 && num >= 1582){
            if( num%4 == 0 && ( num%100 != 0 || num%400 == 0 ) ){
                recorrido(true, num);
            }else{
                recorrido(false, num);
            }
        }else{
            System.out.println("chao =(");
            break;
        }
    }
    }
    static void recorrido(boolean siono, int num) {
    System.out.println("");
    String [] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    int x = 0;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*////*/if(siono == true)/*/////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        {
            for (int i = 0; i < mes.length; i++) {
                System.out.println(mes[i]+" de "+num);
                
                if( ( i%2==0 && i>=0 && i<= 6 ) || ( i%2!=0 && i>=7 && i<= 11 ) ){/*.*/x= 31;/*.*/}
                else{/*.*/if( i != 1 ){/*.*/x = 30;/*.*/} else{/*.*/x = 29;/*.*/}}
                System.out.println("lunes\tmartes\tmierco\tjueves\tviernes\tsabado\tdomingo");
                for (int j = 1; j < x+1; j++) {
                    if( (j-1)%7 ==0 ){
                    System.out.print("\n"+j);
                    }else{
                    System.out.print("\t"+j);
                    }
                }
                System.out.println("\n");
            }
            System.out.println("---El año "+num+" tiene 366 dias (Bisiesto)---\n");
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*////*/else/*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        {
            for (int i = 0; i < mes.length; i++) {
                System.out.println(mes[i]+" de "+num);
                
                if( ( i%2==0 && i>=0 && i<= 6 ) || ( i%2!=0 && i>=7 && i<= 11 ) ){/*.*/x= 31;/*.*/}
                else{/*.*/if( i != 1 ){/*.*/x = 30;/*.*/} else{/*.*/x = 28;/*.*/}}
                
                for (int j = 1; j < x+1; j++) {
                    if( (j-1)%7 ==0 ){
                    System.out.print("\n"+j);
                    }else{
                    System.out.print("\t"+j);
                    }
                }
                System.out.println("\n");
            }
            System.out.println("---El año "+num+" tiene 365 dias---\n");
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
    public static void main(String[] args) {
        gregorian1();
    }
}
