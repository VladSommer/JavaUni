package uni;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner n1_input = new Scanner(System.in);
        int n1 = n1_input.nextInt();
        Scanner n2_input = new Scanner(System.in);
        int n2 = n2_input.nextInt();
        
        System.out.println(n1 + "+" + n2 + " = " + (n1 + n2));
        System.out.println(n1 + "-" + n2 + " = " + (n1 - n2));
        System.out.println(n1 + "*" + n2 + " = " + (n1 * n2));
        System.out.println(n1 + "/" + n2 + " = " + (n1 / n2));
    }
}
