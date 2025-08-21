package programacionestructurada;

import java.util.Scanner;

// ejercicio 7
public class RangoNotas {
    public static void main(String[] args) {
        int nota = 0;
        
        Scanner scn = new Scanner(System.in);
        
        do {                
            nota = scn.nextInt();
        } while (nota > 10 || nota < 0);
        System.out.println("Nota guardada correctamente");
        
    }
}
