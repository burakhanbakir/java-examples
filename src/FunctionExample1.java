public class FunctionExample1 {
    static int maxOfThree(int a, int b, int c) {
        int big = 0;
        if (a > b && a > c)
            big = a;
        else if (b > a && b > c)
            big = b;
        else if (c > a && c > b)
            big = c;
        return big;
    }
    static int greatestDivisor(int n) {
        int big = 0, n1 = n;
        for (int i = 2; i <= n; i++) {

            int kalan = n % i;

            if (kalan == 0) {
                for (int j = 2; j < n - 1; j++) {

                    if (n % j == 0) {
                        if (j > big)
                            big = j;
                    }
                }
            }
            if (i == n - 1)
                big = 1;
        }
        return big;
    }

    static boolean areRelativelyPrime(int a, int b) {
        int i,c=0,small;
        boolean control;
        if(a<b)small=a;
        else small=b;
        for(i=2;i<=small;i++){
            if(a%i==0 && b%i==0) c=1;
        }
        if (c==0) control = true;
        else control=false;

        return control;
    }

    static boolean isPerfect(int n) {
        int tmp = 0, tmp2 = n;

        boolean control = false;
        for (int j = 1; j <n; j++)
        {
            if (n % j == 0) {
                tmp = tmp+j;

            }
        }
        if (tmp2 == tmp) {

            control = true;
        }
        return control;
    }

    public static void main(String[] args) {
        int x = 2, y = 3, z = 1;
        System.out.println("Max of " + x + ", " + y + ", " +
                z + " is " + maxOfThree(x, y, z));

        for (int a = 12; a < 16; ++a) {
            System.out.println("Greatest divisor of " +
                    a + " is " + greatestDivisor(a));
        }

        for (int m = 11, n = 5; m >= 3; m -= 2, n += 2)
            if (areRelativelyPrime(m, n))
                System.out.println(m + " and " + n +

                        " are relatively prime");

        for (int m = 2; m <= 100; ++m) {
            if (isPerfect(m))
                System.out.println(m + " is perfect");
        }
    }
}
