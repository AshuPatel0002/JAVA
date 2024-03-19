import java.util.Scanner;
public class SumAvg_Array {
    
    public static void main(String[] args) {
        int[] newArr=UtilityArr.inputArr();

        long sum=SumMethod(newArr);
        System.out.println("sum of array:"+sum);

        double avg=AvgMethod(newArr);
        System.out.println("Average of array:"+avg);
        
        
    }


    public static long SumMethod(int [] copyArr){
        long sum=0;
        for(int i=0;i<copyArr.length;i++){
            sum+=copyArr[i];
        }
        return sum;
    }


    public static double AvgMethod(int [] copy1Arr){

        double avg=SumMethod(copy1Arr)/copy1Arr.length;
        return avg;
    }
}
