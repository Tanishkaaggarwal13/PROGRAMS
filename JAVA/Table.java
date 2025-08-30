import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if input is positive
        if (n <= 0) {
            System.out.println("Please enter a positive integer!");
        } else {
            // Printing multiplication table
            System.out.println("Multiplication Table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }

        sc.close();
    }
}
