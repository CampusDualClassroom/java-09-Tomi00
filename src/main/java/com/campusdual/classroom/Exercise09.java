package com.campusdual.classroom;

import java.util.Enumeration;
import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor inicial de X: ");
        int num = scanner.nextInt();
        doWhileLoop(num);
        scanner.close();
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    public static void doWhileLoop(int num) {
        int n1 = 0;
        do {
            System.out.println("Entra con valor: "+n1+", sale con valor: "+(n1 + 1));
            n1++;
        } while (n1 < num);

    }
}
