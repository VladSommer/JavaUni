package programacionestructurada;

import java.util.Scanner;

// ejercicio 4
public class Descuento {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese una categoria");
        String categoria = (scn.nextLine());
        
        System.out.println("Ingrese un precio");
        float precio = scn.nextFloat();
        
        float precio_final = 0;
        
        switch (categoria) {
            case "A":
                precio_final = (precio - descuento(10, precio));
                break;
            case "B":
                precio_final = (precio - descuento(15, precio));
                break;
            case "C":
                precio_final = (precio - descuento(20, precio));
                break;
        }
        System.out.println("Precio final: " + precio_final);
    }
    
    public static float descuento(float a, float v) {
        return v * (a  / 100);
    }
}
