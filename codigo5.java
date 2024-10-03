package codigoCinco;

import java.util.Scanner;
public class codigo5 {

    public static void main(String[] args) {                 //se agrega el public static void
        Scanner s = new Scanner(System.in);                  //se agrega el System.in
        System.out.print("Introduzca un número: ");          //se corrige la comilla y se cambia por comillas dobles
        String ni = s.nextLine();
        int c = Integer.parseInt(ni);   //se agrega Integer.parseInt
        int valOriginal = c;            //Para guardar el valor original de c
        
        int afo = 0;
        int noAfo = 0;

        while (c > 0) {              //se cambia ni > 0  por c > 0
            int digito = c % 10;     //se cambia ni % 10 por c % 10
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++; 
            } else {
                noAfo++; 
            }

            c /= 10;  // se cambia ni/=10 por c/=10
        }

        if (afo > noAfo) {
            System.out.println("El " + valOriginal + " es un número afortunado.");
        } else {
            System.out.println("El " + valOriginal + " no es un número afortunado.");
        }
    } //scanner
} //public Class
