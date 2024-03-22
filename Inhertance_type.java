class Shape{
    public void area(){
        System.out.println("Display area:");
    }
}

//single inheritance
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
        System.out.println("triangle");
    }
}
 
//heirarical inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
        System.out.println("circle");
    }
}


//multilevel inhertance
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
        System.out.println("equilateral triangle");
    }
}

//hybrid inheritance is the combination of multilevel and heirarical level inheritance






//main class 
public class Inhertance_type {
    public static void main(String[] args) {

        EquilateralTriangle t1=new EquilateralTriangle();
        t1.area(2,4);
        
    }
}
