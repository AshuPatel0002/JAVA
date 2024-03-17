import java.util.Scanner;

public class EvenOdd_bitwise {

    /**
     * this is my main method(this is documentation comment)
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter any number :");
        int num=sc.nextInt();
        
        if((num & 1)==1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
