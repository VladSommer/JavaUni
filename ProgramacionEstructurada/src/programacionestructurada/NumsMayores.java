package programacionestructurada;

import java.util.Scanner;

// Ejercicio 2
public class NumsMayores {
    public static void main(String[] args) {
        int[] array_nums = new int[3];
        Scanner scn = new Scanner(System.in);
        
        for (int i=0;i<array_nums.length;i++) {
            System.out.println("Ingrese un numero: ");
            array_nums[i] = scn.nextInt();
        }
        
        System.out.println("El mayor es " + mayor_en_array(array_nums));
    }
    
    public static int mayor_en_array(int[] arr) {
        int rtn = 0;
        for (int i=0;i< arr.length;i++) {
            rtn = (arr[i] > rtn) ? arr[i] : rtn; // esto es intencional
        }
        
        return rtn;
    }
}
