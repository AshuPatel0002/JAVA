public class Reverse_Array {
    public static void main(String[] args) {
        int [] arr={34,45,54,32,23,45,567,23};

        // first approach
       /* System.out.println("Frist approach");
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        */ 


        // 2nd appraoch
        int arr_len=arr.length;
        int j=arr_len;
        int [] arr1=new int[j];

        System.out.println("Second approach");
        for(int i=0;i<arr.length;i++){
            arr1[j-1]=arr[i];
            j=j-1;
        }

        for(int k=0;k<arr1.length;k++){
            System.out.print(arr1[k]+" ");
        }


        
    }
}
