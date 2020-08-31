import java.util.Scanner;
public class FindBigAndSmallValue {//Disaridan girilen en buyuk ve en kucuk sayinin hangisi oldugunu ve kac defa tekrar edildigini bulan uygulama
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 1, big = 0, before_big = 0,before_small=0, count_big = 1, small = 0, count_small = 1;

        System.out.println("input");
        number = scan.nextInt();
        before_big = number;
        before_small = number;
        big = number;
        small = number;
        while (number != 0) {
            System.out.println("input");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            if (number > big || number==big) {
                big = number;
                if (before_big == big) {
                    count_big++;
                    before_big = big;

                } else {
                    count_big=1;
                    before_big = big;

                }
            }
             if (number < small || number==small)
            {
                small = number;
                if (before_small == small) {
                    count_small++;
                    before_small = small;

                } else{
                    count_small=1;
                    before_small = small;
                }
            }
        }
        System.out.println("Max = "+big+", "+count_big+" times \n"+"Min = "+small+", "+count_small+" times");
    }
}
