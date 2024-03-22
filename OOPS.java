class Pen{
    String color;
    String type; //ball or gel

    public void write(){
        System.out.println("write something.");
    }

    public  void printColor(){
        
        System.out.println(this.color);
    }
}




public class OOPS {
    public static void main(String[] args) {
        
        Pen p1=new Pen();
        p1.color="blue";
        p1.type="gel";

        Pen p2=new Pen();
        p2.color="black";
        p2.type="ball point";

        p1.printColor();
        p2.printColor();
        p1.write();
        p2.write();

        


        
    }
}
