import java.util.Scanner;
public class LongestSequence {//En cok tekrar eden sayi ve kac defa tekrar ettigini gosteren uygulama

    public static void main(String[] args) {
        int number =1, before = 1, counter = 0, value = 0,total=1;
        Scanner input = new Scanner(System.in);

        while (number != 0) {
            System.out.print("input number= ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
                if (number == before) {
                    before = number;
                    counter++;
                    if(counter>total)
                    {
                        total=counter;
                        value = before;
                    }
                }
            else {
                    before = number;
                    counter = 0;

                }
        }
        System.out.println("Longest sequence: " + total + " times number " + value);
    }
}





