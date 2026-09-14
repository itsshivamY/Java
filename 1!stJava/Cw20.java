package CWHJava;

import java.util.Scanner;

public class Cw20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}