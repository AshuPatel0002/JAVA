import java.util.Scanner;
public class challenge_1 {
    public static void main(String[] args) {

        // create a program to input name of the person and respond with "Welcone to KG Coding "
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name:");
        String Name=input.nextLine();
        
        System.out.println("Welcome "+Name+" to KG Coding");

        //Create a program to add two numbers
        System.out.print("enter first number:\n");
        int Number1=input.nextInt();
        System.out.println("enter second number:");
        int Number2=input.nextInt();
        int Number3=Number1+Number2;
        System.out.println( "After adding two numbers result will be "+Number1+Number2);
        System.out.println("huu"+Number3);
        

    }
}
