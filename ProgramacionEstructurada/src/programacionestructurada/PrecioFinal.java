package programacionestructurada;

import java.util.Scanner;

// ejercicio 8
public class PrecioFinal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double precio = scn.nextDouble();
        double p_impuesto = scn.nextDouble();
        double p_descuento = scn.nextDouble();
        
        System.out.println(
                "precio final: " + 
                calcularPrecioFinal(precio, p_impuesto, p_descuento)
        );
        
    }
    
    static double calcularPrecioFinal(double precio_base, double impuesto, double descuento) {
        return precio_base + (precio_base * (impuesto / 100)) -
                (precio_base * (descuento / 100));
    }
}
