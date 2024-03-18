import java.util.*;
public class ReverseDigit {
    public static void main(String[] args) {
        //Q1: reverse of any number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        int reverse=0;
        
        while(num>0){
            reverse=reverse*10+num%10;
            num=num/10;
        }

        System.out.println(reverse);

        System.out.println("give number to check palindrome: ");
        int num2=sc.nextInt();
        palindrome(num2);
    }


   //Q2: check palindrome number by using function:


   public static void palindrome(int num){
        int reverse=0;
        int temp=num;
        while(num>0){
            reverse=reverse*10+num%10;
            num=num/10;
        }

        if(temp==reverse){
            System.out.println("it is palidrome");
        }else{
            System.out.println("this is not palindrome");
        }

        


    
   }
}
