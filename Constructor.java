import java.util.*;
public class Constructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Student s1=new Student();
        s1.name="rahul";
        s1.age=23;
        s1.printInfo();

        Student s2=new Student("ram",34);
        s2.printInfo();

        
        

        
    }
}


class Student{
    String name;
    int age;


    public void printInfo(){
        System.out.println("student information:");
        System.out.println(this.name);
        System.out.println(this.age);
    }

    
    //constructor not any return type
    //constructor same name as class
    //it can be call ones when object is created

    // default construtor
    Student(){
        System.out.println("defalut constructor");
        System.out.println("constructor called");
    }

    //parametarized constructor

    Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("parametarized constructor");
        


    }
}