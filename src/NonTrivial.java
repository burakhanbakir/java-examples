import javax.swing.*;
import java.util.Arrays;

public class nontrivial {

    public static void main(String args[]) {
        int number = 24;
        String sayilar = "";
        int numbers[] = new int[number];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Number");
        number = input.nextInt();
        for (int i = 2; i <= number; i++) {

            int kalan = number % i;

            if (kalan == 0) {

                for (int j = 2; j < number - 1; j++) {

                    if (number % j == 0) {
                        //numbers[j] = j;
                        //System.out.println(numbers[j]);
                        sayilar = sayilar + " " + j;
                    }
                }
                //JOptionPane.showMessageDialog(null,"nontrivial divisors of "+number+": "+ Arrays.toString(numbers));-Diziyi string olarak yazdırır.
                JOptionPane.showMessageDialog(null, "nontrivial divisors of " + number + ": " + sayilar);
                break;
              }
            
            if (i == number - 1) {
                JOptionPane.showMessageDialog(null, "Number is prime!");
                break;
            }
        }
    }
}
