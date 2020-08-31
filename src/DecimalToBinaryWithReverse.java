import java.util.Arrays;
import java.util.Scanner;
public class DecimalToBinaryWithReverse {
    public static void main(String[] args) {

        int number,k;
        String s="";

        Scanner read = new Scanner(System.in);
        System.out.println("input number");
        number=read.nextInt();
        //binary
        while(number>0)
        {
            k=number%2;
        s=k+","+s;
        number=number/2;
    }
        //Reverse
        char[] chars = s.toCharArray();
            System.out.println(s);
            System.out.println(Arrays.toString(chars));
            int length = chars.length;
            for(int i = length-2; i >= 0; i--) {
                System.out.print(chars[i]);
        }     
    }
}
