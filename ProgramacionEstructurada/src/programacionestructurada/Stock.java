package programacionestructurada;

// ejercicio 10

import java.util.Scanner;

public class Stock {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int stockActual = scn.nextInt();
        int cantidadVendida = scn.nextInt();
        int cantidadRecibida = scn.nextInt();
        
        actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
    }
    
    static void actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
}
