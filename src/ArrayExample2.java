import java.util.Arrays;
public class ArrayExample2 {//Dizide tekrar eden sayilari ayristirma.
    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 3, 2, 6, 3, 6, 8, 2, 9};
        int tmp = 0,c=0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != tmp) {
                tmp = numbers[i];
                c++;
                System.out.print(numbers[i]+" ");
            }
        }
        System.out.println("\n There were "+c+" different number.");
    }
}
