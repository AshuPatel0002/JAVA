import java.util.Scanner;
public class FunctionReturns {
    public static void main(String[] args) {
        
        greeting();
        int num1=UserInput()+56;
        int num2=UserInput();
        int sum=num1+num2;
        System.out.println("Addtion is : "+sum);
    }

    public static void greeting(){
        System.out.println("Welcome to calculator: ");
    }

    public static int UserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter number :");
        int num=sc.nextInt();
        return num;
    }
}
