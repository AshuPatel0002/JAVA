import java.util.Scanner;
public class Challenge_2 {
    public static void main(String[] args) {
    //Q1: create a program that takes two numbers and shows result of all arithmatic operators(+,-,*,/,%)
    /* 
    Scanner sc= new Scanner(System.in);
    System.out.println("enter first number");
    int Num1=sc.nextInt();
    System.out.println("enter second number");
    int Num2=sc.nextInt();

    System.out.print("Addition:");
    System.out.println(Num1+Num2);
    System.out.print("Substraction:");
    System.out.println(Num1-Num2);
    System.out.print("Multiplication:");
    System.out.println(Num1*Num2);
    System.out.print("divide:");
    System.out.println(Num1/Num2);
    System.out.print("Modulous:");
    System.out.println(Num1%Num2);

    */

        //Q2:create a program to calculate product of floating points numbers.

       /* 
       
       float Float1=45.5f;
        float Float2=34.6f;
        System.out.println(Float1*Float2);
        
       */

        //Q3:create  a program to calculate of a ractangle .
        // perimeter of ractangle ABCD=A+B+C+D

       /*  Scanner sc= new Scanner(System.in);
        System.out.print("enter 1st side:");
        int s1=sc.nextInt();
        System.out.print("enter 2st side:");
        int s2=sc.nextInt();
        System.out.print("enter 3st side:");
        int s3=sc.nextInt();
        System.out.print("enter 4st side:");
        int s4=sc.nextInt();

        int Por=s1+s2+s3+s4;
        System.out.println("perimeter of ractangle is: "+Por);
        */

     //Q4:create a program to calculate compound interest
     // coupound interest=P(1+r/100)^t

     Scanner sc=new Scanner(System.in);
     System.out.print("enter principle : ");
     double p=sc.nextDouble();
     System.out.print("enter rate : ");
     double r=sc.nextDouble();
     System.out.print("enter years : ");
     double y=sc.nextDouble();
     double cp=p*Math.pow((1+r/100),y);
     System.out.println("Compound interest is :"+cp);



    }
}
