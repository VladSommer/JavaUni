package programacionestructurada;

// ejercicio 11

import java.util.Scanner;

public class DescuentoEspecial {
    
    static double descuento = 0.10;
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double precio = scn.nextDouble();
        
        calcularDescuentoEspecial(precio);
        
    }
    
    static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuento;
        System.out.println("Precio final con descento: "
                + (precio - descuentoAplicado));
    }
}
