import java.util.*;
public class SumAvg_2d_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter row :");
        int row=sc.nextInt();
        System.out.print("enter column :");
        int col=sc.nextInt();
        int rc=row+col;
        int [][] arr=new int[row][col];

        System.out.println("enter element of 2-D array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("element of 2d array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("sum of 2d  array:"+sum);
        int avg;
        avg=sum/rc;
        System.out.println("average of 2d array"+avg);
    }
}            