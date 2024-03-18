import java.util.Scanner;
public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number: ");
        int num=sc.nextInt();
        int sum=0,rem=0;
        while(num>0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        System.out.println(sum);
    }
    
}
