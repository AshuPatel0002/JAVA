public class Inheritance_1 {
    public static void main(String[] args) {

        Triangle t1=new Triangle();
        t1.color="red";
        t1.print();
        
    }
}


class Shape{
    String color;
}

class Triangle extends Shape{
    public void print(){
        System.out.println(color);
    }
}