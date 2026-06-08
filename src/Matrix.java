//Wap to print sum of all 3* 3 matrix elements.
//
import java.util.*;
//public class Matrix {
//    public static  void  main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int [][] matrix = new int  [3][3];
//        int sum = 0;
//        System.out.println("Enter the number of rows and columns");
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[i].length;j++){
//                matrix[i][j]=sc.nextInt();
//                sum+=matrix[i][j];
//            }
//        }
//        System.out.println("The sum is: "+sum);
//    }
//}
//----------------------------------------------------------------------------------------------
//transpose of a matrix
public class Matrix {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int  [3][3];
        System.out.println("Enter the number of rows and columns");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        // transpose matrix
        System.out.println("transpose matrix");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }

    }
}

