public class ArrayExample1 {
    public static void main(String[] args) {//Dizide en cok tekrar eden en kucuk ve en buyuk sayiyi bulan uygulama
        int before_big=0, before_small=0, min=0, max=0,times_min=0,times_max=0;
        int a[] = {2,3,4,2,7,4,7,2};
        min=a[0];
        max=a[0];

        //Find Big
        for(int i=0; i<a.length; i++)
        {
            if (a[i] > max || a[i]==max) {
                max = a[i];
                if (before_big == max) {
                    times_max++;

                } else {
                    times_max=1;
                    before_big = max;
                }
            }
            
            //Find Small
            if (a[i] < min || a[i]==min)
            {
                min = a[i];
                if (before_small == min) {
                    times_min++;

                } else{
                    times_min=1;
                    before_small = min;
                }
            }
        }
        System.out.println("Min= " + min + " || " + times_min + " times. \n"
                + "Max= " + max + " || " + times_max + " times.");
    }
}
