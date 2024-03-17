import java.util.Scanner;
public class BitwiseOprator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       // Q1;create a program that show bitwise AND,or,XOR of two numbers
       System.out.print("enter 1st number : ");
       int num1=sc.nextInt();
       System.out.print("enter 2nd number : ");
       int num2=sc.nextInt();
       int num3;
       int num4;
       int num5;
       int num6;
       int num7;
       int num8;
       num3=num1 & num2;
       num4=num1 | num2;
       num5=num1 ^ num2;
       
       num6=num1<<3;
       num7=num2>>2;

        
       num8=~num1;

       System.out.println("result of bitwise &(AND) oparator: "+num3);
       System.out.println("result of bitwise |(OR) oparator: "+num4);
       System.out.println("result of bitwise ^(XOR) oparator: "+num5);
       System.out.println("result of bitwise <<(LEFT SHIFT OPERATOR) oparator: "+num6);
       System.out.println("result of bitwise >>(RIGHT SHIFT OPERATOR) oparator: "+num7);
       System.out.println("result of bitwise ~(compliment) oparator: "+num7);

    }
}
