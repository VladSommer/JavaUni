package programacionestructurada;

import java.util.Scanner;

// Ejercicio 3
public class ClasificacionEdad {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int edad = scn.nextInt();
        
        if (edad > 0) {
            if (edad < 12) {
                System.out.println("Niño");
            }else if (edad >= 12 && edad <= 17) {
                System.out.println("Adolescente");
            }else if (edad >= 18 && edad <= 59) {
                System.out.println("Adulto");
            }else if (edad >= 60) {
                System.out.println("Adulto mayor");
            }
        } else {
            System.out.println("Valor invalido");
        }
    }
}
