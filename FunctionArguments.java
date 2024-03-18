import java.util.Scanner;
public class FunctionArguments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println(sumTwoNumbers(a, b));
        System.out.println(sumTwoNumbers(68,9));
    }


    public static int sumTwoNumbers(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
}
