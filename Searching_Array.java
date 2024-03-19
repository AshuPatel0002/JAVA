import java.util.Scanner;
public class Searching_Array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        int i=0;

        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("enter the number whos found index ");
        int x=sc.nextInt();

        for(i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("index of x :"+i);
            }
        }
    }



}
