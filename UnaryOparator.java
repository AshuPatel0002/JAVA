public class UnaryOparator {
    public static void main(String[] args) {
        // unary opator are -a,++a(preincrement),a++(post increment),--a(pre decrement),a--(post decrement)
        // " -"
        int a=5;
        int b=-a;
        System.out.println(b);
        

        // pre increment 
        System.out.println("Pre Increment");
        int PreIn=3;
        ++PreIn;
        System.out.println(PreIn);
        System.out.println(++PreIn);

        //post increment
        System.out.println("Post Increment");
        int PostIn=3;
        int x=PostIn++;
        System.out.println(x);
        System.out.println(PostIn++);
        System.out.println(PostIn++);
        System.out.println(PostIn);

// Similarly work post decrement and preincrement
    }
    
}
