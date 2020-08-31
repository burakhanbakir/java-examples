import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensinalArrays2 {
    static int inner (int[][] value) {

        int[][] array = new int[value.length][value[0].length];
            return array[0][0];
    }
    public static void main(String[] args) {
        int b=0;
        int[][] a = { {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9} };

        for (int[] r : a) {
            System.out.println(Arrays.toString(r));
        }
    }
}
