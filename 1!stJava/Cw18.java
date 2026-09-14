package CWHJava;

import java.util.Scanner;

public class Cw18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        // Outer loop
        for (int i = 0; i < n; i++) {
            // Inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}