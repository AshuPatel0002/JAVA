import java.util.Scanner;
public class SecondHighNo {

    
    public static void main(String[] args) {
        System.out.println("enter size of an array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int [] arr=new int[size];

       
        System.out.println("enter element of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        // if you find max element take minvalue of interger and traverse in array
        
        // if you find min element take maxvalue of integer and traverse on array
       int First_highest=Integer.MIN_VALUE;
       int Second_Highest=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
        if(arr[i]>First_highest){
            Second_Highest=First_highest;
            First_highest=arr[i];
        }
       }

       System.out.println("Second Highest:"+Second_Highest);
       System.out.println("First  Highest:"+First_highest);

        
    }
    
}
