import java.util.*;
public class NoOfOccurrences {
    public static void main(String[] args) {
        //Q: write a program to find of occurrneces of an element in an array

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();

        int arr[] =new int[size];

        for(int i=0;i<size;i++){
            System.out.print("enter number at "+i+" index :");
            arr[i]=sc.nextInt();
        }

        System.out.print("enter the numbers whos occurrences found in array:");
        int num=sc.nextInt();
        int count=0;

        for(int i=0;i<size;i++){
            if(arr[i]==num){
                count++;
            }
        }

        System.out.println("total occurrences of number :"+count);
    }
}
