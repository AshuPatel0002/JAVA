import java.util.*;
public class SortingOfArray {

  //Using bubble sort

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int[] arr={34,6,34,23,67,12,67};

    for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length-1;j++){

            if(arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
  }
    
}
