import java.util.Scanner;

public class UtilityArr {

    public static int[] inputArr(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of element: ");
        int size=sc.nextInt();

        int[] myarr1=new int[size];

        for(int i=0;i<size;i++){
            myarr1[i]=sc.nextInt();
        }
        return myarr1;
    }
    
}
