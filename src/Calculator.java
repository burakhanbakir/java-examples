import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1");
        double n1 = input.nextDouble();

        System.out.println("Choise Operator");
        String choise = input.next();

        System.out.println("Number 2");
        Double n2 = input.nextDouble();

        if(choise.equals("+")) {
            System.out.println(n1 + n2);
        }
        if(choise.equals("-")) {
            System.out.println(n1 - n2);
        }
        if(choise.equals("*")) {
            System.out.println(n1 * n2);
        }
        if(choise.equals("/")) {
            System.out.println(n1 / n2);
        }
    }
