import java.util.*;
public class Two_dimensional_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter row and column:");
        int row=sc.nextInt();
        int col=sc.nextInt();
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

        System.out.print("element I want to search in 2d array:");
        int search=sc.nextInt();


        boolean searchElement=searchElement(arr, search);
        if(searchElement){
            System.out.println("element found ");
        }else{
            System.out.println("element not found ");
        }

        elementPrint(arr);
       

    }
    //serching method
    public static boolean searchElement(int [][] arr1,int search1){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                if(arr1[i][j]==search1){
                    return true;                                                
                }
            }
        }
        return false;
       }

       // arr2[i].length to understand it works on rows
       public static void elementPrint(int [][] arr2){
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            break;
        }
       }
}
