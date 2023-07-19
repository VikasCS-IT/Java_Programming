import java.util.*;

public class ArrayTranspose{
    public static void main(String... sh){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array equal to row and colunm");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Enter value of array.");
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print("printing transpose of aaray : \n[");
        // for(int i=0;i<n;i++){
        //     int tmp;
        //     for(int j = 0;j<n;j++){
        //         tmp = array[i][j];
        //         array[i][j] = array[i][j];
        //         array[j][i] = tmp;
        //         System.out.print(array[i][j]+",");
        //     }
        // }
        // System.out.println("]\n");

        for(int[] t:array){
            System.out.println(Arrays.toString(t));
        }
    }
}