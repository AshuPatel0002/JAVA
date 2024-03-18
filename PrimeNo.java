import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        int i;
        if(num<=1){
            System.out.println("this is not prime number ");
        }else{
            for( i=2;i<num;i++){
                if(num%i==0){
                    break;
                }
            }
            if(num==i){
                System.out.println("this is prime number ");
            }else{
                System.out.println("this is not prime number ");
            }   
        }
    }
}
