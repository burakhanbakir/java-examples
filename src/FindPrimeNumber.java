import javax.swing.*;
import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int divisor, prime_number = 0;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Number a");
        int a = input.nextInt();
        System.out.println("Number b");
        int b = input.nextInt();

        for (int i = a; i <= b; i++) {
            divisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    divisor += 1;
            }
            if (divisor == 2) {
                prime_number += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "[" + a + "," + b + "] contains " + prime_number + " prime numbers");
    }
}
