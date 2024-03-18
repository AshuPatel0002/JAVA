import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int [] marks=new int[4];
        marks[0]=45;
        marks[1]=78;
        marks[2]=78;
        marks[3]=48;

        //Is tarah se bhi declaration kar sakte hain
        // int [] marks={45,67,89,90};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        //function call 
        MyArary();

    }

    public static void MyArary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size=sc.nextInt();
        int i;
        int [] marks=new int[size];
        
        //loop for taking values of array
        System.out.println("Please enter marks for each subject :");
        for(i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }

        // loop for printing the value of array
        System.out.println("marks obtain in each subject :");
        for(i=0;i<size;i++){
            System.out.println(marks[i]);
        }

    }
    
}
