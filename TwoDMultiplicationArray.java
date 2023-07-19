 import java.util.*;

 public class TwoDMultiplicationArray{
     public static void main(String... sd){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of row and colunm of your first matrix");
         int p = sc.nextInt();
         int q = sc.nextInt();
         System.out.println("Enter element of your first matrix");
         int[][] firstMatrix = new int[p][q];
         for(int i = 0;i<p;i++){
             for(int j = 0;j<q;j++){
                 firstMatrix[i][j] = sc.nextInt();
             }
         }
         System.out.println("Enter size of row and colunm of your second matrix");
         int r = sc.nextInt();
         int s = sc.nextInt();
         System.out.println("Enter element of your second matrix");
         int[][] secondMatrix = new int[r][s];
         for(int i = 0;i<r;i++){
             for(int j = 0;j<s;j++){
                 secondMatrix[i][j] = sc.nextInt();
             }
         }
         int[][] multiplication = new int[p][s];
         if(q==r){
             for(int i = 0;i<p;i++){
                 for(int j = 0;j<s;j++){
                     for(int k = 0;k<q;k++){
                         multiplication[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                     }
                 }
             }
             System.out.println("Multiplicatin of :");
             for(int i = 0;i<p;i++){
                 for(int j = 0;j<q;j++){
                     System.out.print(firstMatrix[i][j]+"\t");
                 }
                 System.out.println();
             }
             System.out.println("and");
             for(int i = 0;i<p;i++){
                 for(int j = 0;j<q;j++){
                     System.out.print(firstMatrix[i][j]+"\t");
                 }
                 System.out.println();
             }
             System.out.println("is :");
             System.out.println("Multiplication of two matrix");
             for(int i = 0;i<p;i++){
                 for(int j = 0;j<s;j++){
                     System.out.print(multiplication[i][j]+"\t");
                 }
                 System.out.println();
             }
         }
         else{
             System.out.println("This can not multiply of these matrix because firstMatrix of row and secondMatrix of colunm is different. Please try again!");
         }
     }
 }