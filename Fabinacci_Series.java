import java.util.Scanner;
public class Fabinacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int First=0;
        int Second=1;
        int Third=0;
        System.out.println(" How many fanacci series you want:");
        int num=sc.nextInt();
        System.out.print(First+" "+Second+" ");
        for(int i=3;i<=num;i++){
            Third=First+Second;
            System.out.print(Third+" ");
            
            First=Second;
            Second=Third;
        }
    }
}
