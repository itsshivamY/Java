package CWHJava;

import java.util.Scanner;

public class Cw10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter button (1, 2 or 3): ");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Please enter only 1, 2 or 3");
        }

        sc.close();
    }
}