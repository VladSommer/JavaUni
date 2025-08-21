package programacionestructurada;

import java.util.Scanner;

// ejercicio 9
public class Composicion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String zona = scn.nextLine();
        double precio = scn.nextDouble();
        double peso = scn.nextDouble();
        
        System.out.println("Costo de Envio: " + calcularCostoEnvio(peso, zona));
        
        System.out.println("Total a pagar: " +
                calcularTotalCompra(precio, calcularCostoEnvio(peso, zona))
        );
    }
    
    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) return (5 * peso);
        else if (zona.equalsIgnoreCase("Internacional")) return (10 * peso);
        return 0;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
