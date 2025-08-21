
package programacionestructurada;

//ejercicio 13
public class ArrayPreciosRecursivo {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales: ");
        
        iteracionArrayRecursiva(precios, 0);
        
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        
        iteracionArrayRecursiva(precios, 0);
    }
    
    static void iteracionArrayRecursiva(double[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        iteracionArrayRecursiva(arr, index + 1);
        System.out.println(arr[index]);
    }
}
