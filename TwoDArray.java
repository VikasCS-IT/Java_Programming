import java.util.*;

public class TwoDArray{
    public static void main(String... js){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row");
        int p = sc.nextInt();
        System.out.println("Enter size of column");
        int q = sc.nextInt();
        int[][] array = new int[p][q];
        System.out.println("Array of length "+array.length);
        System.out.println("Length of first array "+array[0].length);
        System.out.println("Length of second array "+array[1].length);
        System.out.println("Enter element of array");
        for(int i = 0;i<p;i++){
            for(int j = 0;j<q;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing you array:=");
        for(int i = 0;i<p;i++){
            for(int j = 0;j<q;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}