public class TypeConversion {
    public static void main(String[] args) {
        // imlicit conversion/widening
        float myNumber=45;
        int myNumber1=64;
        float myFloat=myNumber1; 
        System.out.println(myNumber);
        System.out.println(myFloat);


        //explicit conversion/ narrowing

        float myFloat1=45.6f;
        System.out.println(myFloat1);
        int myNumber3=(int)myNumber1;
        System.out.println(myNumber3);

    }
}
