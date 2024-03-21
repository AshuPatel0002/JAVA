public class Palindrome_array {
    
    public static void main(String[] args) {
        
        int [] arr1={1,2,3,2,1};

        System.out.println(" \narray before reverse ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        int arr_len=arr1.length;
        int j=arr_len;
        int [] arr2=new int[j];

        for(int i=0;i<arr_len;i++){
            arr2[j-1]=arr1[i];
            j-=1;
        }

        System.out.println("\nreverse of array");
        for(int i=0;i<arr_len;i++){
            System.out.print(arr2[i]+" ");
        }

        int flag=0;
        System.out.println("\ncheck palindrome or not");
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[i]){
                flag=1;
            }else{
                flag=2;
            }
        }
        if(flag==1){
            System.out.println("palindome");
        }else{ 
            System.out.println("not palindrome");
        }
    }
}
