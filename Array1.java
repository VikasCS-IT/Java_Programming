import java.util.*;

public class Array1{
    public static void main(String... jdl){
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array");
        int[] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Print array");
        for(int i = 0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){

            if(max < array[i])
                max =array[i];

            if(min > array[i])
                min = array[i];
            
        }
        System.out.println("MAX VALUE = "+max);
        System.out.println("MIN VALUE = "+min);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}