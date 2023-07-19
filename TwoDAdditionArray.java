import java.util.*;

public class TwoDAdditionArray{
    public static void main(String... js){
        System.out.println("Enter size of row");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.println("Enter size of column");
        int q = sc.nextInt();
        int[][] firstArray = new int[p][q];
        System.out.println("Enter element of first array.");
        for(int i = 0;i<p;i++){
            for(int j = 0;j<q;j++){
                firstArray[i][j] = sc.nextInt();
            }
        }
        int[][] secondArray = new int[p][q];
        System.out.println("Enter element of second array.");
        for(int i = 0;i<p;i++){
            for(int j = 0;j<q;j++){
                secondArray[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[p][q];
        for(int i = 0;i<p;i++){
            for(int j = 0;j<q;j++){
                sum[i][j] = firstArray[i][j] + secondArray[i][j];
            }
        }
        System.out.println("Addition of two array.");
        for(int i = 0;i<p;i++){
            for(int j = 0;j<q;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}