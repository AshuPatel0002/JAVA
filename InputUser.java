
import java.util.Scanner;
public class InputUser {
    public static void main(String[] args) {
        System.out.print("Please inter your name:");
        Scanner input=new Scanner(System.in);
        String myName=input.nextLine();
        System.out.println("Good morning "+myName);
        System.out.print(myName+" enter your age:");
        int age=input.nextInt();
        System.out.println(myName+" your age is:"+age);
       



    }
    
}
