import java.util.Scanner;
public class ex2 {//Pr3
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("input n ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print(i*j +"\t"); // "\t" ibaresi 1 tab kadar bosluk bırakır
            }
            System.out.println(" ");
        }
    }
}
