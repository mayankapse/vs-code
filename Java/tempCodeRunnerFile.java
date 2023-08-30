import java.util.Scanner ;

public class lab3{
    public static void main(String[] args){
        
        int[] arr = new int[] {12,23,34,45,5};
        int lrg = arr[0];
        int sml = arr[0];
        for (int i=0;i<arr.length-1 ;i++) {
            if (lrg < arr[i])
            lrg=arr[i];

            if(sml>arr[i])
            sml=arr[i];
        }
        System.out.println("\n\nsmallest = "+sml + ", largest = "+lrg);
    }
}