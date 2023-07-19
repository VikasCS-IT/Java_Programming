import java.util.*;

public class ArrayAddition{
    public static void main(String... ads){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter size of first array");
        int n1 = sc.nextInt();
        int[] sum = new int[n1];
        int[] array1 = new int[n1];
        System.out.println("Enter value of first array");
        for(i=0;i<n1;i++){
            array1[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter size of second array");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter value of second array");
        for(i=0;i<n2;i++){
            array2[i] = sc.nextInt();
        }
        System.out.println(); 
        for(j=0;j<n2;j++){
            sum[j] = array1[j] + array2[j];
        }
        System.out.print("Addition of two array is : \n[");
        for(j=0;j<n1;j++){
            System.out.print(sum[j]+",");
        }
        System.out.print("]");

    }
}