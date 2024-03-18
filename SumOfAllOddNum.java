import java.util.Scanner;
public class SumOfAllOddNum {
    //Q1 write a program of sum of all odd numbers from 1 to specified N
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int sum=0;
        for (int i =1;i<=N;i++){
            if(i%2==0){
                continue;
            }else{
                sum+=i;
            }
        }
        System.out.println(sum);
        System.out.println(OddAdd(N));
        int sum2=OddAdd(20);
        System.out.println(sum2);
    }


    public static int OddAdd(int N){
        System.out.println("this odd sum insight the function:");
        
        int sum=0;
        for (int i =1;i<=N;i=i+2){
            
                sum+=i;
            
        }
        return sum;
    }

}
