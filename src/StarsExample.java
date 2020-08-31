public class StarsExample {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int i=0;
        System.out.println("Input N");
        int n = input.nextInt();
        while(i<n*3) {
            if(i<n || i>=n*2){
            for (int j = 0; j< n * 2; j++) {
                if (j >= n)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
            }
            else if(i<n*3){
                if(i<n*2)
                for(int j=0;j<n*3;j++){System.out.print("*");}
                System.out.println(" ");
            }
            i++;
        }
    }
}
