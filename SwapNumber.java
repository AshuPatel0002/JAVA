import java.util.Scanner;
public class SwapNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("before swapping the number:");
        System.out.print("Num1 :");
        int Num1=input.nextInt();
        System.out.print("Num2 :");
        int Num2=input.nextInt();
        int Num3;
        Num3=Num2;
        Num2=Num1;
        Num1=Num3;
        System.out.println("after swapping the number");
        System.out.println("Num1 :"+Num1);
        System.out.println("Num2 :"+Num2);




    }
}
