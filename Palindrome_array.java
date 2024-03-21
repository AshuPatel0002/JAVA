public class Palindrome_array {
    
    public static void main(String[] args) {
        
       int [] arr={1,2,3,2,1};

       boolean ispalin=ispalindrome(arr);
       if(ispalin){
        System.out.println("your number is palindrome");
       }else{
        System.out.println("your number is not palindrome");
       }

    }


    public static boolean ispalindrome(int [] arr1){

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr1[arr1.length-1-i]){
            return false;
            }
        }
        return true;
    }
}
