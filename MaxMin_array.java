import java.util.Scanner;
public class MaxMin_array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of arary:");
        int size=sc.nextInt();

        int [] arr=new int[size];
        int i=0;
        System.out.println("please enter element to fill the array");
        for( i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int min=arr[0];
        System.out.println("element present in array");
        for(i=1;i<arr.length;i++){
            System.out.println(arr[i]);

            if(max<arr[i]){
                max=arr[i];
            }

            if(min>arr[i]){
                min=arr[i];
            }


        }

        System.out.println("Max element of an array:"+max);
        System.out.println("Min element of an array:"+min);
    }
    
}
