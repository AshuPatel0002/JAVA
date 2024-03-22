public class OOPS2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ashutosh";
        s1.age=23;

        s1.printInfo();
        
    }
}


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}