package uni;

import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        
        System.out.println("Ingrese su nombre y edad...");
        Scanner nombre_input = new Scanner(System.in);
        String nombre = nombre_input.nextLine();
        
        Scanner edad_input = new Scanner(System.in);
        int edad = edad_input.nextInt();
        
        System.out.println("Su nombre es " + nombre);
        System.out.println("Usted tiene " + edad + " años");
        
    }
    
}
