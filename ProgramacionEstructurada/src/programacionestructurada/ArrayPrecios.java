package programacionestructurada;

// ejercicio 12
public class ArrayPrecios {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales: ");
        
        for (double i : precios) {
            System.out.println(i);
        }
        
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        
        for (double i : precios) {
            System.out.println(i);
        }
    }
}
