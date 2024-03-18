
import java.util.Scanner;
public class FactorialNumber {
    //Q1:calculate factorial of any number

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter number to calculate factorial: ");
        int num=input.nextInt();
        System.out.println(FactNum(num));
    }


    public static long FactNum(int Num){

        if(Num<2){
            return 1;
        }
        long fact=1;
        for(int i=Num;i>=1;i--){
           fact=fact*i;
        }
        return fact;
    }
}
