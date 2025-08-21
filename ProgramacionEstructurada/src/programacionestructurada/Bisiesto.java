package programacionestructurada;

// Ejercicio 1

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int a = scn.nextInt();
        
        if (es_bisiesto(a))
            System.out.println("El año" + a + "es bisiesto");
        else
            System.out.println("El año" + a + "no es bisiesto");
    }
    static boolean es_bisiesto(int a) {
        return ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0);
    }
}
