
import java.util.*;
//
// 1. Wap to print sum of all 3* 3 matrix elements
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
//2.transpose of a matrix
//public class Matrix {
//    public static  void  main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int [][] matrix = new int  [3][3];
//        System.out.println("Enter the number of rows and columns");
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[i].length;j++){
//                matrix[i][j]=sc.nextInt();
//
//            }
//        }
//        // transpose matrix
//        System.out.println("transpose matrix");
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[i].length;j++) {
//                System.out.print(matrix[j][i]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}
//----------------------------------------------------------------------------------------------
//3. WAP TO PRINT SUM OF DIGONAL ELEMENT
//
//public class Matrix {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] matrix = new int[3][3];
//        int sum = 0;
//        System.out.println("Enter 9 elements:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        // Sum of principal diagonal elements
//        for (int i = 0; i < 3; i++) {
//            sum += matrix[i][i];
//        }
//        System.out.println("Sum of diagonal elements = " + sum);
//        sc.close();
//    }
//}
//------------------------------------------------------------------------------------------
//4.Wap to print multiply of two matrix.
//public class Matrix {
//    public static  void  main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int [][] a= new int [2][2];
//        int [][] b= new int [2][2];
//        int [][] c= new int [2][2];
//        System.out.println("1st matrix");
//        for(int i=0;i<2;i++){
//            for(int j=0;j<2;j++){
//                a[i][j]=sc.nextInt();
//            }
//        }
//        System.out.println("2nd matrix");
//        for(int i=0;i<2;i++){
//            for(int j=0;j<2;j++){
//                b[i][j]=sc.nextInt();
//
//            }
//        }
//        // MULTIPLICATION
//        for(int i=0;i<2;i++){
//            for(int j=0;j<2;j++){
//                c[i][j]=0;
//                for(int k=0;k<2;k++){
//                    c[i][j]+=a[i][k]*b[k][j];
//                }
//                    }
//                }
//        System.out.println("RESULT matrix");
//                for(int i=0;i<2;i++){
//                    for(int j=0;j<2;j++){
//                        System.out.print(c[i][j]+" ");
//            }
//                    System.out.println();
//        }
//    }
//}
//--------------------------------------------------------------------------------------

