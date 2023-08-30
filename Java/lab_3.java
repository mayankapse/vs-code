import java.util.Scanner ;

public class lab_3{
    public static void main(String[] args){

        int[] arr = new int[] {56,67,3,9,48};    

        System.out.println("reversed array : ");
        for (int i=arr.length-1;i>=0 ;--i) {
            System.out.print(" "+arr[i]);
        }

        int lrg = arr[0];
        int sml = arr[0];
        for (int i=0;i<arr.length ;i++) {
            if (lrg < arr[i])
            lrg=arr[i];

            if(sml>arr[i])
            sml=arr[i];
        }
        System.out.println("\n\nsmallest = "+sml + ", largest = "+lrg);

        Scanner sc =new Scanner(System.in);
        System.out.println("enter number : ");
        int sn = sc.nextInt();
        int found = 0;
        for (int i=0; i<arr.length; i++) {
            if (sn==arr[i]){
                System.out.println("number found at index : "+i);
                found=1;
            }}
        if (found==0){
            System.out.println("number not found!");
        }
        sc.close();

        int[][] mat1 = new int[][] {{1, 2}, {3, 4}};
        int[][] mat2 = new int[][] {{5, 6}, {7, 8}};
        int rowl = mat1.length;
        int columnl = mat1[0].length;

        int[][] result = new int[rowl][columnl];

        for (int i = 0; i < rowl; i++) {
            for (int j = 0; j < columnl; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("added matrix :");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int[][] matrix = new int[][]{{45, 54}, {78, 87}};
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] rowSums = new int[rows];
        int[] columnSums = new int[columns];

        
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < columns; j++) {
                rowSum += matrix[i][j];
            }
            rowSums[i] = rowSum;
        }

        
        for (int j = 0; j < columns; j++) {
            int columnSum = 0;
            for (int i = 0; i < rows; i++) {
                columnSum += matrix[i][j];
            }
            columnSums[j] = columnSum;
        }

      
        System.out.println("row sums:");
        for (int sum : rowSums) {
            System.out.println(sum);
        }

        System.out.println("column sums:");
        for (int sum : columnSums) {
            System.out.print(sum + " ");
        }


    }
}