import java.util.Scanner;
public class Two_D_Array {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int[][] arr={{1,2,3},{4,5},{7,8,9}};

        int [][] myarr=new int[2][3];
        


        //traversal of array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        
        //taking input in 2-D array
        System.out.println("enter the values in 2D array:");
        for(int i=0;i<myarr.length;i++){
            for(int j=0;j<myarr[i].length;j++){
                myarr[i][j]=sc.nextInt();
                
            }
        }


        System.out.println("values of 2-D array :");
        for(int i=0;i<myarr.length;i++){
            for(int j=0;j<myarr[i].length;j++){
                System.out.print(myarr[i][j]+" ");
            }
            System.out.println();
        }


    }
    
}
