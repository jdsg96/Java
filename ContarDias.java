//package activity3;
import java.util.Scanner;
//Juan David Sanchez Guzman
//calendario gragoriano, protitipo, ensayo, practica de condicionales con ciclos for anidados
//algoritmo que cuenta fechas y muestra un rango de fechas segun parametros ingresados
public class ContarDias {
    public static void solomes(int O[]) {
    String mes [] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    Scanner sc = new Scanner(System.in);

    int contador = 0;
    int ff = 0;
        
    int a = O[0];
    int b = O[1]-1;
    int c = O[2];
        
    int x = O[3];
    int y = O[4]-1;
    int z = O[5];
        for (int i = c; i <= z; i++) {
            //System.out.println("");
            for (int j = 0; j < mes.length; j++) {
                //System.out.println("");
                if( ( j%2==0 && j>=0 && j<= 6 ) || ( j%2!=0 && j>=7 && j<= 11 ) ){
                    ff= 31;
                }
                else{
                if( j != 1 ){
                    ff = 30;
                }
                else{
                    if( (i >= 1582 && i%4 == 0 && ( i%100 != 0 || i%400 == 0 )) ){
                        ff = 29;//Bisiesto
                    }else{
                        ff = 28;//Normal
                    }
                }
                }
                for (int k = 1; k <= ff; k++) {
                    if( ( c==z && b==y && b==j && k>=a && k<=x ) ){//mismo año y mes
                        System.out.println(k+"/"+mes[j]+"/"+i);
                        contador = contador + 1;
                    }else{
                        //System.out.println("Quien sabe...");
                    }
                }
            }
        }
        System.out.println("\nHay "+contador+" Dias");
    }
////////////////////////////////////////////////
////////////////////////////////////////////////
    public static void anio(int O[]) {
    String mes [] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    Scanner sc = new Scanner(System.in);

    int contador = 0;
    int ff = 0;
        
    int a = O[0];
    int b = O[1]-1;
    int c = O[2];
        
    int x = O[3];
    int y = O[4]-1;
    int z = O[5];
        for (int i = c; i <= z; i++) {
            //System.out.println("");
            for (int j = 0; j < mes.length; j++) {
                //System.out.println("");
                if( ( j%2==0 && j>=0 && j<= 6 ) || ( j%2!=0 && j>=7 && j<= 11 ) ){
                    ff= 31;
                }
                else{
                if( j != 1 ){
                    ff = 30;
                }
                else{
                    if( (i >= 1582 && i%4 == 0 && ( i%100 != 0 || i%400 == 0 )) ){
                        ff = 29;//Bisiesto
                    }else{
                        ff = 28;//Normal
                    }
                }
                }
                for (int k = 1; k <= ff; k++) {
                    if( ( c==z && j==b && k>=a )||( c==z && j>=b+1 && j<y )||( c==z && j==y && k<=x ) ){//mismo año
                        System.out.println(k+"/"+mes[j]+"/"+i);
                        contador = contador + 1;
                    }else{
                        //System.out.println("Quien sabe...");
                    }
                }
            }
        }
        System.out.println("\nHay "+contador+" Dias");
    }
////////////////////////////////////////////////
////////////////////////////////////////////////
    public static void distinto(int O[]) {
    String mes [] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    Scanner sc = new Scanner(System.in);

    int contador = 0;
    int ff = 0;
        
    int a = O[0];
    int b = O[1]-1;
    int c = O[2];
        
    int x = O[3];
    int y = O[4]-1;
    int z = O[5];
        for (int i = c; i <= z; i++) {
            //System.out.println("");
            for (int j = 0; j < mes.length; j++) {
                //System.out.println("");
                if( ( j%2==0 && j>=0 && j<= 6 ) || ( j%2!=0 && j>=7 && j<= 11 ) ){
                    ff= 31;
                }
                else{
                if( j != 1 ){
                    ff = 30;
                }
                else{
                    if( (i >= 1582 && i%4 == 0 && ( i%100 != 0 || i%400 == 0 )) ){
                        ff = 29;//Bisiesto
                    }else{
                        ff = 28;//Normal
                    }
                }
                }
                for (int k = 1; k <= ff; k++) {
                    if( (i==c && j==b && k>=a)||(i==c && j>=b+1)||(i>=c+1 && i<=z-1)||(i==z && j<=y-1)||(i==z && j==y && k<=x)||(z==c) ){
                        System.out.println(k+"/"+mes[j]+"/"+i);
                        contador = contador + 1;
                    }else{
                        //System.out.println("Quien sabe...");
                    }
                }
            }
        }
        System.out.println("\nHay "+contador+" Dias");
    }
////////////////////////////////////////////////
////////////////////////////////////////////////
    public static void metodo() {
    Scanner sc = new Scanner(System.in);
    int [] O = new int[6];
        System.out.println("**************************");
        System.out.println("Algoritmo para contar dias");
        System.out.println("Ingrese asi: dia-mes-anio");
        System.out.println("**************************");
        System.out.print("Desde: ");
        String [] A = sc.nextLine().split("-");
        System.out.print("Hasta: ");
        String [] Z = sc.nextLine().split("-");
        
        if(A.length == Z.length && A.length == 3){//se puede incluir el tipo de dato en la condicion?
            try{
                O[0] = Integer.parseInt(A[0]);
                O[1] = Integer.parseInt(A[1]);
                O[2] = Integer.parseInt(A[2]);
                O[3] = Integer.parseInt(Z[0]);
                O[4] = Integer.parseInt(Z[1]);
                O[5] = Integer.parseInt(Z[2]);
            }catch(Exception Error){
                System.out.println(Error);
                System.out.println("Ingrese los datos correctamente...");
                metodo();
            }
        }else{
                System.out.println("Ingrese los datos correctamente...");
        }
/////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////
        if( O[2]==O[5] && O[1]==O[4] ){
            solomes(O);
        }else if( O[2]==O[5] && O[1]!=O[4] ) {
            anio(O);
        }else{
            distinto(O);
        }
        metodo();//ciclo infinito
    }
    public static void main(String[] args) {
        metodo();
    }
}