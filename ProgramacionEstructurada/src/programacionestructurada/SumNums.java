package programacionestructurada;

// ejercicio 5
import java.util.Scanner;

public class SumNums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese un número (0 para terminar): ");
        int x = scn.nextInt();
        int sum = 0;
        
        while (x != 0) {
            
            if (x % 2 == 0) sum += x;
            System.out.println("Ingrese un número (0 para terminar): ");
            x = scn.nextInt();
        }
        
        System.out.println(sum);
    }
            
}
