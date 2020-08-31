public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int big_row=0,big_column=0,total=0,row=0,column=0;
        int[][] arr = { {1,3,2}, {3,4,8}, {2,6,8}, {1,8,5,9} };
        for(int i=0;i<arr.length;i++)
        {
            total=0;
            for(int j=0;j<arr[i].length;j++)
            {
                total=total+arr[i][j];
                if(arr[i][j]>big_column) {
                    big_column = arr[i][j];
                    column = j;
                }
            }
            if(total>big_row) {
                big_row = total;
                row=i;
            }
        }
        System.out.println("Biggest Row= "+big_row+" Row= "+row);
        System.out.println("Biggest Column= "+big_column+" Column= "+column);
    }
}
