import java.util.Arrays;
public class ArrayExample3 {//Sadece 1. dizide olan elemanlari yazdiran uygulama. (Ilk dizide veri tekrar yapilmayacak!)
    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 3, 6, 7, 4, 8, 2, 5};
        int[] brr = {2, 3, 6, 8, 0, 11};
        int control = 0,index=0,count=0;
        for (int i : arr) {
            index++;
            control=0;
            for(int j: brr)
            {
                if(i==j)
                    control=1;
            }
            count=0;
                for(int k=0; k<index-1; k++)
                {
                    if(i==arr[k])
                        count++;
                }
                if(control==0 && count<1)
                    System.out.println(i);
        }
    }
}
