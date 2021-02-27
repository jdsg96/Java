
package internet;
import java.util.Scanner;
/*

0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,n
------------------------------------------
------------------------------------------
Seudo-codigo
Recursos: 2 variables
          2 Printf
          2 Expresiones
# = 0
$ = 1

# = #0 + $1
# = 1
$ = $1 + #1
$ = 2

# = #1 + $2
# = 3
$ = $2 + #3
$ = 5

# = #3 + $5
# = 8
$ = $5 + #8
$ = 13

# = #8 + $13
# = 21
$ = $13 + #21
$ = 34

# = #21 + $34
# = 55
$ = $34 + #55
$ = 89

*/
public class Secuencia
{
    public static void Fibonacci()
    {
    Scanner secuencia = new Scanner(System.in);
    int control = 1;
    int f0 = 0;
    int f1 = 1;
    
        while( control != 0 )
        {
            System.out.print("Ingrese Limite Aprox para la serie Finonacci: ");
            int numero = secuencia.nextInt();
            if( numero != 0 )
            {
                while( ( f0 + f1 ) <= numero )
                {
                    f1 = f1 + f0;
                    f0 = f0 + f1;
                    System.out.println(f1);
                    System.out.println(f0);
                }
                f0 = 0;
                f1 = 1;
            }else
            {
                System.out.println("Ha Terminado");
                control = 0;
            }
        }
    }
    public static void main(String[] args)
    {
     Fibonacci();   
    }
    
}
