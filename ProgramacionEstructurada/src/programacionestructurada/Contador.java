package programacionestructurada;

import java.util.Scanner;

// ejercicio 6
public class Contador {
    public static void main(String[] args) {
        
        int positivos = 0;
        int negattivos = 0;
        int ceros = 0;
        
        Scanner scn = new Scanner(System.in);
        
        for (int i=0; i< 10; i++) {
            int num = scn.nextInt();
            
            if (num > 0) positivos += 1;
            else if (num < 0) negattivos += 1;
            else ceros += 1;
        }

        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negattivos);
        System.out.println("Ceros: " + ceros);

    }
}
